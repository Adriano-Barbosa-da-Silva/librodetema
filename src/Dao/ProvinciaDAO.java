/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Provincia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author CFP36
 */
public class ProvinciaDAO {

    public LinkedList<Provincia> listar() {
        
        // declaracion de variables
        LinkedList<Provincia> lista = new LinkedList<>();
        Connection conectar = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql="";
        sql = "SELECT * FROM TB_PROVINCIA ORDER BY NOMBRE";
        // fin de declaraciones
        
        
        try {
            conectar = ConexionDAO.getConnection();
            stm = conectar.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
            Provincia p = new Provincia();
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            lista.add(p);
            }
            stm.close();
            rs.close();
            conectar.close();

        } catch (Exception e) {
            System.out.println("Error al conectar");
        }

        //Conectar a la base de datos
        //Select * From tb_provincia
        /*
        Provincia p = new Provincia();
        p.setId(1);
        p.setNombre("Cordoba");

        Provincia p1 = new Provincia();
        p1.setId(2);
        p1.setNombre("Jujuy");

        lista.add(p);
        lista.add(p1);
        */
        return lista;
        
    }

}
