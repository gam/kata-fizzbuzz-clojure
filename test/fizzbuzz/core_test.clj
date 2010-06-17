(ns fizzbuzz.core-test
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (testing "numbers not triggering a substitution"
    (are [number expected]
	 (= (fizzbuzz number) expected)
	 1 1
	 2 2
	 4 4
	 7 7
	 8 8
	 11 11
	 13 13
	 14 14))
  (testing "numbers matching rule divisor return substitution"
    (is (= (fizzbuzz 3) "fizz"))
    (is (= (fizzbuzz 5) "buzz")))
  (testing "numbers matching multiples of rule divisor return substitution"
    (are [number expected]
	 (= (fizzbuzz number) expected)
	 6 "fizz"
	 9 "fizz"
	 10 "buzz"
	 12 "fizz"))
  (testing "numbers matching several rules return concatenation of substitutions"
    (is (= (fizzbuzz 15) "fizzbuzz"))
    (is (= (fizzbuzz 30) "fizzbuzz"))))

(deftest fizzbuzz-rule-test
  (testing "create rules for number substitution"
    (is (= ((create-rule 2 "banananana") 2) "banananana"))
    (is (= ((create-rule 7 "pineapple") 7) "pineapple")))
  (testing "specify rules to control fizzbuzz number substitution"
    (let [rules [(create-rule 2 "banana")
		 (create-rule 7 "pineapple")]]
      (is (= (fizzbuzz 2 rules) "banana"))
      (is (= (fizzbuzz 7 rules) "pineapple"))
      (is (= (fizzbuzz 14 rules) "bananapineapple"))
      (is (= (fizzbuzz 11 rules) 11)))))
