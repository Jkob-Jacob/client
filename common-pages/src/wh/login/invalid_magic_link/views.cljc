(ns wh.login.invalid-magic-link.views
  (:require [wh.components.auth :as auth]
            [wh.routes :as routes]
            [wh.styles.register :as styles]))

(defn page []
  [auth/page
   [auth/card {:type :invalid-link}
    [auth/title "Invalid link"]
    [:div
     [auth/paragraph
      "Your login link is invalid"]
     [auth/paragraph
      [auth/link {:text "Try login again"
                  :href (routes/path :login :params {:step :email})}]]]
    [:img {:src "/images/hiw/candidate/benefits/benefit2.svg"
           :class styles/invalid-link-image
           :width 220
           :height 165}]]])
