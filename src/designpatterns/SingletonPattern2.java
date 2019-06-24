/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Ravindu Weerasinghe
 */

//this is the singleton design pattern using lazy instantiation

public class SingletonPattern2 {
    
    private static SingletonPattern2 sp;
    
    private SingletonPattern2(){}
    
    //only one thread ccan execute at a time
    public static synchronized SingletonPattern2 getInstance(){
      if(sp == null){  
        sp = new SingletonPattern2();
    }
      
      return sp;
   }
    
    public static void main(String args[]){}
    
}
