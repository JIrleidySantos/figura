/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeo.PartJir;

/**
 *
 * @author mundo
 */
public class Cuadrado {

    public int lado;
    public double area;
    public double perimetro;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public void imprimir() {
        System.out.println("El lado del Cuadrado es: " + lado);
    }

    public double calcularArea() {
        return (lado * lado);
    }

    public double calcularPerimetro() {
        return (lado + lado + lado + lado);
    }
}
