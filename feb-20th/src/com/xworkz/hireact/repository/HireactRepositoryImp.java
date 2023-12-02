package com.xworkz.hireact.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.hireact.dto.HireactDTO;

public class HireactRepositoryImp implements HireactRepository {

	@Override
	public boolean save(HireactDTO dto) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.7:3306/feb20", "root", "Xworkzodc@123");
			String query = "insert into new_table values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			System.out.println("prepared SQL query before:" + statement);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getQualification());
			statement.setString(4, dto.getSkills());
			statement.setString(5,dto.getEmail());

			int i = statement.executeUpdate();
			System.out.println("prepared SQL query after execution:" + statement);
//			connection.commit();
			
			if (i >= 0) {
				System.out.println("record inserted");
				return true;
			} else {
				System.out.println("record not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(HireactDTO dto, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.7:3306/feb20", "root", "Xworkzodc@123");
			String query = "update new_table set name=?,qualification=?,skills=?,email=? where id=?";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getName());
			statement.setString(2, dto.getQualification());
			statement.setString(3, dto.getSkills());
			statement.setString(4, dto.getEmail());
			statement.setInt(5, id);

			int i = statement.executeUpdate();
			// System.out.println("prepared SQL query after execution:"+statement);
//			 connection.commit();
			if (i > 0) {
				System.out.println("record updated");
				return true;
			} else {
				System.out.println("record not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean readById(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.7:3306/feb20", "root", "Xworkzodc@123");
			String query = "select * from new_table where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			System.out.println(statement);
			statement.setInt(1, id);

			ResultSet result = statement.executeQuery();
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4));
				}
				return true;
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.7:3306/feb20", "root", "Xworkzodc@123");
			String query = "delete from new_table where name=?";
			PreparedStatement state = connection.prepareStatement(query);
			System.out.println(query);

			state.setString(1, name);

			int i = state.executeUpdate();
			System.out.println("deleted row : " + i);

			state.close();
			connection.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}