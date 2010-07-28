(ns fizzbuzz.test.core
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (are [number expected] (= (fizzbuzz number) expected)
       1 1
       2 2
       3 "fizz"
       5 "buzz"
       6 "fizz"))
