(ns clj.new.new-cljs
  (:require [clj.new.templates :refer [renderer project-name name-to-path ->files]]))

(def render (renderer "new-cljs"))

(defn new-cljs [name]
  (let [data {:name (project-name name)
              :sanitized (name-to-path name)}]
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
             ["src/{{sanitized}}/app.cljs" (render "app.cljs" data)]
             ["target/app/index.html" (render "index.html" data)])))
