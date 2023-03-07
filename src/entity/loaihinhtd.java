/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;



/**
 *
 * @author trinh
 */
public class loaihinhtd {
    private int ma;
    private String loai;
    private int time;
    private int kcal;

    public loaihinhtd() {
    }

    public loaihinhtd(int ma ,String loai,int time ,int kcal) {
        this.ma = ma;
        this.loai = loai;
        this.time = time;
        this.kcal = kcal;
        
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
    
    
}
