<!--
╔════════════════════════════════════════════════════════════════════════════════════╗
║                                                                                    ║
║   Copyright (c) 2020-25 https://prrvchr.github.io                                  ║
║                                                                                    ║
║   Permission is hereby granted, free of charge, to any person obtaining            ║
║   a copy of this software and associated documentation files (the "Software"),     ║
║   to deal in the Software without restriction, including without limitation        ║
║   the rights to use, copy, modify, merge, publish, distribute, sublicense,         ║
║   and/or sell copies of the Software, and to permit persons to whom the Software   ║
║   is furnished to do so, subject to the following conditions:                      ║
║                                                                                    ║
║   The above copyright notice and this permission notice shall be included in       ║
║   all copies or substantial portions of the Software.                              ║
║                                                                                    ║
║   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,                  ║
║   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES                  ║
║   OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.        ║
║   IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY             ║
║   CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,             ║
║   TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE       ║
║   OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                                    ║
║                                                                                    ║
╚════════════════════════════════════════════════════════════════════════════════════╝
-->
# [![JaybirdEmbedded logo][1]][2] Documentation

**This [document][3] in English.**

# version [1.0.0][4]

## Introduction:

**JaybirdEmbedded** est une archive Java fournissant des [services Java SPI][5] capables de délivrer les fichiers binaires [Firebird 5.0.3 Server][6] pour les architectures Windows 64 bits et/ou Linux 64 bits x86 au [pilote JDBC Jaybird][7] utilisant ce service SPI.  
Elle permet au pilote JDBC Jaybird de fonctionner en mode véritablement intégré.

Etant un logiciel libre je vous encourage:
- A dupliquer son [code source][8].
- A apporter des modifications, des corrections, des améliorations.
- D'ouvrir un [dysfonctionnement][9] si nécessaire.

Bref, à participer au developpement de cette extension.  
Car c'est ensemble que nous pouvons rendre le Logiciel Libre plus intelligent.

___

## Prérequis:

L'archive JaybirdEmbedded nécessite Java 17 ou supérieur pour fonctionner.

___

## Installation:

- ![JaybirdEmbedded logo][10] Télécharger **[JaybirdEmbedded.jar][11]** [![Version][12]][11]

___

## Utilisation:

Pour être fonctionnelle, l'archive JaybirdEmbedded doit être chargée par le chargeur de classe système ou ajoutée au classpath.  
Cette limitation pourrait bientôt être levée, permettant ainsi le chargement de l'archive JaybirdEmbedded par le chargeur de classe du pilote JDBC Jaybird ou par un chargeur de classe parent.

___

## Historique:

### Ce qui a été fait pour la version 1.0.0:

- Tout d'abord je tiens à remercier [Mark Rotteveel][13] pour m'avoir fourni toutes les informations nécessaires pour pouvoir réaliser ce service SPI.
- Seules les [architectures][14] `win32-x86-64` et `linux-x86-64` sont fournie par l'archive. Si des utilisateurs veulent voir d'autres architectures embarquée dans l'archive qu'il se fasse connaitre en ouvrant une [issue][9].

### Que reste-t-il à faire pour la version 1.0.0:

- Ajouter de nouvelles plateformes...

- Tout ce qui est bienvenu...

[1]: </img/jaybird.svg#collapse>
[2]: <https://prrvchr.github.io/JaybirdEmbedded/>
[3]: <https://prrvchr.github.io/JaybirdEmbedded/>
[4]: <https://prrvchr.github.io/JaybirdEmbedded/README_fr#ce-qui-a-%C3%A9t%C3%A9-fait-pour-la-version-100>
[5]: <https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html>
[6]: <https://www.firebirdsql.org/en/firebird-5-0-3>
[7]: <https://firebirdsql.org/en/jdbc-driver/>
[8]: <https://github.com/prrvchr/JaybirdEmbedded/>
[9]: <https://github.com/prrvchr/JaybirdEmbedded/issues/new>
[10]: <img/JaybirdOOo.svg#middle>
[11]: <https://github.com/prrvchr/JaybirdEmbedded/releases/latest/download/JaybirdEmbedded.jar>
[12]: <https://img.shields.io/github/downloads/prrvchr/JaybirdEmbedded/latest/total?label=v1.0.0#right>
[13]: <https://github.com/mrotteveel>
[14]: <https://github.com/java-native-access/jna/blob/master/src/com/sun/jna/Platform.java#L66>
