(ns fizzbuzz.core)

(defn- divisible-by [divisor number]
  (zero? (mod number divisor)))

(defn create-rule [divisor replacement]
  (fn [number]
    (when (divisible-by divisor number) replacement)))

(defn- apply-rules [rules number]
  (let [replacement (apply str ((apply juxt rules) number))]
    (if (empty? replacement) number replacement)))
  
(defn- fizzbuzz-rules []
  [(create-rule 3 "fizz")
   (create-rule 5 "buzz")])

(defn fizzbuzz
  ([number]
     (fizzbuzz (fizzbuzz-rules) number))
  ([rules number]
     (apply-rules rules number)))

