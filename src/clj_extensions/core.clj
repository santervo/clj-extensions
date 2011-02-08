(ns clj-extensions.core)

(defn take-until [predicate coll]
  (take-while #(not (predicate %)) coll))

(defn drop-until [predicate coll]
  (drop-while #(not (predicate %)) coll))

