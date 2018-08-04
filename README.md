# new-cljs

A minimal clojurescript clj-new template

## Usage

add to `~/.clojure/deps.edn` aliases

```clojure
:aliases {
  :mrmcc3/new-cljs {:extra-deps {seancorfield/clj-new {:git/url "https://github.com/seancorfield/clj-new" :sha "108f27159501f8ce12564b398b0ea50def3892b1"}}
                    :main-opts ["-m" "clj-new.create" "https://github.com/mrmcc3/new-cljs@bc6f84f5d1f1d88ed0d691e656e13ed6b782f8a6"]}
}
```
then

`clj -Amrmcc3/new-cljs project-name`

## License

Copyright © 2018 Michael McClintock

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
