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
public class WithDraw {
    private int WDID;
    private Double Value;

    public WithDraw() {
    }

    public WithDraw(int WDID, Double Value) {
        this.WDID = WDID;
        this.Value = Value;
    }

    public int getWDID() {
        return WDID;
    }

    public void setWDID(int WDID) {
        this.WDID = WDID;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        return "WDID=" + WDID + "\nValue=" + Value;
    }
    
    
}
