(ns clj-extensions.test.core
  (:use [clj-extensions.core] :reload)
  (:use [clojure.test]))

(deftest test-drop-until
  (is (= [1 2 3] (drop-until pos? [-3 -2 -1 0 1 2 3]))))

(deftest test-take-until
  (is (= [-3 -2 -1 0] (take-until pos? [-3 -2 -1 0 1 2 3]))))
