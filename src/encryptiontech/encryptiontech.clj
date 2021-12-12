(ns encryptiontech.encryptiontech
(:use [tawny.owl])
  (:require [tawny.owl :refer :all]
            [tawny.english]
            [tawny.reasoner :as r]))


(defontology encryption
  :iri "http://www.russet.org.uk/encryptiontech/encryption"
:comment "Describing encryption technique for messaging services")

(r/reasoner-factory :hermit)


(defclass message
  :comment "a message is a bit of data, which is sent by a sender, to a recipient")

(defclass messagingServices)
(as-subclasses
 messagingServices
 :disjoint
 (defclass email
   :comment "is a method of exchanging messages between people using electronic devices")
 (defclass instantMessaging
   :comment "is a type of online chat allowing real-time text transmission over the Internet or another computer network"))

(defclass encryptionTypes)
(as-subclasses
 encryptionTypes
 :disjoint
 (defclass symmetric
   :comment " is a type of encryption where only one key (a secret key) is used to both encrypt and decrypt electronic information ")
 (defclass asymmetric
   :comment "Asymmetric Encryption encrypts and decrypts the data using two separate yet mathematically connected cryptographic keys "))

(defclass publicKeyEncryption
  :comment "is a cryptographic system that uses pairs of keys. Each pair consists of a public key and a private key"
:super asymmetric)

