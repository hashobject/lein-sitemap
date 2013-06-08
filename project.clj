(defproject lein-sitemap "0.1.0-SNAPSHOT"
  :description "A leiningen plugin to update sitemaps in Google Webmaster Tools."
  :url "https://github.com/hashobject/lein-sitemap"
  :signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.2"]
                 [com.cemerick/url "0.0.8"]]
  :eval-in-leiningen true)
