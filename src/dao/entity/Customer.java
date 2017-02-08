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
public class Customer {
    private int CustID;
    private String Name;
    private int Phone;
    private String Email;
    private String Addr;

    public Customer() {
    }

    public Customer(int CustID, String Name, int Phone, String Email, String Addr) {
        this.CustID = CustID;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Addr = Addr;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int CustID) {
        this.CustID = CustID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    @Override
    public String toString() {
        return "CustID=" + CustID + "\nName=" + Name + "\nPhone=" + Phone + "\nEmail=" + Email + "\nAddr=" + Addr ;
    }
    
    
}
