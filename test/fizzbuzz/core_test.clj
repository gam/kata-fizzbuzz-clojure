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
  (let [rule (create-rule 2 "popcorn")]
    (is (= (rule 2) "popcorn"))))

(deftest apply-multiple-rules-test
  (let [rules [(create-rule 2 "popcorn")
	       (create-rule 7 "pineapple")]]
    (are [number expected]
	 (= (apply-rules rules number) expected)
	 7 "pineapple"
	 2 "popcorn"
	 3 3
	 14 "popcornpineapple")))
