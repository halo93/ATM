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
public class Cards {
    private String CardNo;
    private String Status;
    private int AcountID;
    private String PIN;
    private String StartDate;
    private String ExpiredDate;
    private int Attempt;

    public Cards() {
    }

    public Cards(String CardNo, String Status, int AcountID, String PIN, String StartDate, String ExpiredDate, int Attempt) {
        this.CardNo = CardNo;
        this.Status = Status;
        this.AcountID = AcountID;
        this.PIN = PIN;
        this.StartDate = StartDate;
        this.ExpiredDate = ExpiredDate;
        this.Attempt = Attempt;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getAcountID() {
        return AcountID;
    }

    public void setAcountID(int AcountID) {
        this.AcountID = AcountID;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(String ExpiredDate) {
        this.ExpiredDate = ExpiredDate;
    }

    public int getAttempt() {
        return Attempt;
    }

    public void setAttempt(int Attempt) {
        this.Attempt = Attempt;
    }

    @Override
    public String toString() {
        return "CardNo=" + CardNo + "\nStatus=" + Status + "\nAcountID=" + AcountID + "\nPIN=" + PIN + "\nStartDate=" + StartDate + "\nExpiredDate=" + ExpiredDate + "\nAttempt=" + Attempt;
    }
    
    
    
}
