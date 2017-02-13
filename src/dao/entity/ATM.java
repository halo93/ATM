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
public class ATM {
    private int ATMID;
    private String Branch;
    private String Addr;

    public ATM() {
    }

    public ATM(int ATMID, String Branch, String Addr) {
        this.ATMID = ATMID;
        this.Branch = Branch;
        this.Addr = Addr;
    }

    public int getATMID() {
        return ATMID;
    }

    public void setATMID(int ATMID) {
        this.ATMID = ATMID;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    @Override
    public String toString() {
        return "ATMID=" + ATMID + "\nBranch=" + Branch + "\nAddr=" + Addr;
    }
    
    
}
