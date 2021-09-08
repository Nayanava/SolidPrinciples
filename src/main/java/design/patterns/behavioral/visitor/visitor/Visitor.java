package design.patterns.behavioral.visitor.visitor;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.element.impl.Patient;
import design.patterns.behavioral.visitor.element.impl.Receptionist;

public interface Visitor {
    void visit(Patient patient);
    void visit(Receptionist receptionist);
}
