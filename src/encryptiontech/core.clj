(ns encryptiontech.core
  [:use [tawny.owl]]
  [:require [encryptiontech.encryptiontech]])


(defn -main [& args]
  (save-ontology encryptiontech.encryptiontech/encryptiontech "encryptiontech.omn"))
