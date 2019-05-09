{:user {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                       [potemkin "0.4.5"]
                       [criterium "0.4.5"]]
        :plugins [[lein-try "0.4.3"]
                  [lein-pprint "1.2.0"]
                  [lein-ancient "0.6.15"]]
        :repl-options { :init-ns user}
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]}}
