(ns pipes.fn.reverse
  (:gen-class
    :implements [java.io.Serializable com.hazelcast.jet.function.DistributedFunction]))

(defn -apply [this input]
  (reverse input))
