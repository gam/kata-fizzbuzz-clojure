(ns fizzbuzz.core-test
  (:use [fizzbuzz.core] :reload-all)
  (:use [clojure.test]))

(deftest fizzbuzz-test
  (is (= (fizzbuzz 1) 1))
  (is (= (fizzbuzz 2) 2))
  (is (= (fizzbuzz 3) "fizz"))  
  (is (= (fizzbuzz 5) "buzz"))
  (is (= (fizzbuzz 6) "fizz"))
  (is (= (fizzbuzz 10) "buzz"))
  (is (= (fizzbuzz 15) "fizzbuzz")))
