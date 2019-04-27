(ns todo-clj.main
  (:require [todo-clj.core :as core])
  (:gen-class))


(defn -main [& {:as args}]
  (core/start-server))


