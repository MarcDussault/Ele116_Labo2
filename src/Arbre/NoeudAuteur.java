/******************************************************
Cours :             ELE116
Session :           Hiver 2017
Groupe :            01
Projet :            Laboratoire #2
Étudiant(e)(s) :    Marc Dussault-Matte
                    Hortense Houendji
Code(s) perm. :     DUSM25029304
                    HOUH31589002
Professeur :        Kim Khoa Nguyen
Nom du fichier :    NoeudAuteur.java
Date crée :         2017-02-13
Date dern. modif.   2017-02-13
*******************************************************
Historique des modifications
*******************************************************
 2017-02-13         Version initiale 
 2017-02-20			J'ai enlever les méthodes non 
 					nécessaires
*******************************************************/

package Arbre;

import java.util.List;
import java.util.ArrayList;


public class NoeudAuteur extends Noeud
{
    private List<Noeud> Child = new ArrayList() ;
    private Noeud Parent ;
    private Object Data ;
    
    public NoeudAuteur(Noeud parent, Object data)
    {
    	this.Parent = parent ;
    	this.Data = data ;
    }
}