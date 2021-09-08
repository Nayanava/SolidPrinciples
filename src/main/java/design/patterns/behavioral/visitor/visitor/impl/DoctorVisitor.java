package design.patterns.behavioral.visitor.visitor.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.element.impl.Patient;
import design.patterns.behavioral.visitor.element.impl.Receptionist;
import design.patterns.behavioral.visitor.visitor.Visitor;

public class DoctorVisitor implements Visitor {

    @Override
    public void visit(Patient patient) {
        System.out.println("Doctor is visiting patient");
    }

    @Override
    public void visit(Receptionist receptionist) {
        System.out.println("Doctor's id card is being verified by receptionist");
    }
}
