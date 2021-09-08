package design.patterns.behavioral.visitor;
/**
 * @author nayanava
 */

import design.patterns.behavioral.visitor.element.impl.Patient;
import design.patterns.behavioral.visitor.visitor.Visitor;
import design.patterns.behavioral.visitor.visitor.impl.DoctorVisitor;

import java.io.*;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor doctorVisitor = new DoctorVisitor();

        Patient p = new Patient();
        p.accept(doctorVisitor);
    }
}
