/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcularpesoideal;

/**
 *
 * @author ManueloD-21
 */
import java.util.Scanner;
public class Calcularpesoideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMensajeInicial();
        solicitarEdad();
        int edad=capturarEdad();
        int pesoIdeal=calcularPesoIdeal(edad);
        mostrarPesoIdeal(pesoIdeal);
        mostrarMensajeFinal();
    }
    public static void mostrarMensajeInicial(){
            System.out.println("Calculo de peso ideal");
    }
    public static void solicitarEdad(){
            System.out.println("Ingrese su edad");
    }
    public static int capturarEdad(){
        Scanner capturador=new Scanner(System.in);
        int capturado=capturador.nextInt();
        return capturado;
    }
    public static int calcularPesoIdeal(int e){
        int resultado= e*2+8;
        return resultado;
    }
    public static void mostrarPesoIdeal(int p){
        System.out.println("Su peso ideal es "+p);
    }
    public static void mostrarMensajeFinal(){
        System.out.println("Gracias por ocupar programas Manu.exe");
    }
            
        
        
        // TODO code application logic here
    }
    


