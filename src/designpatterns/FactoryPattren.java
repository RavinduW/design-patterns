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

import java.io.*;

abstract class Plan{
    
    protected double rate;
    
    abstract void getRate();
    
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
    
}

class DomesticPlan extends Plan{
    
    public void getRate(){
        rate = 3.5;
    }
}

class CommercialPlan extends Plan{
    
    public void getRate(){
        rate = 7.5;
    }
}

//this class is to generate object of concrete classes based on given info
class GetPlanFactory{
    
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        
        else if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        
        return null;
    }
}

public class FactoryPattren {
    public static void main(String args[])throws IOException{
        
        GetPlanFactory gpf = new GetPlanFactory();
        
        System.out.print("Enter the name plan => ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String planName = br.readLine();
        
        System.out.print("Enter the number of units => ");
        
        int units = Integer.parseInt(br.readLine());
        
        Plan p = gpf.getPlan(planName);
        
        System.out.println("Bill amount for "+planName+" of "+units+" units is"  );
        p.getRate();
        p.calculateBill(units);
        
    }
}
