package com.dev_j110.labwork1;

public class Man {
    private String surnameOfPerson;
    private String nameOfPerson;
    private String patronymicOfPerson;
    private String dateOfBirth;
    private String passportNumber;





    protected Man () {
        this(null, null, null, null, null);
    }

    protected Man (String surnameOfPerson, String nameOfPerson, String patronymicOfPerson) {
        this(surnameOfPerson, nameOfPerson, patronymicOfPerson, null, null);
    }

    public Man(String surnameOfPerson, String nameOfPerson, String patronymicOfPerson, String dateOfBirth, String passportNumber) {
        setSurnameOfPerson(surnameOfPerson);
        setNameOfPerson(nameOfPerson);
        setPatronymicOfPerson(patronymicOfPerson);
        setDateOfBirth(dateOfBirth);
        setPassportNumber(passportNumber);

    }






    public void setDocument (String passportNumber) {
        setPassportNumber(passportNumber);
        System.out.println("Man passport changed to: " + getPassportNumber());
    }

    public final void setDate (String dateOfBirth) {
        setDateOfBirth(dateOfBirth);
        System.out.println("Man date of birth changed to: " + getDateOfBirth());
    }







    public String getSurnameOfPerson() {
        return surnameOfPerson;
    }

    public void setSurnameOfPerson(String surnameOfPerson) {
        this.surnameOfPerson = surnameOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public String getPatronymicOfPerson() {
        return patronymicOfPerson;
    }

    public void setPatronymicOfPerson(String patronymicOfPerson) {
        this.patronymicOfPerson = patronymicOfPerson;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
