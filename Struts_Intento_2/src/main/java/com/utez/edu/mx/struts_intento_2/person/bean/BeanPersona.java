package com.utez.edu.mx.struts_intento_2.person.bean;

public class BeanPersona {
    int idPerson;
    String name;
    String lastname;
    String surname;
    char gender;
    String birthdate;

    public BeanPersona() {
    }

    @Override
    public String toString() {
        return "BeanPersona{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    public BeanPersona(int idPerson, String name, String lastname, String surname, char gender, String birthdate) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
