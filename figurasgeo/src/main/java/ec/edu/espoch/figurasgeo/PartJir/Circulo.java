/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeo.PartJir;

/**
 *
 * @author mundo
 */
public class Circulo {

    double pi = 3.1416;

    public int radio;
    public double area;
    public double perimetro;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("El radio del Circulo es: " + radio);
    }

    public double calcularArea() {
        return (radio * radio) / pi;
    }

    public double calcularPerimetro() {
        return 2 * radio * pi;
    }

}
