/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import clientenet.*;
/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main(String[] args)
    {
        
        String res=obtenermaterias("4886089");
        System.out.println("Materias del estudiante de CI: 4886089");
        System.out.println(res);
                       
    }
    private static String obtenermaterias(java.lang.String ci) {
        WebService1 service = new WebService1();
        WebService1Soap port = service.getWebService1Soap();
        return port.obtenermaterias(ci);
    }


}
