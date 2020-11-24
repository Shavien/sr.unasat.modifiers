package model;


public class Lecturer extends Person {
    private String FavoriteCourse;

    public Lecturer(String FavoriteCourse){
        this.FavoriteCourse = FavoriteCourse;
    }

    public void iLove2Teach(){

        System.out.println("Ik doceer graag" + FavoriteCourse);
    }


}
