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

package st4tic.interpreter;

import st4tic.core.St4ticScope;
import st4tic.syntaxtree.AdditiveExpression;
import st4tic.syntaxtree.IfExpression;
import st4tic.syntaxtree.JavaStaticMethods;
import st4tic.syntaxtree.MathExpression;
import st4tic.syntaxtree.MultiplicativeExpression;
import st4tic.syntaxtree.RelationalEqualityExpression;
import st4tic.syntaxtree.RelationalExprssion;
import st4tic.syntaxtree.RelationalGreaterExpression;
import st4tic.syntaxtree.RelationalLessExpression;
import st4tic.syntaxtree.Require;
import st4tic.syntaxtree.Start;
import st4tic.syntaxtree.StatementExpression;
import st4tic.syntaxtree.UnaryExpression;
import st4tic.syntaxtree.UnaryRelational;
import st4tic.syntaxtree.VariableAssign;
import st4tic.syntaxtree.VariableDeclaration;
import st4tic.syntaxtree.VariableName;
import st4tic.syntaxtree.WhileExpression;

/**
 * Interface for interpreter
 * 
 * @author Adrabi Abderrahim
 *
 */
public interface Interpret {
	   /**
	    * f0 -> ( Require() "." )+
	    * f1 -> ( StatementExpression() )*
	 * @throws Exception 
	    */
	   public Object visit(Start node) throws Exception;

	   /**
	    * f0 -> "require"
	    * f1 -> ( <IDENTIFIER> )+
	    */
	   public Object visit(Require node, St4ticScope scope, Object ... objects);

	   /**
	    * f0 -> AdditiveExpression()
	 * @throws Exception 
	    */
	   public Object visit(MathExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> MultiplicativeExpression()
	    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
	 * @throws Exception 
	    */
	   public Object visit(AdditiveExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> UnaryExpression()
	    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
	 * @throws Exception 
	    */
	   public Object visit(MultiplicativeExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> "(" MathExpression() ")"
	    *       | <INTEGER_LITERAL>
	    *       | VariableName()
	 * @throws Exception 
	    */
	   public Object visit(UnaryExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> RelationalEqualityExpression()
	 * @throws Exception 
	    */
	   public Object visit(RelationalExprssion node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> RelationalGreaterExpression()
	    * f1 -> ( ( "==" | "!=" ) RelationalGreaterExpression() )*
	 * @throws Exception 
	    */
	   public Object visit(RelationalEqualityExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> RelationalLessExpression()
	    * f1 -> ( ( ">" | ">=" ) RelationalLessExpression() )*
	 * @throws Exception 
	    */
	   public Object visit(RelationalGreaterExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> UnaryRelational()
	    * f1 -> ( ( "<" | "<=" ) UnaryRelational() )*
	 * @throws Exception 
	    */
	   public Object visit(RelationalLessExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> MathExpression()
	 * @throws Exception 
	    */
	   public Object visit(UnaryRelational node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> "if"
	    * f1 -> RelationalExprssion()
	    * f2 -> "do"
	    * f3 -> ( StatementExpression() )*
	    * f4 -> "stop"
	 * @throws Exception 
	    */
	   public Object visit(IfExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> "while"
	    * f1 -> RelationalExprssion()
	    * f2 -> "do"
	    * f3 -> ( StatementExpression() )*
	    * f4 -> "stop"
	 * @throws Exception 
	    */
	   public Object visit(WhileExpression node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> "def"
	    * f1 -> VariableName()
	    * f2 -> "="
	    * f3 -> MathExpression()
	    * f4 -> "."
	 * @throws Exception 
	    */
	   public Object visit(VariableDeclaration node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> VariableName()
	    * f1 -> "="
	    * f2 -> MathExpression()
	    * f3 -> "."
	 * @throws Exception 
	    */
	   public Object visit(VariableAssign node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> <IDENTIFIER>
	    */
	   public Object visit(VariableName node, St4ticScope scope, Object ... objects);

	   /**
	    * f0 -> <IDENTIFIER>
	    * f1 -> ( ":" <IDENTIFIER> )+
	    * f2 -> "("
	    * f3 -> MathExpression()
	    * f4 -> ( "," MathExpression() )*
	    * f5 -> ")"
	    * f6 -> "."
	 * @throws Exception 
	    */
	   public Object visit(JavaStaticMethods node, St4ticScope scope, Object ... objects) throws Exception;

	   /**
	    * f0 -> VariableDeclaration()
	    *       | VariableAssign()
	    *       | JavaStaticMethods()
	    *       | IfExpression()
	    *       | WhileExpression()
	 * @throws Exception 
	    */
	   public Object visit(StatementExpression node, St4ticScope scope, Object ... objects) throws Exception;
}
