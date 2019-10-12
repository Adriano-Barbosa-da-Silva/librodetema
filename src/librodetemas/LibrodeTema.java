/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librodetemas;

import Dao.ProvinciaDAO;
import Entidades.Provincia;
import UI.ProvinciaUI;
import java.util.LinkedList;

/**
 *
 * @author CFP36
 */
public class LibrodeTema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        /*ProvinciaDAO provDAO = new ProvinciaDAO();
        LinkedList<Provincia> misProvincias = provDAO.listar();
        
        for (Provincia prov : misProvincias) {
            System.out.println(prov.getNombre());
        }*/
        
        ProvinciaUI form = new ProvinciaUI();
        form.setVisible(true);
        
    }
    
}
