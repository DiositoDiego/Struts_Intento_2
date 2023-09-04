package com.utez.edu.mx.struts_intento_2.person.dao;

import com.utez.edu.mx.struts_intento_2.person.bean.BeanPersona;
import com.utez.edu.mx.struts_intento_2.utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPersona {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    final String SQL_GET_ALL_PEOPLE = "SELECT * FROM people";
    final String SQL_INSERT_ONE_PERSON = "INSERT INTO people(name, lastname, surname, gender, birthdate) VALUES (?,?,?,?,?)";


    public List<BeanPersona> getAllPeople() {
        List<BeanPersona> personas = new ArrayList<>();
        try{
            con = MySQLConnection.getConnection();
            ps = con.prepareStatement(SQL_GET_ALL_PEOPLE);
            rs = ps.executeQuery();
            while(rs.next()){
                BeanPersona persona = new BeanPersona();
                persona.setIdPerson(rs.getInt("idPerson"));
                persona.setName(rs.getString("name"));
                persona.setLastname(rs.getString("lastname"));
                persona.setSurname(rs.getString("surname"));
                persona.setGender(rs.getString("gender").charAt(0));
                persona.setBirthdate(rs.getString("birthdate"));
                personas.add(persona);
            }
            return personas;
        }catch (SQLException e){
            Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try{
                if (con != null)
                    con.close();
                if(ps != null)
                    ps.close();
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {
                Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return null;
    }

    public Boolean addPersona(BeanPersona persona){
        try{
            con = MySQLConnection.getConnection();
            ps = con.prepareStatement(SQL_INSERT_ONE_PERSON);
            ps.setString(1, persona.getName());
            ps.setString(2, persona.getLastname());
            ps.setString(3, persona.getSurname());
            ps.setString(4, persona.getGender()+"");
            ps.setString(5, persona.getBirthdate());
            rs = ps.executeQuery();
            return rs.rowInserted();
        }catch(SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if(con != null){
                    con.close();
                }
                if (ps != null){
                    ps.close();
                }
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
