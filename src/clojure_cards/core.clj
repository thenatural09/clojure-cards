(ns clojure-cards.core
  (:gen-class))

(def suits [:clubs :spades :hearts :diamonds])
(def ranks (range 1 14))

(defn create-deck[]
  (set
    (for [suit suits
          rank ranks]
        {:suit suit :rank rank})))

(defn create-hands [deck]
  (set
    (for [c1 deck
          c2 (disj deck c1)
          c3 (disj deck c1 c2)
          c4 (disj deck c1 c2 c3)]
         #{c1 c2 c3 c4})))

(defn flush? [hand])

(defn -main [& args]
  (let [deck (create-deck)
        hands(create-hands deck)]
    (println (count hands))))
  

