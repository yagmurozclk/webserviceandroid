package org.kou.jwservice.jwsproject;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import  org.kou.jwservice.jwsproject.model.Ev;

public class SQLiteOperation {

	
	private Connection connect() {
        // SQLite connection string
		Connection conn=null;
		Statement stat;
		String url = "jdbc:sqlite:C:\\webservice\\jwsproject\\sqlite.db";
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
         
        
		
        
   
        return conn;
    }
	
	
	public List<Ev> selectAll(){
        String sql = "SELECT evID, evIL, evEmlakTipi,evAlani,evOdaSayisi,evBinaYasi,evBulKat,evFiyat,evAciklama ,Resim.resimYol FROM EV,Resim where Ev.evID=Resim.resimEvID";
        
        List<Ev> evList = new ArrayList<Ev>();
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                
            	Ev ev = new Ev();
            	
            	ev.setId(rs.getInt("evID"));
            	ev.setIl(rs.getString("evIL"));
            	ev.setEmlakTipi(rs.getString("evEmlakTipi"));
            	ev.setBinaYasi(rs.getInt("evBinaYasi"));
            	ev.setBulKat(rs.getInt("evBulKat"));            	
            	ev.setOdaSayisi(rs.getInt("evOdaSayisi"));
            	ev.setAlan(rs.getInt("evAlani"));
            	ev.setFiyat(rs.getDouble("evFiyat"));
            	ev.setAciklama(rs.getString("evAciklama"));
            	ev.setResimYol(rs.getString("resimYol"));
            	evList.add(ev);
            	
            	/*
            	System.out.println(rs.getInt("evID") +  "\t" + 
                                   rs.getString("evIL") + "\t" +
                                   rs.getDouble("evFiyat"));
                                   */
            }
            
            return evList;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
	
	public static void main(String[] args) {
		SQLiteOperation app = new SQLiteOperation();
        app.selectAll();
    }
	
}
