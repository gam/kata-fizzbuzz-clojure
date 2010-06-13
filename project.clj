(defproject fizzbuzz "1.0.0-SNAPSHOT"
  :description "The FizzBuzz Kata: 
    Write a program that prints the numbers from 1 to 100. 
    But for multiples of three print "Fizz" instead of the number 
    and for the multiples of five print "Buzz". 
    For numbers which are multiples of both three and five print 'FizzBuzz'.

    A further requirement for the kata: 
    The FizzBuzz generator should be programmable; introducing new 
    substitutions should be as simple as introducing a new rule.

    As an example, expand the FizzBuzz generator with the following behaviour:
    Numbers divisible by two are replaced by 'coconut' and numbers divisible 
    by seven are replaced by 'banana'."
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
		     [clojure-refactoring "0.1.5"]])