//
// Generated by JTB 1.3.2
//

package st4tic.visitor;
import st4tic.syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Require() "." )+
    * f1 -> ( StatementExpression() )*
    */
   public R visit(Start n);

   /**
    * f0 -> "require"
    * f1 -> ( <IDENTIFIER> )+
    */
   public R visit(Require n);

   /**
    * f0 -> AdditiveExpression()
    */
   public R visit(MathExpression n);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
    */
   public R visit(AdditiveExpression n);

   /**
    * f0 -> UnaryExpression()
    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
    */
   public R visit(MultiplicativeExpression n);

   /**
    * f0 -> "(" MathExpression() ")"
    *       | <INTEGER_LITERAL>
    *       | VariableName()
    */
   public R visit(UnaryExpression n);

   /**
    * f0 -> RelationalEqualityExpression()
    */
   public R visit(RelationalExprssion n);

   /**
    * f0 -> RelationalGreaterExpression()
    * f1 -> [ ( "==" | "!=" ) RelationalGreaterExpression() ]
    */
   public R visit(RelationalEqualityExpression n);

   /**
    * f0 -> RelationalLessExpression()
    * f1 -> [ ( ">" | ">=" ) RelationalLessExpression() ]
    */
   public R visit(RelationalGreaterExpression n);

   /**
    * f0 -> UnaryRelational()
    * f1 -> [ ( "<" | "<=" ) UnaryRelational() ]
    */
   public R visit(RelationalLessExpression n);

   /**
    * f0 -> MathExpression()
    */
   public R visit(UnaryRelational n);

   /**
    * f0 -> "if"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public R visit(IfExpression n);

   /**
    * f0 -> "while"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public R visit(WhileExpression n);

   /**
    * f0 -> "def"
    * f1 -> VariableName()
    * f2 -> "="
    * f3 -> MathExpression()
    * f4 -> "."
    */
   public R visit(VariableDeclaration n);

   /**
    * f0 -> VariableName()
    * f1 -> "="
    * f2 -> MathExpression()
    * f3 -> "."
    */
   public R visit(VariableAssign n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(VariableName n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( ":" <IDENTIFIER> )+
    * f2 -> "("
    * f3 -> MathExpression()
    * f4 -> ( "," MathExpression() )*
    * f5 -> ")"
    * f6 -> "."
    */
   public R visit(JavaStaticMethods n);

   /**
    * f0 -> VariableDeclaration()
    *       | VariableAssign()
    *       | JavaStaticMethods()
    *       | IfExpression()
    *       | WhileExpression()
    */
   public R visit(StatementExpression n);

}

