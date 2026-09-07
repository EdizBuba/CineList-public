# CineList

Projet universitaire Android/Kotlin autour des séries et des animes. Le code
utilise des vues Android, ViewModel, coroutines et Retrofit pour consulter l'API
SIMKL. Il est conservé comme archive pédagogique, pas comme application maintenue.

## Démonstration sans compte

L'écran d'entrée propose explicitement une démonstration sans compte. Aucun
identifiant ni mot de passe n'est demandé et aucun compte local n'est stocké.
Analytics et Crashlytics ne sont pas intégrés à cette version ; aucun backend
Firebase personnel ni compte administrateur n'est fourni.

Les corps des réponses HTTP ne sont pas journalisés. Les dépendances et
fonctionnalités restent celles d'un projet pédagogique : ne pas utiliser cette
archive pour gérer des données sensibles ou comme modèle d'authentification.

## Étudier le projet

- Android Studio, JDK 17 ou compatible, Android SDK 34.
- Windows : `gradlew.bat :app:assembleDevelopDebug :app:testDevelopDebugUnitTest`.
- Linux/macOS : `./gradlew :app:assembleDevelopDebug :app:testDevelopDebugUnitTest`.
- Les appels SIMKL dépendent d'un service externe dont la disponibilité et les
  conditions d'accès ne sont pas garanties par ce dépôt.

La version nettoyée a passé le build `developDebug` et les tests unitaires sous
JDK 21, Gradle 8.7 et SDK 34. Cela ne valide pas les parcours sur téléphone, l'API
distante ou l'absence de toute vulnérabilité dans les dépendances Android.

## Publication et auteurs

Ce dépôt public est indépendant, créé uniquement à partir des fichiers nettoyés.
Il n'importe aucun ancien historique Git ni référence de pull request.
Ne pas y fusionner d'ancien clone ou de sauvegarde.

Auteurs du projet universitaire : Ediz Buba et Abdellah Boussaha.

Voir [SECURITY.md](SECURITY.md).
