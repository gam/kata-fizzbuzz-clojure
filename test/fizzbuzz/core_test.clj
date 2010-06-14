(ns fizzbuzz.core-test
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  "Tests for the fizzbuzz resolver:
  For multiples of 3, return 'fizz'.
  For multiples of 5, return 'buzz'.
  For multiples of 3 AND 5, return 'fizzbuzz'."
  (is (= (fizzbuzz 1) 1))
  (is (= (fizzbuzz 2) 2))
  (is (= (fizzbuzz 3) "fizz"))  
  (is (= (fizzbuzz 5) "buzz"))
  (is (= (fizzbuzz 6) "fizz"))
  (is (= (fizzbuzz 10) "buzz"))
  (is (= (fizzbuzz 15) "fizzbuzz")))

