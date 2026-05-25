# 🏦 BankManager

Projet réalisé dans le cadre du cours **DevOps & Application Java**  
👤 **Ouattara Cheick Tydiane Othniel**

---

## 📋 Description

BankManager est une application Java qui modélise un système de gestion de comptes bancaires. Elle illustre le concept d'**héritage** en Java à travers une hiérarchie de classes représentant différents types de comptes bancaires.

---

## 🏗️ Architecture du projet

```
BankAccount (classe parent)
├── CheckingAccount (compte courant)
├── SavingsAccount  (compte épargne)
└── COD             (certificat de dépôt)
```

### Description des classes

| Classe | Rôle | Attributs |
|--------|------|-----------|
| `BankAccount` | Classe parent commune à tous les comptes | `account`, `balance` |
| `CheckingAccount` | Compte courant avec limite de découvert | hérite + `limit` |
| `SavingsAccount` | Compte épargne avec plafond de dépôt | hérite|
| `COD` | Certificat de dépôt avec limite de retrait | hérite|

---

## ▶️ Exécution

### Prérequis
- Java 21
- IntelliJ IDEA (ou tout autre IDE Java)

### Lancer le projet
1. Cloner le dépôt :
```bash
git clone https://github.com/ton-username/BankManager.git
```
2. Ouvrir le projet dans IntelliJ IDEA
3. Lancer la classe `Main.java`

### Résultat attendu
```
*****Compte Courant*****
Compte : compte courant
Solde : 10000
-- Apres modification --
Compte : compte courant modifié
Solde : 99000
*****Compte Epargne*****
Compte : compte d'épargne
Solde : 500
-- Apres modification --
Compte : compte épargne modifié
Solde : 5000
*****Certificat de Depot*****
Compte : certificat de dépôt
Solde : 250
-- Apres modification --
Compte : certificat de dépôt modifié
Solde : 8000
-----------------

```

---

## 💡 Concepts illustrés

- **Héritage** : les classes `CheckingAccount`, `SavingsAccount` et `COD` héritent de `BankAccount`
- **Constructeur parent** : utilisation de `super()` pour initialiser les attributs hérités
- **Polymorphisme** : chaque classe enfant peut étendre le comportement de la classe parent

---

## 📁 Structure des fichiers

```
BankManager/
├── src/
│   ├── Main.java
│   ├── BankAccount.java
│   ├── CheckingAccount.java
│   ├── SavingsAccount.java
│   └── COD.java
└── README.md
```

---

uattara Cheick Tydiane Othniel
