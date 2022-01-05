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
(defclass software
:comment "")

(defclass communicationSoftware)
(as-subclasses
 communicationSoftware
 :disjoint
 (defclass email
   :comment "is a method of exchanging messages between people using electronic devices")
 (defclass instantMessaging
   :comment "is a type of online chat allowing real-time text transmission over the Internet or another computer network")
(defclass conferencApp
:comment ""))

(defclass threats
  :comment "potential cause of an unwanted incident, which may result in harm to a system or organization")
(as-subclasses
 threats
 :disjoint
 
(defclass appThreats
:comment ""))



(defclass malware
   :comment "software that is intentionally included or inserted in a system for a harmful purpose")
 (defclass zoomBombing
:comment "refers to the unwanted, disruptive intrusion, generally by Internet trolls, into a video-conference call")







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

