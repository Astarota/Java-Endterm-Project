package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    static Connection cn=null;

    private Connect(){

    }
    public static java.sql.Connection getConnect(){
        try {
            if(cn==null){
                Class.forName("org.postgresql.Driver");
                cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Endterm","postgres","20020615");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cn;
    }
}
