/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;
import model.Category;

/**
 *
 * @author Nguyen Hoang
 */
public class DAO extends DBContext {
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Product> getProductByCateID(String id) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where cateID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public Product getProductByID(String id) {
        String sql = "select * from product where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public List<Product> getProductByName(String name) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where [name] like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + name + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public Account login(String user, String pass) {
        String sql = "select * from Account where [user] = ? and pass = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public Account checkAccount(String user) {
        String sql = "select * from Account where [user] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void signUp(String user, String pass) {
        String sql = "insert into Account values (?, ?, 0, 0)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
}
