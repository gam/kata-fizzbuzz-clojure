(ns fizzbuzz.core)

(defn- is-divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz [number]
  (condp is-divisible-by? number
    3 "fizz"
    5 "buzz"
    number))