/*basic application that asks a user to enter
radius of a circle and displays the area of the circle.*/

package com.company;

import javax.swing.JOptionPane;

public class Main {

    static double radius; //Holds the value of the radius
    static double area;  //Holds the value of Area

    public static void main(String[] args) {



        String inputStr = JOptionPane.showInputDialog("Enter a radius: ");
        radius = Double.parseDouble(inputStr);
        area = Math.PI * radius * radius;


        JOptionPane.showMessageDialog(null,"Area Of Circle With Radius " +radius + " is: " + area);
    }
}
