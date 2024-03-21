/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo_jand;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        
        persona1.setNombre("Pedro");
        persona1.setEdad(20);
        persona1.setPeso(80);
        persona1.setAltura(1.69);
        persona1.setSexo('M'); 
        
        int resultadoIMC = persona1.calcularIMC();
        System.out.println("Resultado del IMC: " + resultadoIMC);
        
        boolean esMayor = persona1.esMayorDeEdad();
        System.out.println("¿Es mayor de edad?: " + esMayor);
        
        System.out.println(persona1.toString());
        
        Persona persona2 = new Persona("Ana", 24, "1234567890", 'M', 60, 1.65);
        
        resultadoIMC = persona2.calcularIMC();
        System.out.println("Resultado del IMC: " + resultadoIMC);
        

        esMayor = persona2.esMayorDeEdad();
        System.out.println("¿Es mayor de edad?: " + esMayor);
        
        System.out.println(persona2.toString());
    }
    
}
    

