package com.dev_j110.labwork1;


public class A {

    static A x,y;



    public A () {
        System.out.println("A:A()");
    }

    public A (A x) {
        this();
        System.out.println ("A:A(A)");
    }

    protected A (A x, A y) {
        this(x);
        System.out.println ("A:A(A,A)");
    }




    public static void main (String[] args) {
        new A (x,y);
        System.out.print('\n');

        Man person1 = new Man("Fedorov", "Fedr", "Fedorovich", "03.03.2003", "3333 333333");
        System.out.println("Surname: " + person1.getSurnameOfPerson() + " ");
        System.out.println("Name: " + person1.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + person1.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + person1.getDateOfBirth() + " ");
        System.out.println("Passport number: " + person1.getPassportNumber() + " ");
        System.out.print('\n');
        person1.setDocument("1111 111111");
        System.out.println("Surname: " + person1.getSurnameOfPerson() + " ");
        System.out.println("Name: " + person1.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + person1.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + person1.getDateOfBirth() + " ");
        System.out.println("Passport number: " + person1.getPassportNumber() + " ");
        System.out.print('\n');
        person1.setDate("02.02.2001");
        System.out.println("Surname: " + person1.getSurnameOfPerson() + " ");
        System.out.println("Name: " + person1.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + person1.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + person1.getDateOfBirth() + " ");
        System.out.println("Passport number: " + person1.getPassportNumber() + " ");
        System.out.print('\n');

        Man person2 = new Man ("Petrov", "Petr", "Petrovich");
        System.out.println("Surname: " + person2.getSurnameOfPerson() + " ");
        System.out.println("Name: " + person2.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + person2.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + person2.getDateOfBirth() + " ");
        System.out.println("Passport number: " + person2.getPassportNumber() + " ");
        System.out.print('\n');

        Man person3 = new Man ();
        System.out.println("Surname: " + person3.getSurnameOfPerson() + " ");
        System.out.println("Name: " + person3.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + person3.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + person3.getDateOfBirth() + " ");
        System.out.println("Passport number: " + person3.getPassportNumber() + " ");
        System.out.print('\n');

        Student student1 = new Student ("Alexeev", "Alexey", "Alexeevich", "01.01.2005", "5555 555555", 222);
        System.out.println("Surname: " + student1.getSurnameOfPerson() + " ");
        System.out.println("Name: " + student1.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + student1.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + student1.getDateOfBirth() + " ");
        System.out.println("Passport number: " + student1.getPassportNumber() + " ");
        System.out.println("Gradebook number: " + student1.getGradeBook() + " ");
        System.out.print('\n');
        student1.setDocument("6666 666666");
        System.out.println("Surname: " + student1.getSurnameOfPerson() + " ");
        System.out.println("Name: " + student1.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + student1.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + student1.getDateOfBirth() + " ");
        System.out.println("Passport number: " + student1.getPassportNumber() + " ");
        System.out.println("Gradebook number: " + student1.getGradeBook() + " ");
        System.out.print('\n');

        Student student2 = new Student ("Nikolaev", "Nikolay", "Nikolaevich");
        System.out.println("Surname: " + student2.getSurnameOfPerson() + " ");
        System.out.println("Name: " + student2.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + student2.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + student2.getDateOfBirth() + " ");
        System.out.println("Passport number: " + student2.getPassportNumber() + " ");
        System.out.println("Gradebook number: " + student2.getGradeBook() + " ");
        System.out.print('\n');

        Student student3 = new Student ();
        System.out.println("Surname: " + student3.getSurnameOfPerson() + " ");
        System.out.println("Name: " + student3.getNameOfPerson() + " ");
        System.out.println("Patronymic: " + student3.getPatronymicOfPerson() + " ");
        System.out.println("Date of birth: " + student3.getDateOfBirth() + " ");
        System.out.println("Passport number: " + student3.getPassportNumber() + " ");
        System.out.println("Gradebook number: " + student3.getGradeBook() + " ");
        System.out.print('\n');





    }

    public void a () {

    }

    protected void a (A a) {

    }

    protected void a (A a, A b) {

    }

}
