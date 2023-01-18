package country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountryRepository {
	public List<String> distinctContinent() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "SELECT DISTINCT Continent FROM country";
		List<String> list = new ArrayList<>();
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {
			
				while (rs.next()) {
					String continent = rs.getString(1);
					
					list.add(continent);
				}
		}
		return list;
	}
	
	public Map<String, Integer> selectAll() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Map<String, Integer> map = new LinkedHashMap<>();

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
				PreparedStatement stmt = conn.prepareStatement("SELECT name, population FROM country");
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				String name = rs.getString(1);
				int population = rs.getInt(2);

				map.put(name, population);
			}
		}
		return map;
	}
	
	public Map<String, Integer> selectByName(String name) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "SELECT name, population FROM country WHERE name LIKE ?";
		Map<String, Integer> map = new LinkedHashMap<>();

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
				PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, "%" + name + "%");
			
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String n = rs.getString(1);
					int population = rs.getInt(2);
					
					map.put(n, population);
				}
			}
		}
		return map;
	}
	
	public Map<String, Integer> selectByContinent(String continent) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "SELECT name, population FROM country WHERE continent = ?";
		Map<String, Integer> map = new LinkedHashMap<>();

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
				PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, continent);
			
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String n = rs.getString(1);
					int p = rs.getInt(2);
					
					map.put(n, p);
				}
			}
		}
		return map;
	}
}
