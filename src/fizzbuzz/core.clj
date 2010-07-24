(ns fizzbuzz.core)

(defn fizzbuzz [number]
  (condp #(zero? (mod %2 %1)) number
      3 "fizz"
      5 "buzz"
      number))