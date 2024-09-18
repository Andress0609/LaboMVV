/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controllers.CustomerController;
import Models.CustomerList;
import Views.CustomerConsole;

/**
 *
 * @author jprod
 */
public class CustomerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        CustomerList model = new CustomerList();
        CustomerConsole view = new CustomerConsole();
        
        CustomerController controller = new CustomerController(model,view);
        view.setController(controller);
        view.show();
    }
    
}
