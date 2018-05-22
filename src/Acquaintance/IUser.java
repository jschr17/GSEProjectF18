/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;

import java.sql.Timestamp;

/**
 *
 * @author Alexa
 */
public interface IUser {

    IJob getJob();

    String getFirstName();

    String getLastName();

    String getUserName();

    String getPhoneNumber();

    String getMail();

    boolean getActive();

    void changePassword(String password);

    String getPassword();

    Timestamp getCreatedTime();

    Timestamp getLastLoginTime();

    int getUserID();

}
