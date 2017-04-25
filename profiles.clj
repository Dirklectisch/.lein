{:user {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                       [potemkin "0.4.3"]
                       [alembic "0.3.2"]
                       [criterium "0.4.4"]]
        :plugins [[lein-pprint "1.1.2"]]
        :repl-options { :init-ns user}
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]}}
