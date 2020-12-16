/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Jeremy
 */
import java.util.*;
import javax.swing.*;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String outputStr = "Hello world\n" + "Hello, Jeremy!\n"
                + "Welcome to Java programming!";
        System.out.println(outputStr);
        JOptionPane.showMessageDialog(null, outputStr, "MY WINDOW OUTPUT",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
