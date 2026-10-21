# ProjetJavaS9
**Séance du 21/10/2026**

La classe Aeroport.java : Elle nous permet de définir ce qu'est un aéroport avec ses attributs, son constructeur, ses getters.

**Les attributs**
Dans la classe on a déterminé les attributs. Ils regroupent les informations d'un aéroport. On les a mis en private, ce qui veut dire que les autrews classes n'y ont pas accès.

**Le constructeur**
Le constructeur range les valeurs réelles des aéroports qui viennent du ficher .csv dans les attributs. Pour chaque ligne du fichier .csv on aura un aéroport crée.

**Les getters**
Ils permettent aux autres classes qui n'ont pas accès aux attributs de lire les valeurs rangées par le constructeur, sans faire de changement.

**'toString()'**
Cette méthode existe déjà dans Java, dans la classe 'Object' dont toutes les classes héritent. On la reprend avec le même nom et @Override, mais on change ce qu'elle renvoie pour afficher des infos de l'aéroport. On utilise l'héritage.

**Test**
Pour le test de la classe Aeroport, on a le main qui crée deux aéroports (CDG et ORY) et les affiche. Il permet de vérifier que l'on retrouve bien les informations des aéroports crées.

**Choix de conception**
On a mis les attributs en 'private' pour que les données d'un aéroport ne peuvent pas être modifiées depuis l'extérieur. Les getters permettent de ne lire que les informations utiles pour les autres. Le constructeur remplit les attributs à la création de l'objet. Pour la suite, chaque ligne du ficher .csv donnera un objet 'Aeroport'. La redéfinition de 'toString' permet de remplacer l'affichage par défaut hérité de la classe 'Objet' pour afficher les informations de l'aéroport.