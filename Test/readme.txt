Démineur complet avec gestion des meilleurs temps-------------------------------------------------
Url     : http://codes-sources.commentcamarche.net/source/45051-demineur-complet-avec-gestion-des-meilleurs-tempsAuteur  : damned3Date    : 09/08/2013
Licence :
=========

Ce document intitulé « Démineur complet avec gestion des meilleurs temps » issu de CommentCaMarche
(codes-sources.commentcamarche.net) est mis à disposition sous les termes de
la licence Creative Commons. Vous pouvez copier, modifier des copies de cette
source, dans les conditions fixées par la licence, tant que cette note
apparaît clairement.

Description :
=============

Voici le jeu de D&eacute;mineur que mon coll&egrave;gue et moi avons cr&eacute;&
eacute; pour un travail de c&eacute;gep.
<br />
<br />Fonctionnalit&eacute;s :

<br />- Niveaux de difficult&eacute; : Facile, Interm&eacute;diaire, Difficile
 et Personnalis&eacute;.
<br />- Enregistrements des meilleurs scores dans les 
Pr&eacute;f&eacute;rences de Java
<br />- Les mines ne sont g&eacute;n&eacute;r
&eacute;s qu'apr&egrave;s le premier clique de la souris (comme dans le vrai d&e
acute;mineur) afin de ne pas tomber sur une mine du premier coup et de crever en
 partant, ce qui serait chiant. Je sais que c'est normal, mais j'ai cru bon de l
e dire car pour mon prof c'&eacute;tait une fonctionnalit&eacute; suppl&eacute;m
entaire.
<br />- Le jeu est le plus fid&egrave;le au D&eacute;mineur de Windows
 (apparence, interface, etc.)
<br />- Possibilit&eacute; de tricher pour d&eacu
te;voiler les mines (il est impossible d'enregistrer de score dans ce cas, logiq
ue):
<br />
<br />Pour activer le mode triche, il faut naturellement entrer un
 mot de passe. Le bout de code qui g&eacute;n&egrave;re un mot de passe compliqu
&eacute; est volontairement non comment&eacute; et exag&eacute;r&eacute;mment co
mpliqu&eacute; (ne notez pas l&agrave;-dessus). C'est un petit d&eacute;fi que j
e vous offre (pas bien difficile mais bon). Ce sera enlev&eacute; et le mot de p
asse sera mis en constante dans les prochaines versions. (je n'ai &eacute;videmm
ent pas donn&eacute; &ccedil;a au prof, je l'ai rajout&eacute; juste pour vous)

<br />
<br />Ceux qui ont le sens de l'observation remarqueront que j'ai utili
s&eacute; ma classe LCDPanel pour afficher les mines et le temps.
<br />
<br /
>Le seul bogue connu est lorsqu'on clique sur Annuler pour cr&eacute;er une gril
le personnalis&eacute;e, puis qu'on joue et ensuite on recommence, il garde les 
settings personnalis&eacute;s m&ecirc;me si c'est d&eacute;butant (donc &ccedil;
a foire)
<br />
<br />c'est aussi tr&egrave;s lent au niveau de la cr&eacute;a
tion d'une nouvelle grille (changement de taille) pour le reste c'est fluide.
<
br />
<br />Donc amusez-vous !
<br /><a name='source-exemple'></a><h2> Source 
/ Exemple : </h2>
<br /><pre class='code' data-mode='basic'>
Dans le zip
</p
re>
<br /><a name='conclusion'></a><h2> Conclusion : </h2>
<br />Je vous four
nit le projet Eclipse r&eacute;alis&eacute; avec Java 1.5 ainsi qu'un jar de tes
t. Comme c'&eacute;tait un projet d'&eacute;valuation pas besoin de vous dire qu
e &ccedil;a a &eacute;t&eacute; rigoureusement test&eacute;, mais il peut quand 
m&ecirc;me rester des bogues.
