package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.w3c.dom.Document;

import com.controller.ConvertDBResultsToXML;

public class UserDAO {
	
	public Document getCustomerList()
	{
	   Document doc = null;

	   try
	   {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "computer123");
	      Statement stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery("SELECT * from customer_tbl");

	      doc = ConvertDBResultsToXML.toDocument(rs);

	      rs.close();
	      stmt.close();
	   }
	   catch (Exception e)
	   {
	      e.printStackTrace();
	   }

	   return doc;
	}
	
	public static void main(String argv[]) throws Exception
	{
		UserDAO dao = new UserDAO();

	   Document doc    = dao.getCustomerList();
	   System.out.println(ConvertDBResultsToXML.serialize(doc));

	}


}
