/* Generated By:JJTree: Do not edit this line. QueryAtom.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=Query,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.processmining.xeslite.query.syntax;

public
class QueryAtom extends SimpleNode {
  
	public String val;

public QueryAtom(int id) {
    super(id);
  }

  public QueryAtom(QueryParser p, int id) {
    super(p, id);
  }

  public String toString() {
	return val;
}

  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=30e90eb69f188eca0101508bd41404fc (do not edit this line) */
