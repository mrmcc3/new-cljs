(ns clj.new.new-cljs
  (:require [clj.new.templates :as tpl]))

(defn new-cljs [name]
  (let [render (tpl/renderer "new-cljs")
        data {:path (tpl/name-to-path name)
              :ns   (tpl/sanitize-ns name)}]
    (tpl/->files data
                 ["deps.edn" (render "deps.edn" data)]
                 ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
                 ["src/{{path}}/app.cljs" (render "app.cljs" data)]
                 ["target/app/index.html" (render "index.html" data)])))
