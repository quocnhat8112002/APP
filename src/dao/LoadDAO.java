/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mycompany.app.KETNOI;
import entity.dinhduong;
import entity.loaihinhtd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class LoadDAO {

    
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<loaihinhtd> getAllloaihinhtd() {
        Connection conn = KETNOI.dbConnector();
        String query = "select * from loaihinhtd";
        try {
            List<loaihinhtd> list = new ArrayList<>();
            
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new loaihinhtd(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    

    public void update( int ma,String loai, int time, int kcal ) {
        Connection conn = KETNOI.dbConnector();
        
        String query = "update loaihinhtd set LOAI_HOATDONG =? ,TIME =? ,KCAL_TT =? where MA_TD =? ";
        try {
            
            ps = conn.prepareStatement(query);
            
            ps.setString(1, loai);
            ps.setInt(2, time);
            ps.setInt(3, kcal);
            ps.setInt(4, ma);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insert( int ma,String loai, int time, int kcal ) {
        Connection conn = KETNOI.dbConnector();
        
        String query = "INSERT INTO loaihinhtd (MA_TD, LOAI_HOATDONG, TIME, KCAL_TT) VALUES (?, ?, ?, ?) ";
        try {
            
            ps = conn.prepareStatement(query);
            
            ps.setInt(1, ma);
            ps.setString(2, loai);
            ps.setInt(3, time);
            ps.setInt(4, kcal);
            int rowsInserted = ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void delete( int ma) {
        Connection conn = KETNOI.dbConnector();
        
        String query = "DELETE FROM loaihinhtd WHERE MA_TD=? ";
        try {
            
            ps = conn.prepareStatement(query);
            ps.setInt(1, ma);
            int rowsDeleted = ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<dinhduong> getAlldinhduong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
