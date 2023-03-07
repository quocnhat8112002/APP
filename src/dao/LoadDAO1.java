/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
// cua bang dinh duong

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
public class LoadDAO1 {

    
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<dinhduong> getAlldinhduong() {
        Connection conn = KETNOI.dbConnector();
        String query = "select * from chedo_dd";
        try {
            List<dinhduong> list = new ArrayList<>();
            
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new dinhduong(rs.getString(2),rs.getInt(3),rs.getInt(4)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public void insert(String tp, int loai, int kcal ) {
        Connection conn = KETNOI.dbConnector();
        
        String query = "INSERT INTO chedo_dd (THANHPHAN, LOAI_BUAAN, TONGKCAL) VALUES ( ?, ?, ?) ";
        try {
            
            ps = conn.prepareStatement(query);
            
            ps.setString(1, tp);
            ps.setInt(2,loai );
            ps.setInt(3, kcal);
            int rowsInserted = ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
