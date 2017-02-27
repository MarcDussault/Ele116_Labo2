package Arbre;

import java.util.ArrayList;
import java.util.List;

public class Noeud /*implements Element*/
{
    private List<Noeud> Child = new ArrayList() ;
    private Noeud Parent ;
    private Object Data ;
    
   /* public Noeud(Noeud parent, Object data)
    {
    	this.Parent = parent ;
    	this.Data = data ;
    }*/

    public void addChild(Noeud child)
    {
    	this.Child.add(child) ;
    }
    
    public Noeud getChild(int index)
    {
		return this.Child.get(index);    	
    }
    
    public void setParent(Noeud parent)
    {
    	this.Parent = parent;
    }
    
    public Noeud getParent()
    {
		return this.Parent;
    }
    
    public void SetData(String data)
    {
    	this.Data = data;
    }
}
