(ns encryptiontech.encryptiontech-test
    (:use [clojure.test])
    (:require
     [encryptiontech.encryptiontech :as ont]
     [tawny.owl :as o]
     [tawny.reasoner :as r]
     [tawny.fixture :as f]))

(use-fixtures :each (f/reasoner :hermit))

(deftest reasonable
  (is (r/consistent? ont/encryption))
  (is (r/coherent? ont/encryption)))
