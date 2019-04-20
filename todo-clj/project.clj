(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] 
                 [ring "1.7.1"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [environ "1.0.1"]]
  :plugins [[lein-environ "1.0.1"]]
  :profiles {:dev {:dependencies [[prone "1.6.1"]]
                   :env {:dev true}}}
  
  )
