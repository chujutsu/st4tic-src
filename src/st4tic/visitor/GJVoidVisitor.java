//
// Generated by JTB 1.3.2
//

package st4tic.visitor;
import st4tic.syntaxtree.*;
import java.util.*;

/**
 * All GJ void visitors must implement this interface.
 */

public interface GJVoidVisitor<A> {

   //
   // GJ void Auto class visitors
   //

   public void visit(NodeList n, A argu);
   public void visit(NodeListOptional n, A argu);
   public void visit(NodeOptional n, A argu);
   public void visit(NodeSequence n, A argu);
   public void visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Require() "." )+
    * f1 -> ( StatementExpression() )*
    */
   public void visit(Start n, A argu);

   /**
    * f0 -> "require"
    * f1 -> ( <IDENTIFIER> )+
    */
   public void visit(Require n, A argu);

   /**
    * f0 -> AdditiveExpression()
    */
   public void visit(MathExpression n, A argu);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
    */
   public void visit(AdditiveExpression n, A argu);

   /**
    * f0 -> UnaryExpression()
    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
    */
   public void visit(MultiplicativeExpression n, A argu);

   /**
    * f0 -> "(" MathExpression() ")"
    *       | <INTEGER_LITERAL>
    *       | VariableName()
    */
   public void visit(UnaryExpression n, A argu);

   /**
    * f0 -> RelationalEqualityExpression()
    */
   public void visit(RelationalExprssion n, A argu);

   /**
    * f0 -> RelationalGreaterExpression()
    * f1 -> [ ( "==" | "!=" ) RelationalGreaterExpression() ]
    */
   public void visit(RelationalEqualityExpression n, A argu);

   /**
    * f0 -> RelationalLessExpression()
    * f1 -> [ ( ">" | ">=" ) RelationalLessExpression() ]
    */
   public void visit(RelationalGreaterExpression n, A argu);

   /**
    * f0 -> UnaryRelational()
    * f1 -> [ ( "<" | "<=" ) UnaryRelational() ]
    */
   public void visit(RelationalLessExpression n, A argu);

   /**
    * f0 -> MathExpression()
    */
   public void visit(UnaryRelational n, A argu);

   /**
    * f0 -> "if"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public void visit(IfExpression n, A argu);

   /**
    * f0 -> "while"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public void visit(WhileExpression n, A argu);

   /**
    * f0 -> "def"
    * f1 -> VariableName()
    * f2 -> "="
    * f3 -> MathExpression()
    * f4 -> "."
    */
   public void visit(VariableDeclaration n, A argu);

   /**
    * f0 -> VariableName()
    * f1 -> "="
    * f2 -> MathExpression()
    * f3 -> "."
    */
   public void visit(VariableAssign n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(VariableName n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( ":" <IDENTIFIER> )+
    * f2 -> "("
    * f3 -> MathExpression()
    * f4 -> ( "," MathExpression() )*
    * f5 -> ")"
    * f6 -> "."
    */
   public void visit(JavaStaticMethods n, A argu);

   /**
    * f0 -> VariableDeclaration()
    *       | VariableAssign()
    *       | JavaStaticMethods()
    *       | IfExpression()
    *       | WhileExpression()
    */
   public void visit(StatementExpression n, A argu);

}

