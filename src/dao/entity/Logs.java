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
public class Logs {
    private int LogID;
    private int LogTypeID;
    private int ATMID;
    private String CardNo;
    private String LogDate;
    private Double Amount;
    private String Details;

    public Logs() {
    }

    public Logs(int LogID, int LogTypeID, int ATMID, String CardNo, String LogDate, Double Amount, String Details) {
        this.LogID = LogID;
        this.LogTypeID = LogTypeID;
        this.ATMID = ATMID;
        this.CardNo = CardNo;
        this.LogDate = LogDate;
        this.Amount = Amount;
        this.Details = Details;
    }

    public int getLogID() {
        return LogID;
    }

    public void setLogID(int LogID) {
        this.LogID = LogID;
    }

    public int getLogTypeID() {
        return LogTypeID;
    }

    public void setLogTypeID(int LogTypeID) {
        this.LogTypeID = LogTypeID;
    }

    public int getATMID() {
        return ATMID;
    }

    public void setATMID(int ATMID) {
        this.ATMID = ATMID;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getLogDate() {
        return LogDate;
    }

    public void setLogDate(String LogDate) {
        this.LogDate = LogDate;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    @Override
    public String toString() {
        return "LogID=" + LogID + "\nLogTypeID=" + LogTypeID + "\nATMID=" + ATMID + "\nCardNo=" + CardNo + "\nLogDate=" + LogDate + "\nAmount=" + Amount + "\nDetails=" + Details;
    }
    
    
    
}
