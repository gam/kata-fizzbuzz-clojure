(ns fizzbuzz.core)

(defn- is-divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn create-rule [divisor replacement]
  (fn [number]
    (if (is-divisible-by? divisor number) replacement)))

(defn- create-fizzbuzz-rules []
  [(create-rule 3 "fizz")
   (create-rule 5 "buzz")])

(defn- apply-rules [rules number]
  (apply str ((apply juxt rules) number)))

(defn fizzbuzz
  ([number]
     (fizzbuzz number (create-fizzbuzz-rules)))
  ([number rules]
     (let [replacement (apply-rules rules number)]
       (if (empty? replacement) number replacement))))

