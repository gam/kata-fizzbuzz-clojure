(ns fizzbuzz.core)

(def *fizzbuzz-rules*
  [(create-rule 3 "fizz")
   (create-rule 5 "buzz")])

(defn- is-divisible-by [divisor number]
  (zero? (mod number divisor)))

(defn- apply-rules [rules number]
  (apply str ((apply juxt rules) number)))

(defn create-rule [divisor replacement]
  (fn [number]
    (when (is-divisible-by divisor number) replacement)))

(defn fizzbuzz
  ([number]
     (fizzbuzz *fizzbuzz-rules* number))
  ([rules number]
     (let [replacement (apply-rules rules number)]
       (if (empty? replacement) number replacement))))


