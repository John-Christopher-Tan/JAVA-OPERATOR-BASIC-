/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaj.operator.basic;


public class AVAJOPERATORBASIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10, n2 = 4, n3 = -7;

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n3);
        System.out.println(n1 % n3);
        // the arithmetic operator that reacts differently is the (/) and (%)
        // the (/) operator did not include the decimal of the output of n1 / n3, instead of -1.428... the output is -1 only
        // the (%) operator is the one that takes the left number sign, example if the n1 and n3 switch place the output is -3
    }
    
}
