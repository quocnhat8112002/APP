/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
public class KETNOI {
    public static Connection dbConnector() {
        try {
            String url = "jdbc:mysql://localhost/csdlapp";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        Connection conn = KETNOI.dbConnector();
        if ( conn != null) {
            System.out.println("ket noi thanh cong");
        } else {
            System.out.println("Fail");
        }
    }
    public static Connection conn;
    Statement st1;
    ResultSet rs1;
    public static ResultSet ThucThiLenhSelect(){
        
        try {
            
            PreparedStatement st1 =conn.prepareStatement("Select * from loaihinhtd");
            ResultSet rs1 = st1.executeQuery();
            DefaultTableModel model =  jTable1.getModel();
            while(rs1.next()){
                Object objList[] ={rs1.getString("MA_TD"),rs1.getString("LOAI_HOATDONG"),rs1.getString("TIME"),rs1.getString("KCAL_TT")};
                model.addRow(objList);
            }
        } catch (Exception e) {
        }
        return null;
        
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class jTable1 {

        private static DefaultTableModel getModel() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTable1() {
        }
    }
    
}