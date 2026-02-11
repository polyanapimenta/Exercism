(ns interest-is-interesting)

(defn interest-rate
  "TODO: add docstring"
  [balance]
	(cond
		(neg? balance) -3.213
		(< balance 1000) 0.5
		(< balance 5000) 1.621
		:else 2.475))

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
	(let [rate (bigdec (interest-rate balance))]
		(if (neg? rate)
			(bigdec (- balance (* (/ rate 100) balance)))
			(bigdec (+ balance (* (/ rate 100) balance))))))

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
	(if (neg? balance)
		0
		(int (* balance (/ tax-free-percentage 100) 2))))
