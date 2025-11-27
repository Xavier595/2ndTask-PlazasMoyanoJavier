/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author javie
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] table = new int[5];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
        }
        System.out.println("Random values: " + Arrays.toString(table));
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted values: " + Arrays.toString(table));
        //Edit by Javier
    }

}
