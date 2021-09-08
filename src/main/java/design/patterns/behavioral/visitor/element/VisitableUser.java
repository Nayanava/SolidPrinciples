package design.patterns.behavioral.visitor.element;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.visitor.Visitor;

public abstract class VisitableUser {

    public abstract void accept(Visitor visitor);
}
