package com.dev_j110.labwork1;

final public class Student<Number> extends Man {
    public Number gradeBook;







    public Student () {
        super();

    }

    public Student (String surnameOfPerson, String nameOfPerson, String patronymicOfPerson) {
        super(surnameOfPerson, nameOfPerson, patronymicOfPerson);
    }

    public Student (String surnameOfPerson, String nameOfPerson, String patronymicOfPerson, String dateOfBirth, String passportNumber, Number gradeBook) {
        super(surnameOfPerson, nameOfPerson, patronymicOfPerson, dateOfBirth, passportNumber);
        setGradeBook(gradeBook);
    }





    @Override
    public void setDocument(String passportNumber) {
        setPassportNumber(passportNumber);
        System.out.println("Student passport changed to: " + getPassportNumber());
    }


    public Number getGradeBook() {
        return gradeBook;
    }

    public void setGradeBook(Number gradeBook) {
        this.gradeBook = gradeBook;
    }
}
