Thursday
=========

KeyNote
-------
Mapping: vidéo / lumière sur architecture

1024 architecture 
* square cube
* boom box

création du Mini Mad (controller sous Rasberry Pi)

Android Things 
--------------
@Nilhcem

`reptilethings <https://bit.ly/reptilethings>`_.

Prototype de programme embarqué sur Rasberry Pi:

1. détecter une personne (HC-SR04) et prendre une photo
2. déterminer l'appartenance au groupe réptilien: ML avec TensorFlow -> (humain, reptile, reptilien)
3. éliminer le reptilien 

* servo moteur: tir dun pistolet / lance flemme déodorant-bougie
* controlleur relai: déclenchement à distance d'une tronçonneuse

Rasberry Pi 3 ou NXP i MV7D (carte en 2 parties: SOM + base interface)

Conseil:

* Kit de démarrage Arduino (avoir différents capteurs)


TensorFow Wide & Deep: Advanced classification the easy way 
-------------------------------------------------------------
@yufengG

`ai-adventures <https://bit.ly/ai-adventures>`_.
`widendeep-census <https://bit.ly/widendeep-census>`_.


Machine Learning = using `Many Examples` to answer `Questions` 

+----------------------+----------------------+
| Wide                 | Deep                 |
+======================+======================+
| Linear /	           | Diversity /          |
| categorial	       | real                 |
+----------------------+----------------------+
| memorization /       | generalization       |
| exception	           |                      |
+----------------------+----------------------+

Conseil:

* Print TensorFlow version in script

An Adroid retrospective
------------------------
Hisotry of the android improvements and deliveries

L'UX a sauvé mon Devops
------------------------
Utilisation de technique UX pour mettre en exergue des problèmes dans l'entreprise (dev vs devops)

1) les 5 "pourquoi" => trouver la root cause
2) Speed boat => lors d'une tache demander ce qui freine / ce qui accélère
3) les 6 chapeaux de bono => étudier le problème sous des angles différents

The great SOA Migration
------------------------
Monolythique to 1000+ microservices at Uber

Why: scalability mainly 

Do it step by step (1 microservice then 2, ... ) (rope break)

1. manage data: duplication to the new Base -> (legacy and new up to date)
2. Read sometime (feature branching) with the new service
3. Read with the new service
4. Kill the legacy part

Th entreprise architecture match the software achitecture.

Lachez votre java et venez prendre un peu l'R
----------------------------------------------
R est efficace pour les statistiques (by design)
Not only => tableau de bord joli

Friday
=======

Code And Deploy angular to the Cloud
-------------------------------------
@jawache

Example with circleci and Azure

CICD: continuous integration and continuous delivery

* circleci (free for open source project)
* travisci
* jenkins


1. Push to Github
2. CircleCi monitor github changes
3. build and deploy

Conseil:

* `It's Always Sunny in Philadephia <https://en.wikipedia.org/wiki/It%27s_Always_Sunny_in_Philadelphia>`_. (comic show to see)
* avoid `Bus Factor <https://en.wikipedia.org/wiki/Bus_factor/>`_. = the build main contributor died in a bus accident 


Kotlin 
------
@ecspike

Kotlin: 

* % java compatible
* javascript compatible
* variable can't be null by default BUT there is a Null type : StockQuote? ('?' allow Null)

How to convert from Java:
* add kotlin to build.gradle dependencies
* rigth clic -> convert to kotlin :) BUT better tweak slowly

POJO <=> Data Class (like Scala Case class) 

Object as scala for Singletion

Companion Object

lazy <=> lateinit

Library for Adnroid dev:

* `kotterknife <https://github.com/JakeWharton/kotterknife>`_. (delegate using 'by')
* `anko commons and logging <https://github.com/Kotlin/anko>`_: tools with helpers like Intent / Dialog /etc

Resources:

* Kotlin Loans
* `kotlinlang <kotlinlang.org>`_.
* Antonio Leiva's Kotlin book

Ma premiere application Android en Kotlin
------------------------------------------
Android studio
Kotlin
Basic app with List / ClickAdapter

view variables directly visible in Actvity

Docker for dev and ops: what's new and what's next ?
----------------------------------------------------
Based on Moby project         

Modernisation des applications traditionelles

top priority Entreprise:

* Portabilité (ne pas être lié à un cloud provider) -> hybrid cloud-ready
* Agilité -> 2x faster
* Sécurité -> isolation and integrity

What entreprise do : 80% maintenance / 20% innovation, Docker aims to lower maintenancy

Docker pros:

* independence dev vs ops
* openness 
* simplicity


orchestration swarm vs kubernetes (**now supported** in docker): docker orchestration on top of kubernetes one 

.. code:: bash

   docker stack deploy
   docker stack log
   docker stack ps 

