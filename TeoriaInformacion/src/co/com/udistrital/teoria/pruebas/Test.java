/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.pruebas;

import co.com.udistrital.teoria.vo.MemoryElementVO;
import co.com.udistrital.teoria.vo.OutputElementVO;

/**
 *
 * @author mmedina
 */
public class Test {

    public static void main(String[] args) {
        String palabra = "Mu";
        String palabraBinaria = "";
        char[] array = palabra.toCharArray();
        for (char c : array) {
            //Se imprime el binario letra por letra
            System.out.println("BINARY: " + Integer.toBinaryString(c));
            palabraBinaria += Integer.toBinaryString(c);
        }
        System.out.println("Palabra en Binario: " + palabraBinaria);

        int[] bitsLogicos = {0, 1};
        int[] bitsOperadores = {0, 1};

        // Codificacion de la palabra
        String salida1 = "";
        String salida2 = "";
        String salida3 = "";
        char [] codesPalabra = palabraBinaria.toCharArray();
        MemoryElementVO m1 = new MemoryElementVO(0);
        MemoryElementVO m2 = new MemoryElementVO(0);
        OutputElementVO s1 = null;
        OutputElementVO s2 = null;
        
        for (char c : codesPalabra) {
            Integer input = Integer.parseInt(""+c);
            m1.setNextState(input);
            m2.setNextState(m1.getState());
            s1 = new OutputElementVO(input, m1.getState());
            s2 = new OutputElementVO(m1.getState(), m2.getState());
//            s1 = new OutputElementVO(input, 0);
//            s2 = new OutputElementVO(input, m1.getState());
            
//            palabraCodificada += s1.getXORResult()+ "" + s2.getXORResult();
            salida1 += input;
            salida2 += s1.getXORResult();
            salida3 += s2.getXORResult();
            
            m1.setState(m1.getNextState());
            m2.setState(m2.getNextState());
        }
        
        System.out.println("Salida 1: " + salida1);
        System.out.println("salida 2: " + salida2);
        System.out.println("salida 3: " + salida3);
        
    }
}
