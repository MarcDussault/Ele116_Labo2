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
Nom du fichier :    NoeudChapitre.java
Date crée :         2017-02-13
Date dern. modif.   2017-02-13
*******************************************************
Historique des modifications
*******************************************************
 2017-02-13         Version initiale 
*******************************************************/

package Arbre;

import java.util.ArrayList;
import java.util.List;

public class NoeudChapitre extends Noeud
{
    private List<Noeud> Child = new ArrayList() ;
    private Noeud Parent ;
    private Object Data ;
    
    public NoeudChapitre(Noeud parent, Object data)
    {
    	this.Parent = parent ;
    	this.Data = data ;
    }
}
