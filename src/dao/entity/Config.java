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
public class Config {
    private int ConfigID;
    private String DateModified;
    private Double MinWithDraw;
    private Double MaxWithDraw;
    private int NumPerPage;

    public Config() {
    }

    public Config(int ConfigID, String DateModified, Double MinWithDraw, Double MaxWithDraw, int NumPerPage) {
        this.ConfigID = ConfigID;
        this.DateModified = DateModified;
        this.MinWithDraw = MinWithDraw;
        this.MaxWithDraw = MaxWithDraw;
        this.NumPerPage = NumPerPage;
    }

    public int getConfigID() {
        return ConfigID;
    }

    public void setConfigID(int ConfigID) {
        this.ConfigID = ConfigID;
    }

    public String getDateModified() {
        return DateModified;
    }

    public void setDateModified(String DateModified) {
        this.DateModified = DateModified;
    }

    public Double getMinWithDraw() {
        return MinWithDraw;
    }

    public void setMinWithDraw(Double MinWithDraw) {
        this.MinWithDraw = MinWithDraw;
    }

    public Double getMaxWithDraw() {
        return MaxWithDraw;
    }

    public void setMaxWithDraw(Double MaxWithDraw) {
        this.MaxWithDraw = MaxWithDraw;
    }

    public int getNumPerPage() {
        return NumPerPage;
    }

    public void setNumPerPage(int NumPerPage) {
        this.NumPerPage = NumPerPage;
    }

    @Override
    public String toString() {
        return "ConfigID=" + ConfigID + "\nDateModified=" + DateModified + "\nMinWithDraw=" + MinWithDraw + "\nMaxWithDraw=" + MaxWithDraw + "\nNumPerPage=" + NumPerPage;
    }
    
    
}
