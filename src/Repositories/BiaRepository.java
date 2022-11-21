/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.Bia;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pc
 */
public class BiaRepository implements IBiaRepository{
    
    final String SELECT_ALL_SQL = "SELECT * FROM Bia";
    private ArrayList<Bia> _lstBia;
    private IBiaRepository _iBiaRepository;

    public BiaRepository() {
        _lstBia = new ArrayList<>();
    }
    
    private ArrayList<Bia> getSelectSql(String sql, Object... args) {
        try {
            ArrayList<Bia> lst = new ArrayList<>();
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {                
                lst.add(new Bia(rs.getString("MaBia"), rs.getString("Ten"), rs.getString("MoTa"), rs.getString("MaNSX"), rs.getDouble("GiaNhap"), rs.getDouble("GiaBan"), rs.getDate("NSX"), rs.getDate("HSD")));
            }
            return lst;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public ArrayList<Bia> findAll() {
        return getSelectSql(SELECT_ALL_SQL);
    }
    
    
    
}
