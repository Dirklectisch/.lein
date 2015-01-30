{:user {:dependencies [[org.clojure/tools.namespace "0.2.8"]
                       [potemkin "0.3.11"]
                       [alembic "0.3.2"]
                       [criterium "0.4.3"]]
        :plugins [[lein-try "0.4.3"]
                  [lein-pprint "1.1.1"]]
        :repl-options { :init-ns user }
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]}}
        