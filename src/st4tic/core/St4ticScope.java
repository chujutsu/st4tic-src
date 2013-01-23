/**
 * The Code Project Open License (CPOL) 1.02
 * 		see : http://www.codeproject.com/info/cpol10.aspx
 * 
 * Author	: Adrabi Abderrahim
 * Mail		: adrabi[at]gmail[dot]com
 * Year		: 2009
 * Discrip	: this code a part of "Create Your Own Programming Language, just game ?" 
 * 			  and code using is from Alef++ project
 * 			  https://sourceforge.net/projects/alefpp/
 */

package st4tic.core;

import java.util.Hashtable;

/**
 * Class base for scopes or blocks between ( do ... stop )
 * 
 * ... something ... do
 * 	"here ...
 * stop
 * 
 * like if or while statement
 * 
 * @author Adrabi Abderrahim
 *
 */
public class St4ticScope extends St4ticObject {

	private Hashtable <String,St4ticVariable> childs = new Hashtable<String,St4ticVariable>();

	/**
	 * Constructor for setting up parent
	 * @param parent
	 */
	public St4ticScope( St4ticObject parent )
	{
		super(parent);
	}
	
	/**
	 * return a childs hash
	 * @return
	 */
	public Hashtable <String,St4ticVariable> getChilds()
	{
		return childs;
	}
	
	/**
	 * Add a child (variable) to scope for variable lifecycle and variable visibility
	 * 
	 * @param name
	 * @param child
	 * @return boolean
	 */
	public boolean pushChild(String name, St4ticVariable child)
	{
		return this.childs.put( name , child) != null;
	}
	
	/**
	 * Return a child by name, fetching finding in current scope and parents 
	 * 
	 * @param name
	 * @return St4ticVariable
	 */
	public St4ticVariable child(String name)
	{
		return child ( name , this);
	}
	
	/**
	 * ;) closure for finding a variable by name
	 * 
	 * @param name
	 * @param scope
	 * @return St4ticVariable
	 */
	private St4ticVariable child(String name, St4ticScope scope)
	{
		if( scope.getChilds().containsKey( name ) )
		{
			return scope.getChilds().get( name );
		}
		else if( scope.getParent() != null && scope.getParent() instanceof St4ticScope )
		{
			return child(name, (St4ticScope)scope.getParent() );
		}
		return null;
	}
	
	/**
	 * Check existens of variables
	 * @param name
	 * @return boolean
	 */
	public boolean existsChild(String name){
		return existsChild(name, this);
	}
	
	/**
	 * ;) closure for finding a variable by name
	 * 
	 * @param name
	 * @param scope
	 * @return boolean
	 */
	private boolean existsChild(String name, St4ticScope scope)
	{
		if( scope.getChilds().containsKey( name ) )
		{
			return true;
		}
		else if( scope.getParent() != null && scope.getParent() instanceof St4ticScope )
		{
			return existsChild(name, (St4ticScope) scope.getParent());
		}
		return false;
	}
}
