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
public class Account {
    private int AccountID;
    private int CustID;
    private String AccountNo;
    private int ODID;
    private int WDID;
    private Double Balance;

    public Account() {
    }

    public Account(int AccountID, int CustID, String AccountNo, int ODID, int WDID, Double Balance) {
        this.AccountID = AccountID;
        this.CustID = CustID;
        this.AccountNo = AccountNo;
        this.ODID = ODID;
        this.WDID = WDID;
        this.Balance = Balance;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int CustID) {
        this.CustID = CustID;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    public int getODID() {
        return ODID;
    }

    public void setODID(int ODID) {
        this.ODID = ODID;
    }

    public int getWDID() {
        return WDID;
    }

    public void setWDID(int WDID) {
        this.WDID = WDID;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "AccountID=" + AccountID + "\nCustID=" + CustID + "\nAccountNo=" + AccountNo + "\nODID=" + ODID + "\nWDID=" + WDID + "\nBalance=" + Balance;
    }
    
    
}
