(ns todo-clj.core
  (:require [ring.adapter.jetty :as server]))

(defonce server (atom nil))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Helloooo World!!!!!! this is awesome men"})

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'handler {:port 3000 :join? false}))))

(defn stop-server []
  (when @server
    (.stop @server)
    (reset! server nil)))

(defn restart-server []
  (when @server
    (stop-server)
    (start-server)))



