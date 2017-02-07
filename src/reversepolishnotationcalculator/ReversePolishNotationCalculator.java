/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversepolishnotationcalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author philliphbrink
 */
public class ReversePolishNotationCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayStack list = new ArrayStack();
        ArrayStack factors = new ArrayStack();

        while (true) {
            String currentLine = reader.nextLine();
            String[] currentList = currentLine.split(" ");
            for (String obj : currentList) {
                try {
                    list.push(Integer.parseInt(obj));
                } catch (NumberFormatException ex) {
                    factors.push(obj);
                }
            }
            while (!factors.isEmpty()) {
                if (list.getTop() > 1) {
                    if (!factors.isEmpty()) {
                        switch ((String) factors.pop()) {
                            case "+":
                                list.push((int) list.pop() + (int) list.pop());
                                break;
                            case "-":
                                list.push((int) list.pop() - (int) list.pop());
                                break;
                            case "*":
                                list.push((int) list.pop() * (int) list.pop());
                                break;
                            case "/":
                                list.push((int) list.pop() / (int) list.pop());
                                break;
                        }
                    }
                } else {
                    break;
                }
            }
                for (Object object : list) {
                    System.out.println(">" + object.toString());
                }
            
        }

    }

}
