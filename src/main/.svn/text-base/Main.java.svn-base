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

package main;

import java.io.File;

import st4tic.St4tic;
import st4tic.interpreter.Interpreter;

/**
 * Class main for running St4tic language 
 * 
 * @author Adrabi Abderrahim
 *
 */
public class Main {
	public static void main(String [] $)
	{
	    try
	    {
	      if ($.length == 0) 
	      throw new Exception("Error, file dons't exists !");
	      else if (!new File( $[0] ).exists()) 
	      throw new Exception("Error, reading file : " + $ [0] + " !");
	      St4tic parser = new St4tic(new java.io.FileInputStream($ [0]));    
	      new Interpreter().visit( parser.Start() );
	    }
	    catch (Throwable e)
	    {
	    	System.out.println( "hmmm... sorry you have this error! :\n" + e );
	    }
	}
}
