package com.rec;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RecDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	public static boolean isTrue;
	
	//read reciptionist name method
	public static List<Receptionist> validate(String userName, String password){
		
		ArrayList<Receptionist> rec = new ArrayList<>();
		
		
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			//sql Statement
			String sql = "select * from Rec_table where user_name = '"+userName+"' and password = '"+password+"'";
			
			//ResultSet  
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int RID = rs.getInt(1);
				String user_name = rs.getString(2);
				String passR = rs.getString(3);
				String contact = rs.getString(4);
				
				Receptionist r = new Receptionist(RID, user_name, passR, contact); 
				rec.add(r);
				
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection error..");
		}
		
		return rec;
		
	}
	
	//login Validate method
		public static boolean loginValidate(String username, String password) {
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql =  "select * from Rec_table where user_name = '"+username+"' and password = '"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isTrue = true;
				}
				else {
					isTrue = false;
				}
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			return isTrue;
			
		}
		
		//Patient data Insertion method
		public static boolean insertPatient(String name,String nic, String contact,String age,String medicalUnit,String date,String wardId) {
			
			boolean isSuccess = false;
			
					
					 try {
						 con = DBconnection.getConnection();
						 stmt = con.createStatement();
						 
						 //Sql statement
						String sql = "insert into Patient values(0,'"+name+"','"+nic+"','"+contact+"','"+age+"','"+medicalUnit+"','"+date+"', '"+wardId+"')";
							
							int rs = stmt.executeUpdate(sql);
							
							if(rs > 0) {
								isSuccess = true;
							

							}
							else {
								isSuccess = false;
							}
					 }
					 catch(Exception e) {
						 e.printStackTrace();
						 System.out.println("Database connection error..");
					 }
			
			return isSuccess;
		}

		
		//patient View method
		public static List<Patient> readData() {
			ArrayList<Patient> pa = new ArrayList<>();
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from Patient";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int pid = rs.getInt(1);
					String name = rs.getString(2);
					String nic = rs.getString(3);
					String contact = rs.getString(4);
					String age = rs.getString(5);
					String medical_unit = rs.getString(6);
					String date = rs.getString(7);
					String ward_Id = rs.getString(8); 
					
					Patient p = new Patient(pid, name, nic, contact, age, medical_unit, date, ward_Id);
					
					pa.add(p);
				}

			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Database connection failed..");
			}
			
			return pa;
			
		}
		
		//Update Patient data
				public static boolean updateData(String pid,String name, String nic,String contact,String age,String medical,String date,String ward_Id) {
					
					try {
						con = DBconnection.getConnection();
						stmt = con.createStatement();
						
						
						String sql = "update Patient set name='"+name+"',NIC='"+nic+"',contact='"+contact+"',age='"+age+"',medical_unit='"+medical+"',ward_no='"+ward_Id+"'" 
								+ "where PID='"+pid+"'";
						
						int rs = stmt.executeUpdate(sql);
						
						if(rs > 0) {
							isTrue = true;
						}
						else {
							isTrue = false;
						}
						
						
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					
					return isTrue;
				}
				
				
				//Delete method
				public static boolean deleteData(String pid) {
					
					int convertInt = Integer.parseInt(pid);
					
					try {
						con = DBconnection.getConnection();
						stmt = con.createStatement();
						
						String sql = "delete from Patient where PID='"+convertInt+"'";
						
						int r = stmt.executeUpdate(sql);
						
						if(r > 0) {
							isTrue = true;
						}
						else {
							isTrue = false;
						}

					}
					catch(Exception e) {
						e.printStackTrace();
					}
					
					
					
					return isTrue;
				}
}

