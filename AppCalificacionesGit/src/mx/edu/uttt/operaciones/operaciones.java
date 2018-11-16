/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package mx.edu.uttt.operaciones;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import vista_profe.espacio_profe;
import run.main;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 *//**
public class operaciones {

    //se crean las vistas como variables 
    private espacio_profe profe;
   private main login;
   //se asigna a cada variable su vista
   
   
   
   public Operaciones(){
      login= new main();
      profe= new espacio_profe();
   }
//se extrae lo que ungresas en el main o login 
   public void ingrsarusuario(String usuario){
      //si usuaario es igual a maestro entonces te manda a la vista del profesor 
      //donde podras promediar a el alumno
       if(usuario.equalsIgnoreCase("luis")){
         profe.show();
           System.out.println("validacion exitosa");
      }
      else if  (usuario.equalsIgnoreCase("jesus")) {
          profe.show();
           System.out.println("validacion de jesus exitosa");
       }
      //si no te regresa denuevo a el login
      else{
         System.out.println("fallo validacion");
          JOptionPane.showMessageDialog(null, "!!!!no existe este profesor registrado"+"\n"+"ingresar de profesor existente!!!!");
      }	
   }public void llll(){
   login.show();
   } 
    
}
 */