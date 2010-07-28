(ns fizzbuzz.core)

(defn fizzbuzz [number]
  (cond
   (= number 3) "fizz"
   (= number 5) "buzz"
   true number))