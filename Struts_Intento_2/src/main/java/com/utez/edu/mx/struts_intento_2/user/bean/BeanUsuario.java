package com.utez.edu.mx.struts_intento_2.user.bean;


import com.utez.edu.mx.struts_intento_2.person.bean.BeanPersona;

public class BeanUsuario {

    int idUser;
    String username;
    boolean status;
    int idPerson;
    BeanPersona persona;

    public BeanUsuario(int idUser, String username, boolean status, int idPerson, BeanPersona persona) {
        this.idUser = idUser;
        this.username = username;
        this.status = status;
        this.idPerson = idPerson;
        this.persona = persona;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public BeanPersona getPersona() {
        return persona;
    }

    public void setPersona(BeanPersona persona) {
        this.persona = persona;
    }
}
