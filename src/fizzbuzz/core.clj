(ns fizzbuzz.core)

(defn fizzbuzz [number]
  (condp = number
      3 "fizz"
      5 "buzz"
      number))
