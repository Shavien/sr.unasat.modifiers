package model;

abstract class Person {
    private String Name;
    private String DateOfBirth;


    public void introduce(){
        System.out.println("Hallo mijn naam is"+Name+",geboren op"+DateOfBirth);


    }

}
