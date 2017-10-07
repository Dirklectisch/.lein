{:user {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                       [potemkin "0.4.3"]
                       [alembic "0.3.2"]
                       [criterium "0.4.4"]]
        :plugins [[lein-try "0.4.3"]
                  [lein-pprint "1.1.2"]
                  [lein-ancient "0.6.12"]]
        :repl-options { :init-ns user}
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]}}
