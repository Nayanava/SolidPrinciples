package design.patterns.behavioral.visitor.element.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.element.VisitableUser;
import design.patterns.behavioral.visitor.visitor.Visitor;

public class Receptionist extends VisitableUser {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
