# lein-sitemap

Leiningen plugin to resubmit sitemaps in Google Webmaster Tools.

See Google [documentaion](http://support.google.com/webmasters/bin/answer.py?hl=en&answer=183669) about resubmitting sitemaps.

## Usage


To use this for project-level plugins please do next steps.

Put `[lein-sitemap "0.1.1"]` into the ':plugins' vector of your project.clj.

Add list of sitemaps URLs you want to submit to Google Webmaster Tools
into the ':sitemaps' vector of your project.clj. E.x.

```
  :sitemaps ["http://blog.hashobject.com/sitemap.xml"]
```

Then just run

```
  lein sitemap
```

You should get status code 200 for each successful sitemap submission.

## License

Copyright © 2013 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).