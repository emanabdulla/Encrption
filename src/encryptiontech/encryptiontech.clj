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

(defclass whatsApp
  :super instantMessaging
  :comment "")
(defclass facebookMessanger
  :super instantMessaging
  :comment "")
(defclass telegram
  :super instantMessaging
  :comment "")

(defclass zoom
  :super conferencApp
  :comment "")
(defclass teams
  :super  conferencApp
  :comment "")
(defclass skype
  :super  conferencApp
  :comment "")


(defclass threats
  :comment "potential cause of an unwanted incident, which may result in harm to a system or organization")


(defclass applicationThreats
  :comment "Threats relating to discrete software vulnerabilities residing within mobile applications running atop the mobile operating system")
(as-subclasses
 applicationThreats
 :disjoint
 (defclass conferenceAppThreats
   :comment "")
 (defclass instantMessagingThreats
   :comment "")
(defclass emailThreats
   :comment ""))


(defoproperty isThreating)

(defclass zoomBombing
:super  
conferenceAppThreats
(owl-some isThreating conferencApp) 
:comment "refers to the unwanted, disruptive intrusion, generally by Internet trolls, into a video-conference call")

(defclass spoofing
:super threats
:comment "")

(as-subclasses
spoofing
:disjoint 
(defclass deviceSpoofing)
(defclass contentSpoofing)
(defclass ActionSpoofing))


(defclass tampering
:super threats
:comment "")

(as-subclasses
tampering
:disjoint 
(defclass storageTampering)
(defclass logFilesTampering))

(defclass repudiation
:super threats
:comment "")

(as-subclasses
repudiation
:disjoint 
(defclass contentRepudiation)
(defclass activityRepudiation))


(defclass infDisclosure
:super threats
:comment "")

(as-subclasses
 infDisclosure
:disjoint
(defclass participantDisclosure)
(defclass deviceDisclosure)
(defclass callDataDisclosure))

(defclass denialOfService
:super threats
:comment "")

(as-subclasses
 denialOfService
:disjoint
(defclass DoS)
(defclass DDoS))

(defclass escalationOfPrivilege
:super threats
:comment "")

(as-subclasses
 escalationOfPrivilege
:disjoint
(defclass unauthorizedAdminPrivileg)
(defclass unauthorizedAccess))




(defclass malware
:super threats
   :comment "software that is intentionally included or inserted in a system for a harmful purpose")
 






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

