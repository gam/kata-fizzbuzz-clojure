(ns fizzbuzz.test.core
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (are [number expected] (= (fizzbuzz number) expected)
       1 1 
       2 2
       3 "fizz"
       5 "buzz"
       6 "fizz"
       10 "buzz"
       15 "fizzbuzz"))

(deftest rule-test
  (let [coconut-rule (create-rule 2 "coconut")
	banana-rule (create-rule 7 "banana")]
    (is (= (coconut-rule 2) "coconut"))
    (is (= (coconut-rule 4) "coconut"))
    (is (= (banana-rule 7) "banana"))
    (is (= (banana-rule 14) "banana"))
    (is (= (coconut-rule 14) "coconut"))))