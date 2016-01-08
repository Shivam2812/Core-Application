package com.service;

import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

//import com.csvreader.CsvReader;
//import com.opencsv.CSVReader;

//import com.csvreader.CsvReader;

public class ReadCSVFile {
	
	public void readCSVFileData(String csvFile) throws IOException
	{
//		Class.forName ("oracle.jdbc.OracleDriver"); 
//        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
//        PreparedStatement sql_statement = null;
//        String jdbc_insert_sql = "INSERT INTO CSV_2_ORACLE"
//                        + "(USER_ID, USER_AGE) VALUES"
//                        + "(?,?)";
//        sql_statement = conn.prepareStatement(jdbc_insert_sql);
//        /* Read CSV file in OpenCSV */
       // String inputCSVFile = "inputdata.csv";
	
        CSVReader reader = new CSVReader(new FileReader(csvFile),';');
        String [] nextLine; 
        int lnNum = 0; 
        //loop file , add records to batch
        while ((nextLine = reader.readNext()) != null) {
                lnNum++;
               System.out.println(nextLine);
        }     
        
//        for (String string : nextLine) {
//        	String str[] = string.split(";");
//        	
//        	System.out.println(str);
//			
//		}
        //We are now ready to perform a bulk batch insert              
       // int[] totalRecords = new int[7];
//        try {
//                //totalRecords = sql_statement.executeBatch();
//        } catch(BatchUpdateException e) {
//                //you should handle exception for failed records here
//               // totalRecords = e.getUpdateCounts();
//        }
        System.out.println ("Total records inserted in bulk from CSV file " + lnNum);                
//        /* Close prepared statement */
//        sql_statement.close();
//        /* COMMIT transaction */
//        conn.commit();
//        /* Close connection */
//        conn.close();
	}
	
	public static void main(String[] args) {
		ReadCSVFile read = new ReadCSVFile();
		try
		{
			//FileReader reader = new FileReader();
		read.readCSVFileData("Employee_Update_TEST2.txt");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
