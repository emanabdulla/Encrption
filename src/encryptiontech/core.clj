(ns encryptiontech.core
  [:use [tawny.owl]]
  [:require [encryptiontech.encryptiontech]])


(defn -main [& args]
  (save-ontology encryptiontech.encryptiontech/encryption "encryptiontech.omn"))
