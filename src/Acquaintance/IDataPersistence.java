/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;

/**
 *
 * @author Alexa
 */
public interface IDataPersistence {
    
    public boolean saveInquiry(IInquiry inquiry);

    public boolean saveCase(ICase case1);
    
}
