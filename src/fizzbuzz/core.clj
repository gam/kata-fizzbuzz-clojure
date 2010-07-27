(ns fizzbuzz.core)

(defn- divisible-by [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz [number]
  (condp divisible-by number
      3 "fizz"
      5 "buzz"
      number))
