(ns fizzbuzz.core)

(defn- is-divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz
  ([number]
     (condp is-divisible-by? number
       (* 3 5) "fizzbuzz"
       3 "fizz"
       5 "buzz"
       number))
  ([number rules]
     (let [replacement (apply rules number)]
       (if (empty? replacement) number replacement))))

(defn create-rule [divisor replacement]
  (fn [number]
    (if (is-divisible-by? divisor number) replacement number)))
