(ns fizzbuzz.core)

(defn divisible-by [divisor number]
  (zero? (mod number divisor)))

(defn create-rule [divisor replacement]
  (fn [number]
    (when (divisible-by divisor number) replacement)))

(defn fizzbuzz [number]
  (condp divisible-by number
    15 "fizzbuzz"
    3 "fizz"
    5 "buzz"
    number))