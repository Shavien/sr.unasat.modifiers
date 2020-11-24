package model;

public class Student extends Person{

    private String FavoriteCourse;
    boolean beantwoord = false;

    public Student(String FavoriteCourse){
        this.FavoriteCourse = FavoriteCourse;
    }

    public void iLove(){
        System.out.println("Ik houd van" + FavoriteCourse);
        if(!beantwoord){
            beantwoord=true;

        }
    }
}
