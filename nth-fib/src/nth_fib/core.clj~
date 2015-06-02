(ns nth-fib.core
  (:gen-class))

(defn nth-fib [n]
  (loop [n1 0 n2 1 i 2]
    (if (<= i n)
      (recur n2 (+ n1 n2) (inc i))
      (do (println "nth fib number:")
        (println n2)
      )
    )	
  )
)

(defn -main [& args]
  (println "Enter n")
  (let [n (read-string (read-line))]
    (nth-fib n)
  ) 
)  
