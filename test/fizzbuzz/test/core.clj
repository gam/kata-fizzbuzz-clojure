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
    (testing "coconut rule"
      (are [number expected]
	   (= (coconut-rule number) expected)
	   2 "coconut"
	   4 "coconut"
	   14 "coconut"))
    (testing "banana rule"
      (are [number expected]
	   (= (banana-rule number) expected)
	   7 "banana"
	   14 "banana"))))

(deftest fizzbuzz-rules-test
  (let [rules [(create-rule 2 "coconut")
	       (create-rule 7 "banana")]]
    (is (= (fizzbuzz rules 2) "coconut"))))