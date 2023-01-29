(ns two-fer
	(:require [clojure.string :as str]))

(defn two-fer [name]                                        ;; <- arglist goes here
	;; your code goes here
	(if (str/blank? name)
		(str ))
	)
