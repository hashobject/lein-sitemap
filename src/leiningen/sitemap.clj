(ns leiningen.sitemap
  "Leiningen plugin to update sitemaps in Google Webmaster Tools."
  (:require [clj-http.client :as http]
            [cemerick.url :as urls]))


(defn update-sitemap [url]
  (let [encoded (urls/url-encode url)
        full-url (str "http://www.google.com/webmasters/tools/ping?sitemap=" encoded)
        resp (http/get full-url)
        msg (str "result for url: " url ". If `status` 200 then everything is ok: " (:status resp))]
    (println msg)
    resp))

(defn sitemap
  "Update sitemaps in Google Webmaster Tools."
  [project & args]
  (let [urls (-> project :sitemaps)]
    (dorun
      (for [url urls]
        (update-sitemap url)))))
