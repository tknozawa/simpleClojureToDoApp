(ns todo-clj.util.response
  (:require [potemkin :as p]
            [ring.util.http-response :as res]))

;(def response #'res/response)

;(alter-meta! #'response #(merge % (meta #'res/response)))

(defmacro import-ns [ns-sym]
  (do
    `(p/import-vars
       [~ns-sym
        ~@(map first (ns-publics ns-sym))])))

(import-ns ring.util.http-response)


(defn html [res]
  (res/content-type res "text/html; charset=utf-8"))

;(def redirect #'res/redirect)
;(alter-meta! #'redirect #(merge % (meta #'res/redirect)))

