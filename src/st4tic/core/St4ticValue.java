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

/**
 * Class base of St4tic values 
 * 
 * @author Adrabi Abderrahim
 *
 */
public class St4ticValue extends St4ticObject{

	private Class type	= null;
	private long value = 0;
	
	/**
	 * Get a value class type
	 * @return Class
	 */
	public Class getType() {
		if ( type != null )
			return type;
		return long.class;
	}
	
	/**
	 * Set value class type
	 * @param type
	 */
	public void setType(Class type) {
		this.type = type;
	}
	
	/**
	 * Get value as long (remember this language can operate just integers,
	 * if you don't know it please read the artile of this tutorial)
	 * 
	 * @return long
	 */
	public long getValue() {
		return value;
	}
	
	/**
	 * Set value as long
	 * @param value
	 */
	public void setValue(long value) {
		this.value = value;
	}
}
