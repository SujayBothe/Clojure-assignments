(ns reverse-binary.core
  (:gen-class))

(defn exp [n]
  (if (= n 0) 1
    (do (if (= n 1) 2 (reduce * (repeat n 2))))
  )
)

(defn convert_to_decimal [bin n]
  (loop [i (- (count bin) 1) j 0 sum 0]	
    (if (< j (count bin))
      (recur (dec i) (inc j) 
        (+ sum (* (exp j) (get bin i))))
      (do
        (println "Reverse Binary number:")	
	(println sum)
      )
    )	
  )
)

(defn convert_to_binary [n]
  (loop [i n bin []]
    (if (not= i 0)	
      (recur (if (= (rem i 2) 0) (/ i 2) (/ (- i 1) 2)) 
        (conj bin (rem i 2)))
      (do (println "Binary representation of number:")
        (println bin)
	(convert_to_decimal bin n)
      )
    )
  )		
)

(defn -main [& args]
  (println "Enter the number:")
  (let [n (read-string (read-line))]
  	(convert_to_binary n)	
  )
)
  
