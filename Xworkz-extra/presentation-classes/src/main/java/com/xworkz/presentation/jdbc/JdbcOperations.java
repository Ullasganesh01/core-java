package com.xworkz.presentation.jdbc;

import java.sql.*;
import java.util.*;

public class JdbcOperations{

    public boolean addUser(UsersDto dto) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webapp","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("insert into users(user_name,phone_no,email_id,passwd,age) values(?,?,?,?,?)");
            stmt.setString(1, dto.getUserName());
            stmt.setLong(2,dto.getPhoneNumber());
            stmt.setString(3,dto.getEmailId());
            stmt.setString(4,dto.getPassword());
            stmt.setInt(5,dto.getAge());
            stmt.executeUpdate();
            con.commit();
            System.out.println("User added : " + dto);
            return true;
        }catch (SQLException e){
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
            if (con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }


    public boolean deleteUserById(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webapp","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from users where id = ?");
            stmt.setInt(1,id);
            System.out.println("Deleted : " + stmt.executeUpdate() + " rows" );
            con.commit();
            return true;
        }catch (SQLException e){
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }



    public void fetchUsersData(){
        List<UsersDto> dtos = getAllUsersData();
        dtos.forEach(System.out::println);
    }

    public List<UsersDto> getAllUsersData(){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<UsersDto> instaUsersDtos = new ArrayList<>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.7:3306/webapp","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from users");
            rs = stmt.executeQuery();

            while (rs.next()){
                UsersDto dto = new UsersDto();
                dto.setId(rs.getInt(1));
                dto.setUserName(rs.getString(2));
                dto.setPhoneNumber(rs.getLong(3));
                dto.setEmailId(rs.getString(4));
                dto.setPassword(rs.getString(5));
                dto.setAge(rs.getInt(6));
                instaUsersDtos.add(dto);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return instaUsersDtos;
    }

    public UsersDto getUserById(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsersDto dto = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webapp","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from users where id = ?");
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                dto = new UsersDto();
                dto.setId(rs.getInt(1));
                dto.setUserName(rs.getString(2));
                dto.setPhoneNumber(rs.getLong(3));
                dto.setEmailId(rs.getString(4));
                dto.setPassword(rs.getString(5));
                dto.setAge(rs.getInt(6));
            }
            return dto;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
            if (con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return dto;
    }

    public boolean updateUserAgeById(int age,int id){
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webapp","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update users set age=? where id=?");
            stmt.setInt(1,age);
            stmt.setInt(2,id);
            System.out.println("Updated!!" + stmt.executeUpdate());
            con.commit();
            return true;
        }catch (SQLException e){
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
            if (con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }

}
