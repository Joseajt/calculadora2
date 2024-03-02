/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author josej
 */
import javax.swing.JOptionPane;
public class CALCULADORA {

    public static void main(String[] args) {
      int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        
        operaciones op = new operaciones();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);
        op.modulo(n1,n2);
        op.mostrarResultados();
    }
    
}
