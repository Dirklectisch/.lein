(ns user
  (:require [potemkin :refer [import-vars]]
            [clojure.main :refer [repl-requires]]
            clojure.tools.namespace.repl
            criterium.core))            

(doall (map (fn [[ns _ _]] (require ns)) repl-requires))

(defn format-import [r]
  (into [] (conj (last r) (first r))))

(eval (conj (map format-import repl-requires) 'import-vars))

(import-vars
  [clojure.tools.namespace.repl
    refresh]
  [criterium.core
    bench
    quick-bench])
