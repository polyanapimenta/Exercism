(ns cars-assemble)

(defn some-range?
	([speed start]
	 (= start speed))

	([speed start end]
	 (and (>= speed start) (<= speed end))))

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
	(let [rate (cond
							 (some-range? speed 0)   0
							 (some-range? speed 1 4) 1
							 (some-range? speed 5 8) 0.9
							 (some-range? speed 9)   0.8
							 (some-range? speed 10)  0.77)]
		(double (* 221 speed rate))))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
	(-> (production-rate speed)
			(/ 60)
			int))
