package design.patterns.behavioral.visitor.visitor.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.element.impl.Patient;
import design.patterns.behavioral.visitor.element.impl.Receptionist;
import design.patterns.behavioral.visitor.visitor.Visitor;

import java.io.*;

public class NurseVisitor implements Visitor {
    @Override
    public void visit(Patient patient) {
        System.out.println("Patient's reading to be taken by Nurse");
    }

    @Override
    public void visit(Receptionist receptionist) {
        System.out.println( "Nurse's duty roster being provided from reception");
    }
}
