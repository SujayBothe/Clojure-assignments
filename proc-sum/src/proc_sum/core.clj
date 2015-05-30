(ns proc-sum.core
  (:gen-class))

(defn ft [n]
	(/ n 4))

(defn st [n a]
	(+ (- (* 2 a) 1) n))

(defn tt [n a]
	(+ (- (+ (- (* 2 a a)  (* 2 a)) (* 2 a n)) n) (* n n)))

(defn procsum [start_int end_int] 
	
	(def sum (/ (* (+ (- end_int start_int) 1) (+ start_int end_int)) 2)) ;(n(a1+a2)/2)
	(println "sum:")
	(println sum) 
	
	(def a start_int)
	(def n (+ (- end_int start_int) 1))
	(def sum (* (ft n) (st n a) (tt n a)))
	(println "sum of cubes:")
	(println sum) 
)

(defn -main [& args]
	(println "Enter start integer and end integer")	
	(let [start_int (read-string (read-line)) end_int (read-string (read-line))]
  		(procsum start_int end_int)
  )
)
