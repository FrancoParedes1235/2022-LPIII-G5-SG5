/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10ejer3;

/**
 *
 * @author HOUSE
 */
public class PruebaE3 {

    public static <E> boolean isEqualTo(E a1, E a2) {
        System.out.println("Comparando: ");
        return a1.equals(a2);
    }

    public static void main(String[] args) {

        int a1 = 1, a2 = 1;
        System.out.println(isEqualTo(a1, a2));
        a1 = 4;
        a2 = 5;
        System.out.println(isEqualTo(a1, a2));
        
        double b1 = 3.5, b2 = 3.5;
        System.out.println(isEqualTo(b1, b2));
        b1 = 4.5;
        b2 = 5.5;
        System.out.println(isEqualTo(b1, b2));
        
        String c1 = "perro", c2 = "perro";
        System.out.println(isEqualTo(c1, c2));
        c1 = "gato";
        c2 = "loro";
        System.out.println(isEqualTo(c1, c2));
    }
}
