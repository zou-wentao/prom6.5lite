/* Generated By:JavaCC: Do not edit this line. QueryParserVisitor.java Version 6.0_1 */
package org.processmining.xeslite.query.syntax;

public interface QueryParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(QueryRoot node, Object data);
  public Object visit(QueryBinaryLogicalExpression node, Object data);
  public Object visit(QuerySimpleExpression node, Object data);
  public Object visit(QueryAtom node, Object data);
}
/* JavaCC - OriginalChecksum=529c07c778c55c483e114a66b552575a (do not edit this line) */
