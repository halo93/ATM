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
public class Stock {
    private int StockID;
    private int MoneyID;
    private int ARMID;
    private int Quantity;

    public Stock() {
    }

    public Stock(int StockID, int MoneyID, int ARMID, int Quantity) {
        this.StockID = StockID;
        this.MoneyID = MoneyID;
        this.ARMID = ARMID;
        this.Quantity = Quantity;
    }

    public int getStockID() {
        return StockID;
    }

    public void setStockID(int StockID) {
        this.StockID = StockID;
    }

    public int getMoneyID() {
        return MoneyID;
    }

    public void setMoneyID(int MoneyID) {
        this.MoneyID = MoneyID;
    }

    public int getARMID() {
        return ARMID;
    }

    public void setARMID(int ARMID) {
        this.ARMID = ARMID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "StockID=" + StockID + "\nMoneyID=" + MoneyID + "\nARMID=" + ARMID + "\nQuantity=" + Quantity;
    }
    
    
}
