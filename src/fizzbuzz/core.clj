(ns fizzbuzz.core)

(defn- divisible-by? [number divisor]
  (zero? (mod number divisor)))

(defn- create-rule [divisor replacement]
  (fn [number]
    (if (divisible-by? number divisor) replacement)))

(defn- apply-rules [rules number]
  (apply str ((apply juxt rules) number)))

(defn- perform-substitution [rules number]
  (let [substitute (apply-rules rules number)]
    (if (empty? substitute) number substitute)))

(defn- fizzbuzz-rules []
  [(create-rule 3 "fizz")
   (create-rule 5 "buzz")]

(defn fizzbuzz [number]
    (perform-substitution (fizzbuzz-rules) number)))
	

