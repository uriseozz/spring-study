package com.sparta.week01.prac;

public class prac {
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }


    public static void main(String[] args) {
        Course course = new Course();
        Tutor tutor = new Tutor();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        course.setTitle("웹개발의 봄 스프링");
        course.setTutor("남병관");
        course.setDays(35);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        System.out.println(tutor.getName());
        System.out.println(tutor.getBio());

        tutor.setName("서유리");
        tutor.setBio("??");

        System.out.println(tutor.getName());
        System.out.println(tutor.getBio());

    }
}
