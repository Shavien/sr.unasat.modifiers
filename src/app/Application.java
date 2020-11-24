package app;

import model.Lecturer;
import model.Student;

public class Application  {
    public static void main(String[] args) {

        Student s = new Student("Scheikunde");
        s.iLove();

        Lecturer l = new Lecturer("Wiskunde");
        l.iLove2Teach();
    }
}
