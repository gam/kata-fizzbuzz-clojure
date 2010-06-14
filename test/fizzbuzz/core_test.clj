(ns fizzbuzz.core-test
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (are [number expected]
       (= (fizzbuzz number) expected)
       1 1
       2 2
       3 "fizz"
       4 4
       5 "buzz"
       6 "fizz"
       7 7
       8 8
       9 "fizz"
       10 "buzz"
       11 11
       12 "fizz"
       13 13
       14 14
       15 "fizzbuzz"))

(deftest single-rule-test
  (is (= ((create-rule 2 "coconut") 2) "coconut"))
  (is (= ((create-rule 7 "pineapple") 7) "pineapple")))

(deftest multiple-rules-test
  (let [rules [(create-rule 2 "coconut")
	       (create-rule 7 "pineapple")]]
    (are [number expected]
	 (= (fizzbuzz number rules) expected)
	 2 "coconut"
	 7 "pineapple"
	 14 "coconutpineapple"
	 3 3)))


