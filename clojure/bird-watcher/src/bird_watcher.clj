(ns bird-watcher)

(def last-week 
  (vector 0, 2, 5, 3, 7, 8, 4))

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
	(let [index (- (count birds) 1)]
		(->> (today birds)
				 inc
				 (assoc birds index))))

(defn day-without-birds? [birds]
	(some? (some zero? birds)))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
	(count (filter #(>= % 5) birds)))

(defn odd-week? [birds]
  (= birds [1 0 1 0 1 0 1]))
