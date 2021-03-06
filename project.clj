(defproject org.clojure/core.logic "0.8.7-SNAPSHOT"
  :description "A logic/relational programming library for Clojure"
  :parent [org.clojure/pom.contrib "0.0.25"]

  :jvm-opts ^:replace ["-Xmx512m" "-server"]

  :source-paths ["src/main/clojure"]

  :test-paths ["src/test/clojure"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2197" :scope "provided"]
                 [org.clojure/tools.macro "0.1.2"]
                 [com.datomic/datomic-free "0.8.4270" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src/test/cljs"]
     :compiler {:optimizations :none
                :static-fns true
                :output-to "tests.js"
                :output-dir "out"
                :source-map "tests.js.map"}}
    {:id "adv"
     :source-paths ["src/main/clojure/cljs" "src/test/cljs"]
     :compiler {:optimizations :advanced
                :pretty-print false
                :output-to "tests.js"}}]})
