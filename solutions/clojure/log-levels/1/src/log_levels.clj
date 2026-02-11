(ns log-levels
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
	(str/trim
		(str/replace s (re-pattern "\\[.*\\]: ") "")))

(defn log-level
  "Takes a string representing a log line
   and returns its level in lower-case."
  [s]
	(str/lower-case
		(last (re-find (re-pattern "\\[(.*)\\]") s))))

(defn reformat
  "Takes a string representing a log line and formats it
   with the message first and the log level in parentheses."
  [s]
	(str (message s)
			 (format " (%s)" (log-level s))))
