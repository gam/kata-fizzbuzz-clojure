(ns fizzbuzz.test.core
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (is (= (fizzbuzz 1) 1) "one is one")
  (is (= (fizzbuzz 2) 2) "two is two")
  (are [number expected] (= (fizzbuzz number) expected)
   1 1
   2 2))
