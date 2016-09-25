/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author carli
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        medico m1=new medico("Hugo","Perez",50,false,"25348795","cardiologo");
        m1.mostrar();
        m1.setespecialidad("traumatologo");//Ejercicio leccion CU00632B
        m1.mostrar();
        
        String multiplo;
        multiplo=m1.calculoParaMultiploEdad();
        System.out.println(multiplo);
    }
    
}
