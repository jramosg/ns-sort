(ns
  ^{:author "Jon Ramos",
    :doc "This file sorts namespaces."}
  ns-sort.core
  (:gen-class))

(defn sort-ns
  "Returns required namespaces sorted.
  `ns`: required namespaces as '(:require [ns1] [ns2])"
  [ns]
  (concat '(:require)
          (->> ns
               (drop 1)
               (map pr-str)
               (sort)
               (map read-string)
               (distinct))))
