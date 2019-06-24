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

//singleton pattern - a class must ensure that only single instance should be created
// and single object can be access by all other classes

//there are 2 types of singleton pattern
// 1. early instantiation - creating the instance at load time
// 2. lazy instantiation - creating the instance when it is needed

//advantages of singleton patterns =>
//saves memory bcz object creation doesn't need everytime.. object instance can be reuse again and again

//singleton pattern is used in multi threaded and database applications


//this is the early instantiation of singleton class
public class SingletonPattern {
    
    //defines the static member
    private static SingletonPattern sp =new SingletonPattern();
    
    //defines private constructor
    private SingletonPattern(){}
    
    //defines static factory method
    public static SingletonPattern getObjectInstance(){
        return sp;
    }
    
    public static void main(String args[]){
        
    }    
}

//why sp is static? bcz it gets memory only once and it contains instance of the Singleton object
//why constructor is private? bcz it will prevent instantiate Singleton class outside of the class
//static factory method? to provide global access point to the singleton object and returns the instance when the method is called

