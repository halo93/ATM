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
public class OverDraft {
    private int ODID;
    private Double Value;

    public OverDraft() {
    }

    public OverDraft(int ODID, Double Value) {
        this.ODID = ODID;
        this.Value = Value;
    }

    public int getODID() {
        return ODID;
    }

    public void setODID(int ODID) {
        this.ODID = ODID;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        return "ODID=" + ODID + "\nValue=" + Value ;
    }
    
    
}
