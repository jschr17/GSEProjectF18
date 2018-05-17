/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintance.IDepartment;
import Acquaintance.IJob;
import Acquaintance.IUser;
import java.util.Collection;

/**
 *
 * @author Rasmus
 */
public class PresJob implements IJob {
    
    int ID;
    int accessLevel;
    IDepartment department;
    
    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public int getAccessLevel() {
        return this.getAccessLevel();
    }

    @Override
    public Collection<IUser> getUserList() {
        return this.getUserList();
    }
    
    @Override
    public String getJob(){
        String name = this.getClass().getSimpleName();
        if(name.contains("dmin")){
            return "admin";
        }
        else if (name.contains("ase")){
        return "caseworker";
    }
        return null;
    
}
}
