/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entity;

/**
 *
 * @author ChipZero
 */
public class LogType {
    private int LogTypeID;
    private String Description;

    public LogType() {
    }

    public LogType(int LogTypeID, String Description) {
        this.LogTypeID = LogTypeID;
        this.Description = Description;
    }

    public int getLogTypeID() {
        return LogTypeID;
    }

    public void setLogTypeID(int LogTypeID) {
        this.LogTypeID = LogTypeID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "LogTypeID=" + LogTypeID + "\nDescription=" + Description;
    }
    
    
}
