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
public class medico { //Ejercicio leccion CU00632B
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;
    
    public medico() {
        
    }
    public medico(String n, String a, int e, boolean c, String ndi, String esp){
        nombre=n;
        apellido=a;
        edad=e;
        casado=c;
        numeroDocumentoIdentidad=ndi;
        especialidad=esp;
    }
    void setnombre(String nombre){this.nombre=nombre;}
    void setapellidos (String apellidos){this.apellido=apellidos;}
    void setedad (int edad){this.edad=edad;}
    void setcasado(boolean casado){this.casado=casado;}
    void setnumeroDocumentoIdentidad(String numeroDocumentoIdentidad){this.numeroDocumentoIdentidad=numeroDocumentoIdentidad;}
    void setespecialidad(String especialidad){
        
        if (!this.especialidad.equals(especialidad))
        {System.out.println("La especialidad del medico de nombre "+getapellido()+getnombre()+" ha cambiado");
        }
        this.especialidad=especialidad;
        {System.out.println("La nueva especialidad es: "+getespecialidad()+"\n");}
    }
    
    
    String getnombre(){return nombre;}
    String getapellido(){return apellido;}
    int getedad (){return edad;}
    boolean getcasado(){return casado;}
    String getnumeroDocumentoIdentidad(){return numeroDocumentoIdentidad;}
    String getespecialidad(){return especialidad;}
    
    void mostrar(){
        System.out.println("Nombre del medico: " + getnombre() + "\n");
        System.out.println("Apellido del medico: " + getapellido() + "\n");
        System.out.println("Edad del medico: " + getedad() + "\n");
        System.out.println("Estado civil del medico: " + getcasado() + "\n");
        System.out.println("DNI del medico: " + getnumeroDocumentoIdentidad() + "\n");
        System.out.println("Especialidad del medico: " + getespecialidad() + "\n");
        
    }
    
    String calculoParaMultiploEdad(){//Ejercicio leccion CU00633B
        int a;
        a=getedad()%5;
        if(a==0){return "La edad del medico "+getnombre()+" "+ getapellido()+ ", con especialidad "+getespecialidad()+", "+"es multiplo de 5";}
        else{return "Al médico "+getnombre()+" "+ getapellido()+ ", con especialidad "+getespecialidad()+", "+"le faltan " + (5-a) + "años para tener edad multiplo de 5";}
        
    }
    
}    
    
    

