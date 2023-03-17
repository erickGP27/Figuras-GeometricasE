/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricase;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Datos {
     Scanner input = new Scanner (System.in);
    public static double area; 
    public static double lado; 
    public static double radio; 
    public static double radio2;
    public static double base ; 
    public static double altura ; 
    public static double diametro; 
    public static double arista;
    
    public void Datos(){
        System.out.println("\t\n //Area del Circulo//");
        System.out.println("\t\nIngresa el valor del radio");
        radio = input.nextDouble();

        System.out.println("\t\n //Area del cuadrado//");
        System.out.println("\t\nIngresa el valor del lado");
        lado = input.nextDouble();

        System.out.println("\t\n //Area del triangulo//");
        System.out.println("\t\nIngresa el valor de la base y la altura");
        base = input.nextDouble();
        altura = input.nextDouble();
        System.out.println("\t\n //Area del Rectangulo//");
        System.out.println("\t\nIngresa el valor de la base y la altura");
        base = input.nextDouble();
        altura = input.nextDouble();
        System.out.println("\t\n //Area de la Esfera//");
        System.out.println("\t\nIngresa el valor del radio");
        radio2 = input.nextDouble();
        System.out.println("\t\n //Area del Cubo//");
        System.out.println("\t\n Ingresa el valor de la Arista");
        arista = input.nextDouble();
        
        Figuras figuras = new Figuras();
        figuras.areacirculo(radio);
        figuras.areacuadrado(lado);
        figuras.areatriangulo(base, altura);
        figuras.areaesfera(radio2);
        figuras.areacubo(arista);
        
        
    }
    }
    
