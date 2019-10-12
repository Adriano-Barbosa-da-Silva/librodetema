/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static java.lang.Class.forName;
import java.sql.Connection;

/**
 *
 * @author CFP36
 */
public class ConexionDAO {

    private static String getconexionURL() {
        return "jdbc:mysql://" + ConfigManager.ConfigDAO.host + ":"+ ConfigManager.ConfigDAO.port +"/" +ConfigManager.ConfigDAO.db;

    }

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = java.sql.DriverManager.getConnection(getconexionURL(), ConfigManager.ConfigDAO.usr, ConfigManager.ConfigDAO.pwd);
            
            if(conn !=null){
              //  System.out.println("La conexión a la base se genero exitosamente");
            return conn;
        }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de seguimiento en getconnection():" + e.getMessage());
                  
        }
        return null;
    }

}
