

(ns todo-clj.db
  (:require [clojure.java.jdbc :as jdbc]
            [environ.core :refer [dev]]
  ))

(def db-spec
  (:db env))

;(def db-spec
;  {:dbtype "postgresql" 
;   :dbname "todo_clj_dev" 
;   :host "localhost" 
;   :port 5432 
;   :user "Takapons" 
;   :password "password"
;   })

(defn migrated? []
  (pos? (count (jdbc/query db-spec "select tablenam from pg_tables where schemanam = 'public'"))))

(defn migrate []
  (when-not(migrated?)
    (jdbc/db-do-commands
      db-spec
      (jdbc/create-table-ddl :todo [:id :serial] [:title :varchar]))))



(defn testfn []
  (println 123)
  )


