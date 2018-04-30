/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintance.IInquiry;

/**
 *
 * @author goope
 */
public class BusinessController {
    
    private static BusinessFacade facade = BusinessFacade.getInstance();
            
    public Inquiry createInquiry(long cprNumber, String problemDescription, String firstname, String surname, String roadName, String houseNumber, String floor, int postNumber, String city, String tlfNumber) 
    {
        Inquiry inquiry = new Inquiry(cprNumber, problemDescription, firstname, surname, roadName, houseNumber, floor, postNumber, city, tlfNumber);
        return inquiry;        
    }  
    
    public void testSave(){
        IInquiry inq = new Inquiry(1234567891, "Problem", "Jonas", "Schröder", "vej", "11b", "2tv", 2000, "Fredensborg", "55667788");
        boolean ret = sendToDB(inq);
        System.out.println("Finished" + " " + ret);
    }
    
    // Kan vi sørge for at denne metode kan bruges til at gemme både Inquiry og Case, nu hvor de arver?
    public boolean sendToDB(IInquiry inquiry){
        boolean returnMessage;
        
        returnMessage = facade.saveInq(inquiry);
        
        if  (!returnMessage) {
            
            // Display errormessage (snak med GUI)
            
            while (!returnMessage) {
                //returnMessage = facade.saveInq(inquiry);
            }
            
            // Remove errormessage (snak med GUI)
        }
        return true;
    }    
}