(ns wh.verticals
  (:require
    [clojure.set :as set]
    [clojure.string :as str]))

(def ordered-job-verticals ["functional" "blockchain" "javascript" "ai" "golang" "java" "python"])
(def ordered-blog-verticals ["functional" "blockchain" "javascript" "ai" "golang" "java" "python" "www"])

;;This should be used to allow admins to publish job for future verticals.
;; You also need to make sure that the vertical is added to grapql spec
(def future-job-verticals (set ordered-job-verticals))
(def future-blog-verticals (set ordered-blog-verticals))

(def all-verticals (set/union future-job-verticals future-blog-verticals))

(def available-job-verticals (set ordered-job-verticals))
(def available-blog-verticals (set ordered-blog-verticals))

(def default-vertical "functional")

(def vertical-config
  {"functional"
   {:platform-name         "Functional Works"
    :label-name            "Functional programming"
    :description           "Browse functional programming jobs, salaries, blogs and learning resources! Scala jobs, Clojure jobs, Haskell jobs and more."
    :blog-description      "A curated blog on functional programming. Read news, posts and opinions from the community - we have FP covered."
    :twitter               "@functionalworks"
    :linkedin              "https://www.linkedin.com/company/3504222/"
    :default-technologies  ["Clojure" "Haskell" "Scala" "Erlang" "F#" "OCaml"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/functional-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/functional-works-15-minute-demo"
    :footer-job-links      ["Scala" "Clojure" "Haskell" "OCaml" "Elixir" "Elm" "Erlang"]
    :footer-article-links  ["Scala" "Clojure" "Haskell" "F#" "Elixir" "Erlang"]
    :jobsboard-header      {:title       "Functional Programming Jobs"
                            :subtitle    "Browse jobs for software engineers and developers"
                            :description "Look for front-end, full-stack and backend roles working with functional programming"}
    :jobsboard-tag-desc    {"scala"    "Look for backend and full-stack roles working with Scala, Akka, Play, Kafka and more"
                            "clojure"  "Look for backend and full-stack roles working with Clojure, Clojurescript and more"
                            "haskell"  "Look for backend roles working with Haskell"
                            "ocaml"    "Look for backend roles working with OCaml"
                            "elm"      "Look for front-end and full-stack roles working with Elm"
                            "reasonml" "Look for front-end and full-stack roles working with ReasonML"}}
   "blockchain"
   {:platform-name         "Blockchain Works"
    :label-name            "Blockchain"
    :description           "Browse blockchain news, jobs, salaries and learning resources! Jobs in the United States, UK and more."
    :blog-description      "A curated blog on blockchain technology. Read news, posts and opinions from the community - we have blockchain covered."
    :twitter               "@blockchainworks"
    :linkedin              "https://www.linkedin.com/company/blockchainworks/"
    :default-technologies  ["Ethereum" "Java" "Go" "C++" "Compliance" "Product" "Haskell"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/blockchain-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/blockchain-works-15-minute-demo"
    :footer-job-links      ["Blockchain" "Solidity" "Blockchain product" "Quant"]
    :footer-article-links  ["Blockchain" "Solidity" "Ethereum"]
    :jobsboard-header      {:title       "Blockchain Jobs"
                            :subtitle    "Browse a wide range of roles working with blockchain products"
                            :description "Look for product manager jobs, blockchain developer jobs, analyst & financial jobs and more"}
    :jobsboard-tag-desc    {"blockchain" "Look for front-end, full-stack and backend roles working with blockchain technology"
                            "quant"      "Look backend roles working in quantitative technology"
                            "solidity"   "Look for developer roles working with Solidity"}}
   "javascript"
   {:platform-name         "JavaScript Works"
    :label-name            "Javascript"
    :description           "Browse javascript jobs, salaries, blogs and learning resources! Jobs in the United States, UK and more."
    :blog-description      "A curated blog on JavaScript tech. Read news, posts and opinions from the community - we have JavaScript covered."
    :twitter               "@javascriptworks"
    :linkedin              "https://www.linkedin.com/company/javascriptworks/"
    :default-technologies  ["JavaScript" "React" "Angular" "Vue" "Node" "CSS"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/javascript-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/javascript-works-15-minute-demo"
    :footer-job-links      ["React" "Angular" "NodeJS" "Typescript"]
    :footer-article-links  ["React" "Angular" "NodeJS" "Typescript" "ReasonML"]
    :jobsboard-header      {:title       "JavaScript Jobs"
                            :subtitle    "Browse jobs for UI/UX, web developers and software engineers"
                            :description "Look for front-end, full-stack and backend roles working with JavaScript"}
    :jobsboard-tag-desc    {"angular"    "Look for front-end and full-stack roles working with Angular"
                            "react"      "Look for front-end and full-stack roles working with React"
                            "nodejs"     "Look for backend and full-stack roles working with NodeJS"
                            "typescript" "Look for front-end and full-stack roles working with Typescript"}}
   "ai"
   {:platform-name         "Ai Works"
    :label-name            "Artificial Intelligence"
    :description           "Browse artificial intelligence, machine learning, deep learning jobs and learning resources! Put your Python, R, Spark and Scala skills to work. Jobs in the US, UK and multiple locations."
    :blog-description      "A curated blog on artificial intelligence, machine learning, deep learning and related topics."
    :twitter               "@AIWorksBot"
    :linkedin              "https://www.linkedin.com/company/aiworks/"
    :default-technologies  ["Data Science" "Data Engineering" "Machine Learning" "Python" "Spark" "Scala" "Java" "R"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/ai-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/ai-works-15-minute-demo"
    :footer-job-links      ["Data Science" "Data Engineering" "Machine learning" "Artificial Intelligence"]
    :footer-article-links  ["Data Science" "Machine learning" "Artificial Intelligence"]
    :jobsboard-header      {:title       "AI Jobs"
                            :subtitle    "Browse jobs working within the field of Artificial Intelligence"
                            :description "Look for data science, data engineering, machine learning roles working with Python, R, Scala, Spark and many more"}
    :jobsboard-tag-desc    {"data science"            "Look for Data Science roles working with Python, R, Scala, Spark and more"
                            "data engineering"        "Look for Data Engineering roles working with Python, R, Scala, Spark and more"
                            "artificial intelligence" "Look for Artificial Intelligence roles working with NLP, Neural Networks and more"
                            "machine learning"        "Look for Machine Learning roles working with Python, R, Tensorflow and more"}}
   "golang"
   {:platform-name         "Golang Works"
    :label-name            "Golang"
    :description           "Browse Golang jobs, salaries, blogs and learning resources!"
    :blog-description      "A curated blog on Golang. Read news, posts and opinions from the community - we have Golang covered."
    :twitter               "@golangworks"
    :linkedin              "https://www.linkedin.com/company/18608798/"
    :default-technologies  ["Go" "Java" "Spark" "Python" "SQL" "Distributed Systems"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/golang-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/golang-works-15-minute-demo"
    :footer-job-links      ["Go"]
    :footer-article-links  ["Golang"]
    :jobsboard-header      {:title       "Golang Jobs"
                            :subtitle    "Browse jobs for software engineers and developers"
                            :description "Look for a wide range of roles working with Golang"}
    :jobsboard-tag-desc    {"golang" "Look for Golang developer roles working with Docker, Kubernetes and more"}}
   "java"
   {:platform-name         "Java Works"
    :label-name            "Java"
    :description           "Browse Java developer jobs, salaries, blogs and learning resources! Java jobs, articles and more."
    :blog-description      "A curated blog on Java programming. Read news, posts and opinions from the community - we have Java covered."
    :twitter               "@Java_workshub"
    :linkedin              "https://www.linkedin.com/company/javaworks"
    :default-technologies  ["Java" "Play" "Kafka" "Akka" "Spring"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/java-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/java-works-15-minute-demo"
    :footer-job-links      ["Java" "Play" "Kafka" "Akka"]
    :footer-article-links  ["Java" "Akka" "Kafka"]
    :jobsboard-header      {:title       "Java Developer Jobs"
                            :subtitle    "Browse jobs for software engineers and developers"
                            :description "Look for full-stack and backend roles working with Java"}
    :jobsboard-tag-desc    {"play"  "Look for backend and full-stack roles working with the Play framework"
                            "kafka" "Look for backend roles working with Apache Kafka"
                            "akka"  "Look for backend roles working with Akka"}}
   "python"
   {:platform-name         "Python Works"
    :label-name            "Python"
    :description           "Browse Python programming jobs, salaries, blogs and learning resources! Python jobs, Flask jobs, Ansible jobs and more."
    :blog-description      "A curated blog on the Python programming language. Read news, posts and opinions from the community - we have Python covered."
    :twitter               "@python_works"
    :linkedin              "https://www.linkedin.com/company/3504222/"
    :default-technologies  ["Python" "Django" "Ansible" "Numpy" "SciPy" "Scikit-Learn" "Pandas"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/python-works-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/python-works-15-minute-demo"
    :footer-job-links      ["Python" "Django" "Ansible"]
    :footer-article-links  ["Python"]
    :jobsboard-header      {:title       "Python Developer Jobs"
                            :subtitle    "Browse jobs for software engineers and developers"
                            :description "Look for full-stack and backend roles working with Python"}
    :jobsboard-tag-desc    {"django"  "Look for backend and full-stack roles working with Django"
                            "ansible" "Look for DevOps roles working with Ansible"}}
   "www"
   {:platform-name         "WorksHub"
    :label-name            "WorksHub"
    :description           "Through open-source contributions we generate objective ratings to help you hire the right engineers, faster"
    :twitter               "@workshub"
    :linkedin              "https://www.linkedin.com/company/workshub"
    :default-technologies  ["Python" "Clojure" "Java" "Go" "Data Science" "AI" "JavaScript" "Blockchain" "Scala" "Haskell" "React"]
    :take-off-meeting-link "https://app.hubspot.com/meetings/workshub/workshub-take-off"
    :demo-link             "https://app.hubspot.com/meetings/workshub/15-minute-demo"
    :jobsboard-header      {:title       "Software Engineering and Software Developer Jobs"
                            :subtitle    "Browse jobs for developers working across a wide range of technologies"
                            :description "Look for front-end, full-stack and backend roles"}
    }})

(defn config [vertical k]
  (get-in vertical-config [vertical k]))
