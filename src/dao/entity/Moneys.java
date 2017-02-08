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
public class Moneys {
    private int MoneyID;
    private Double MoneyValue;
    private String Addr;

    public Moneys() {
    }

    public Moneys(int MoneyID, Double MoneyValue, String Addr) {
        this.MoneyID = MoneyID;
        this.MoneyValue = MoneyValue;
        this.Addr = Addr;
    }

    public int getMoneyID() {
        return MoneyID;
    }

    public void setMoneyID(int MoneyID) {
        this.MoneyID = MoneyID;
    }

    public Double getMoneyValue() {
        return MoneyValue;
    }

    public void setMoneyValue(Double MoneyValue) {
        this.MoneyValue = MoneyValue;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    @Override
    public String toString() {
        return "MoneyID=" + MoneyID + "\nMoneyValue=" + MoneyValue + "\nAddr=" + Addr;
    }
    
    
}
