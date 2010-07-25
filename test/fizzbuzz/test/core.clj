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
	banana-rule  (create-rule 7 "banana")]
    (is (= (coconut-rule 2) "coconut"))
    (is (= (banana-rule 7) "banana"))))

(deftest fizzbuzz-rule-test
  (let [rules [(create-rule 2 "coconut")
	       (create-rule 7 "banana")]]
    (is (= (fizzbuzz rules 2) "coconut"))
    (is (= (fizzbuzz rules 7) "banana"))
    (is (= (fizzbuzz rules 8) "coconut"))
    (is (= (fizzbuzz rules 3) 3))
    (is (= (fizzbuzz rules 14) "coconutbanana")))) 