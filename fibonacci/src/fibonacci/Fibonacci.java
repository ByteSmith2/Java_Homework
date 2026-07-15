/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author ADMIN
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 90;          // số lượng số Fibonacci cần xuất
        long a = 1, b = 1;   // 2 số đầu tiên đều là 1

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b; // số sau = tổng 2 số trước
            a = b;
            b = next;
        }
        System.out.println();
    }
    
}
