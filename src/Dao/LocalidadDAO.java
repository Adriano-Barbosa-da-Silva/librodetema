/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Localidad;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author SERGIO
 */
public class LocalidadDAO {
 
   public LinkedList<Localidad> getLocalidadByIdProvincia(int idp) {
       
       try {
            LinkedList<Localidad> lista = new LinkedList<>();
            Connection cn = ConexionDAO.getConnection();
            java.sql.Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tb_localidad WHERE id_provincia = " + idp + " ORDER BY nombre ");
            
            while (rs.next()){
            Localidad l = new Localidad();
            l.setIdLocalidad(rs.getLong(1));
            l.setNombre(rs.getString(2));
            l.setNom_departamento(rs.getString(3));
            l.setId_provincia(rs.getInt(4));
            lista.add(l);
               // System.out.println(l.toString());
            }
            cn.close();
            stm.close();
            rs.close();
            return lista;
           
           
       } catch (Exception e) {
           System.out.println("fallo la consulta a la tabla localidades");
           return null;
       }
      
        
  }

}
