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
         operaciones ope1= new operaciones ();
        ope1.leerNumeros();
        ope1.suma();
        ope1.resta();
        ope1.multiplicacion();
        ope1.division();
        ope1.modulo();
        ope1.mostrarResultados();
    }
}
