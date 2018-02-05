(ns realtime.p1
    (:gen-class
      :implements [java.io.Closeable]
      :extends com.hazelcast.jet.core.AbstractProcessor))

(defn -init [this context])

(defn -tryProcess [this & object]
 (if (not (nil? object))
  (println ">> >>" object))
 true)

(defn -close[this]
  (println "> closing..."))
