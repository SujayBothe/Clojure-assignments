(ns proc-sum.core
  (:gen-class))

(defn ft [n]
	(/ n 4))

(defn st [n a]
	(+ (- (* 2 a) 1) n))

(defn tt [n a]
	(+ (- (+ (- (* 2 a a)  (* 2 a)) (* 2 a n)) n) (* n n)))

(defn sum [start_int end_int f]
  (if (= f 0)
    (/ (* (+ (- end_int start_int) 1) (+ start_int end_int)) 2)
    (let [n (+ (- end_int start_int) 1)]	
      (* (ft n) (st n start_int) (tt n start_int))
    )
  )    
)

(defn procsum [start_int end_int] 
  (let [sum1 (sum start_int end_int 0) 
        sum2 (sum start_int end_int 1)]   ;(n(a1+a2)/2)
    (printf "sum:%d" sum1)
    (printf "\nsum of cubes")
    (println sum2)
  ) 
)

(defn -main [& args]
  (println "Enter start integer and end integer")	
  (let [start_int (read-string (read-line)) 
	end_int (read-string (read-line))]
    (procsum start_int end_int)
  )
)
