/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controllers.CustomerController;
import Models.CustomerList;
import Models.CustomerSet;
import Views.CustomerConsole;
<<<<<<< HEAD
import Views.FrmCustomer;
=======
import Views.CustomerFrame;
>>>>>>> ch

/**
 *
 * @author jprod
 */
public class CustomerMain {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    public static void main(String[] args) {       
        CustomerSet model = new CustomerSet();
        FrmCustomer view = new FrmCustomer();
=======
    public static void main(String[] args) {
        
        CustomerSet model = new CustomerSet();
        CustomerConsole view = new CustomerConsole();
        
>>>>>>> ch
        CustomerController controller = new CustomerController(model,view);
        view.setController(controller);
        CustomerFrame frm = new CustomerFrame();
        frm.setVisible(true);
        view.show();
    }
    
}
