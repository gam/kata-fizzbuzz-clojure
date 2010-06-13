(ns fizzbuzz.core)

(defn- divisible-by? [number divisor]
  (zero? (mod number divisor)))

(defn fizzbuzz [number]
  (cond
   (divisible-by? number 15) "fizzbuzz"
   (divisible-by? number 3) "fizz"
   (divisible-by? number 5) "buzz"
   :else number))