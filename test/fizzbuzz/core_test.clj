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

(deftest rule-test
  (let [fizz-rule (create-rule 3 "fizz")
	buzz-rule (create-rule 5 "buzz")]
    (testing "fizz-rule"
      (is (= (fizz-rule 3) "fizz"))
      (is (= (fizz-rule 2) nil)))
    (testing "buzz-rule"
      (is (= (buzz-rule 5) "buzz"))
      (is (= (buzz-rule 3) nil)))))

(deftest fizzbuzz-rules-test
  (let [rules [(create-rule 2 "pineapple")
	       (create-rule 7 "grapefruit")]]
    (is (= (fizzbuzz rules 2) "pineapple"))
    (is (= (fizzbuzz rules 7) "grapefruit"))
    (is (= (fizzbuzz rules 14) "pineapplegrapefruit"))
    (is (= (fizzbuzz rules 3) 3))))