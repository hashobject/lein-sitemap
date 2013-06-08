(ns leiningen.sitemap
  "Library for updating sitemaps in Google Webmaster Tools."
  (:require [clojure.string :as string]
            [clj-http.client :as http]
            [cemerick.url :as urls]))



(defn update-sitemap [url]
  (let [encoded (urls/url-encode url)
        full-url (str "http://www.google.com/webmasters/tools/ping?sitemap=" encoded)
        resp (http/get full-url)]
    (println "result for url: " url ". Status 200 if ok"(:status resp))
    resp))

(defn sitemap
  "Update sitemaps in Google Webmaster Tools."
  [project & args]
  (let [urls (-> project :sitemaps)]
    (println "urls" urls)
    (dorun
      (for [url urls]
        (update-sitemap url)))))
