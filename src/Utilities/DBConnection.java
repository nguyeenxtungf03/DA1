/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DBConnection {
    
    private static String hostName = "DESKTOP-4ARSON1\\SQLEXPRESS";
    private static String acc = "sa";
    private static String pass = "123456";
    private static String dbName = "DuAn1";
    private static String connectionSql
            = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName +";encrypt=true;trustServerCertificate=true;";
    private static String  driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection conn;
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("Lỗi Driver");
        }
    }
    
    //1.Mở kết nối
    public static Connection openDbConnection() {
        try {
            return DriverManager.getConnection(connectionSql, acc, pass);
        } catch (Exception e) {
            return null;
        }
    }
    
    //2.Thực thi truy vấn thêm, sửa, xóa
    public static int Excute(String sql, Object...args) {
        PreparedStatement pstm = getStmt(sql, args);
        try {
            try {
                return pstm.executeUpdate();
            } finally {
                pstm.close();
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại Excute");
            return 0;
        }
    }
    
    //3.Trả lại 1 tập đối tượng
    public static ResultSet getDataFromQuery(String sql, Object...args) throws SQLException {
        PreparedStatement pstm = getStmt(sql, args);
         return pstm.executeQuery();
    }
    
    //4.Chuẩn bị câu truy vấn trước khi thực thi - Các varargs sử dụng dấu ba chấm sau kiểu dữ liệu
    public static PreparedStatement getStmt(String sql, Object...args) {
        try {
            conn = openDbConnection();
            PreparedStatement ps;
            //ps = conn.prepareCall(sql) Gọi stored procedure
            ps = conn.prepareStatement(sql);//Dùng để triển khai các câu lệnh truy vấn thường
            for (int i = 0;i < args.length; i++){
                ps.setObject(i + 1, args[i]);//Cộng các value sau câu truy vấn
            }
            return ps;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

