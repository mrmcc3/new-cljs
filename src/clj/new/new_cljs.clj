(ns clj.new.new-cljs
  (:require [clj.new.templates :as tpl]))

(defn new-cljs [name]
  (let [name (tpl/project-name name)
        render (tpl/renderer "new-cljs")
        data {:name name :sanitized (tpl/name-to-path name)}]
    (tpl/->files data
             ["deps.edn" (render "deps.edn" data)]
             ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
             ["src/{{sanitized}}/app.cljs" (render "app.cljs" data)]
             ["target/app/index.html" (render "index.html" data)])))
