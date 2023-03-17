/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricase;

/**
 *
 * @author SAC2-9
 */
public class Figuras {
    double area;
    public void areacirculo (double radio) { 
    area = Math.PI*Math.pow(radio, 2);
    System.out.println("El area es:" + area);
}
    public void areacuadrado(double lado){
    area = lado *lado; 
    System.out.println("El area es:" + area);
    }
    public void areatriangulo (double base, double altura){
    area = (base* altura)/2; 
    System.out.println("El area es:" + area);
    }
    public void arearectangulo (double base, double altura) {
    area = base *altura;
    System.out.println("El area es:" + area);    
    }
    public void areaesfera (double radio2){
    area = 4 * (Math.PI)*Math.pow(radio2, 2);
    System.out.println("El area es:" + area);
    }
    public void areacubo (double arista) {
    area = 6 * Math.pow(arista, 2);
    System.out.println("El area es:" + area);
    }
    
}
