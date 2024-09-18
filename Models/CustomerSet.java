/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
<<<<<<< HEAD
 * @author andre
 */
public class CustomerSet implements IManager<Customer> {
    private HashSet<Customer> set;
    
    public CustomerSet(){
        set = new HashSet<Customer>();
        
    }
=======
<<<<<<< HEAD
 * @author munoz
 */
public class CustomerSet implements IManager<Customer> {

    private HashSet<Customer> set;

    public CustomerSet() {
        set = new HashSet<>();
    }

>>>>>>> ch
    @Override
    public boolean add(Customer element) {
        return set.add(element);
    }

    @Override
    public Customer get(Customer element) {
<<<<<<< HEAD
        for(Customer current : set){
            if(current.getId()==element.getId())
                return current;
        }
        return null;
     }

    @Override
    public boolean set(Customer element) {
     for(Customer current : set){
         if(current.getId()==element.getId()){
             set.remove(current);
             set.add(element);
             return true;
         }
     }
     return false;
=======
        for (Customer current : set) {
            if (current.getId() == element.getId()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean set(Customer element) {
        for (Customer current : set) {
            if (current.getId() == element.getId()) {
                set.remove(current);
            }
            set.add(element);
            return true;
        }
        return false;
>>>>>>> ch
    }

    @Override
    public boolean remove(Customer element) {
<<<<<<< HEAD
       for(Customer current : set){
           if(current.getId()==element.getId()){
               return set.remove(current);
           }
       }
       return false;
    }

    @Override
    public List getAll() {
        return new ArrayList<>(set);
       }
    
=======
        for (Customer current : set) {
            if (current.getId() == element.getId()) {
                return set.remove(current);
            }

        }
        return false;
    }
=======
 * @author Dell
 */
public class CustomerSet implements IManager<Customer>{
 private HashSet <Customer> set;

public CustomerSet(){
 set = new HashSet<Customer>();
}
 
 
 @Override   
 public boolean add(Customer element) {
    return set.add(element);
    
}
    

    @Override
    public Customer get(Customer element) {
        for(Customer current:set){
            if(current.getId()==element.getId())
                return current;
        }
     return null;
  }

    @Override
    public boolean set(Customer element) {
        for( Customer current:set){
            if(current.getId()==element.getId()){
                set.remove(current);
                set.add(element);
                return true;
            }
        }
     return false;
   }

    @Override
    public boolean remove(Customer element) {
        for(Customer current:set){
            if(current.getId()==element.getId()){
                return set.remove(current);
            }
        }
        return false;
   }
>>>>>>> development

    @Override
    public List getAll() {
        return new ArrayList<Customer>(set);
<<<<<<< HEAD
    }

=======
   }

    
>>>>>>> development
>>>>>>> ch
}
