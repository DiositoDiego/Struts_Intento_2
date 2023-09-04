package com.utez.edu.mx.struts_intento_2.person.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.utez.edu.mx.struts_intento_2.person.bean.BeanPersona;
import com.utez.edu.mx.struts_intento_2.person.dao.DaoPersona;

import java.util.List;


public class ActionPerson extends ActionSupport {
    DaoPersona daoPersona = new DaoPersona();
    List<BeanPersona> personas;
    BeanPersona persona;
    String data;
    String message;

    public String consultarPersonas() {
        setPersonas(daoPersona.getAllPeople());
        return SUCCESS;
    }

    public String addPersona(){
        System.out.println(data);
        persona = new Gson().fromJson(data, BeanPersona.class);
        if(daoPersona.addPersona(persona)){
            setMessage("success");
        } else {
            setMessage("failed");
        }
        return SUCCESS;
    }

    public List<BeanPersona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<BeanPersona> personas) {
        this.personas = personas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String person(){
        return SUCCESS;
    }
}
