# UCE Génie Logiciel Avancé : Techniques de tests

Nom : IGHMOURACENE.
Prénom : Kenza.
Groupe : ilsen classique.
**#Codecov:**

[![codecov](https://codecov.io/gh/Kenza-ighmouracene/ceri-m1-techniques-de-test/graph/badge.svg?token=F5FBTAH0JP)](https://codecov.io/gh/Kenza-ighmouracene/ceri-m1-techniques-de-test)

**CircleCI**

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/Kenza-ighmouracene/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/Kenza-ighmouracene/ceri-m1-techniques-de-test/tree/master)



## CheckStyle
![CheckStyle](target/site/badges/checkstyle-result.svg)

**Rapport tp6**
 Notre mission était d'évaluer le code fourni par la Team Rocket, intégré préalablement à notre projet, à travers des tests ciblés. Avant de démarrer, une revue approfondie du code et de ses méthodes a été effectuée.

Le test concernant la méthode 'getIv()' a révélé une erreur due à la classe RocketPokemonFactory qui fixe les IV à 1 de manière systématique, ignorant ainsi toute autre valeur d'IV spécifiée.

Une gestion rigoureuse des IV s'avère nécessaire, notamment la vérification des indices qui, conformément au TP3, devraient se situer entre 0 et 150. Nous avons identifié un cas où un Pokémon avec un indice de -1 ne génère pas d'exception, malgré la règle.

Suggestions d'amélioration :
Il serait utile de tester l'effet du changement de fournisseur de métadonnées pour confirmer que la définition de métadonnées personnalisées dans la PokemonFactory est insuffisante. Une attention particulière devrait être portée au temps d'exécution pour éviter les nombreuses itérations superflues.

Ce TP6 conclut notre série sur les techniques de test. Il m'a permis de me familiariser avec des outils tels que JUnit et Mockito, et de comprendre l'importance de la qualité du code via des outils comme Checkstyle, JaCoCo et Codecov.
