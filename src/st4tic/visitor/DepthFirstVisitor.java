//
// Generated by JTB 1.3.2
//

package st4tic.visitor;
import st4tic.syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Require() "." )+
    * f1 -> ( StatementExpression() )*
    */
   public void visit(Start n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "require"
    * f1 -> ( <IDENTIFIER> )+
    */
   public void visit(Require n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> AdditiveExpression()
    */
   public void visit(MathExpression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
    */
   public void visit(AdditiveExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> UnaryExpression()
    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
    */
   public void visit(MultiplicativeExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "(" MathExpression() ")"
    *       | <INTEGER_LITERAL>
    *       | VariableName()
    */
   public void visit(UnaryExpression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> RelationalEqualityExpression()
    */
   public void visit(RelationalExprssion n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> RelationalGreaterExpression()
    * f1 -> [ ( "==" | "!=" ) RelationalGreaterExpression() ]
    */
   public void visit(RelationalEqualityExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> RelationalLessExpression()
    * f1 -> [ ( ">" | ">=" ) RelationalLessExpression() ]
    */
   public void visit(RelationalGreaterExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> UnaryRelational()
    * f1 -> [ ( "<" | "<=" ) UnaryRelational() ]
    */
   public void visit(RelationalLessExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> MathExpression()
    */
   public void visit(UnaryRelational n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "if"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public void visit(IfExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> "while"
    * f1 -> RelationalExprssion()
    * f2 -> "do"
    * f3 -> ( StatementExpression() )*
    * f4 -> "stop"
    */
   public void visit(WhileExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> "def"
    * f1 -> VariableName()
    * f2 -> "="
    * f3 -> MathExpression()
    * f4 -> "."
    */
   public void visit(VariableDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> VariableName()
    * f1 -> "="
    * f2 -> MathExpression()
    * f3 -> "."
    */
   public void visit(VariableAssign n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(VariableName n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( ":" <IDENTIFIER> )+
    * f2 -> "("
    * f3 -> MathExpression()
    * f4 -> ( "," MathExpression() )*
    * f5 -> ")"
    * f6 -> "."
    */
   public void visit(JavaStaticMethods n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> VariableDeclaration()
    *       | VariableAssign()
    *       | JavaStaticMethods()
    *       | IfExpression()
    *       | WhileExpression()
    */
   public void visit(StatementExpression n) {
      n.f0.accept(this);
   }

}
