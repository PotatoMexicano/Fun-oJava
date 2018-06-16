/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package função;

import java.io.*;
import java.util.*;

/**
 *
 * @author Gabri
 */
public class Função {

    static List<String> vetor = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        PrintWriter output = null;

        try {
            input = new BufferedReader(new FileReader("01.in"));
            output = new PrintWriter(new FileWriter("02.out"));

            String num;
            String[] temp;
            int size = 0;
            double resultado = 0;
            output.println("F(x) = x² + x");
            output.println("");
            while ((num = input.readLine()) != null) {
                temp = num.split(" ");
                vetor.addAll(Arrays.asList(temp));
                size = temp.length;
                Arrays.sort(temp);
                for (int i = 0; i < size; i++) {
                    resultado = (Math.pow(Integer.valueOf(temp[i]), 2) + Integer.valueOf(temp[i]));
                    output.println("F("+temp[i]+") = "+resultado);
                    //System.out.println(temp[i] + " -- " + resultado);
                }
            }
        } finally {

            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }

}
