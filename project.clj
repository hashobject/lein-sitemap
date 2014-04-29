(defproject lein-sitemap "0.1.1"
  :description "Leiningen plugin to update sitemaps in Google Webmaster Tools."
  :url "https://github.com/hashobject/lein-sitemap"
  :signing {:gpg-key "Hashobject Ltd <team@hashobject.com>"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "0.9.1"]
                 [com.cemerick/url "0.1.1"]]
  :eval-in-leiningen true)
