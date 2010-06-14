(ns fizzbuzz.core)

(defn- is-divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn- fizzbuzz-rules []
  [(create-rule 3 "fizz")
   (create-rule 5 "buzz")])

(defn fizzbuzz
  ([number]
     (fizzbuzz number (fizzbuzz-rules)))
  ([number rules]
     (apply-rules rules number)))

(defn create-rule [divisor replacement]
  (fn [number]
    (if (is-divisible-by? divisor number) replacement)))

(defn apply-rules [rules number]
  (let [replacement (apply str ((apply juxt rules) number))]
    (if (empty? replacement) number replacement)))