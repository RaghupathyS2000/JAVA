 package learningjava;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		//readRecords();
		//insertRecords();
		//insertVar();
		//insertPrepSt();
		//deleteRec();
		//updateRec() ;
		//sp();
		//spInput();
		//spInputOut();
		//commitDemo();
		batchDemo();
	}	
	
	
	
	//Read The Records
	
	
	public static void readRecords()  throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String pwd="tiger";
		String query="select * from employee";
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery(query);
		while (r.next()) {
		System.out.println(r.getInt(1));
		System.out.println(r.getString(2));
		System.out.println(r.getInt(3));
		}
		con.close();
	}
	
	//insert records into  employee table
	
	
	public static void insertRecords()  throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String pwd="tiger";
		String query="insert into employee values(3,'Naruto',34567)";
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);
		System.out.println("Number of rows affected : "+rows);
		
		con.close();
	}
	
	//insert with variables in employee table
	
	public static void insertVar()  throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String pwd="tiger";
		int id=4;
		String name="Hinata";
		int salary= 38987;
		String query="insert into employee values("+id + ",'"+ name+ " ',"+salary +");";
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);
		System.out.println("Number of rows affected : "+rows);
		
		con.close();
	}
	//insert with prepared statements  in employee table
	
		public static void insertPrepSt()  throws SQLException {
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String pwd="tiger";
			int id=5;
			String name="Hina";
			int salary= 38687;
			String query="insert into employee values(?,?,?);";
			Connection con = DriverManager.getConnection(url,userName,pwd);
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,id);
			pst.setNString(2,name);
			pst.setInt(3,salary);
			int rows=pst.executeUpdate();
			
			System.out.println("The Rows Count Is : "+rows);
			
			con.close();
		}

		//Delete Records  in employee table
		
		public static void deleteRec()  throws SQLException {
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String pwd="tiger";
			int id=2;
			String query="delete from employee where emp_id = "+id;
			Connection con = DriverManager.getConnection(url,userName,pwd);
			Statement st=con.createStatement();
			int rows=st.executeUpdate(query);
			System.out.println("Number of rows affected : "+rows);
			
			con.close();
		}
		
		//Update  Records  in employee table
		
		
		
				public static void updateRec()  throws SQLException {
					String url="jdbc:mysql://localhost:3306/jdbcdemo";
					String userName="root";
					String pwd="tiger";
					String query="update employee set ename ='Himawari' where emp_id=5";
					Connection con = DriverManager.getConnection(url,userName,pwd);
					Statement st=con.createStatement();
					int rows=st.executeUpdate(query);
					System.out.println("Number of rows affected : "+rows);
					
					con.close();
				} 
				
				
				//calling Simple Stored procedure
				
				
				
				public static void sp()  throws SQLException {
					String url="jdbc:mysql://localhost:3306/jdbcdemo";
					String userName="root";
					String pwd="tiger";
					Connection con = DriverManager.getConnection(url,userName,pwd);
					CallableStatement cst= con.prepareCall("{call GetEmp()}");
					ResultSet rs=cst.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getInt(3));
						}
					con.close();
				}
				// calling store procedure with input parameter
				
				
				
			public static void spInput()  throws SQLException {
					String url="jdbc:mysql://localhost:3306/jdbcdemo";
					String userName="root";
					String pwd="tiger";
					int id=4;
					Connection con = DriverManager.getConnection(url,userName,pwd);
					CallableStatement cst= con.prepareCall("{call GetEmpById(?)}");
					cst.setInt(1, id);
					ResultSet rs=cst.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getInt(3));
						}
					con.close();
				}
			// calling store procedure with input parameter and output parameter
			
			
			public static void spInputOut()  throws SQLException {
				String url="jdbc:mysql://localhost:3306/jdbcdemo";
				String userName="root";
				String pwd="tiger";
				int id=4;
				Connection con = DriverManager.getConnection(url,userName,pwd);
				CallableStatement cst= con.prepareCall("{call GetNameById(?,?)}");
				cst.setInt(1, id);
				cst.registerOutParameter(2,Types.VARCHAR);
				cst.executeUpdate();
				 System.out.println(cst.getString(2));
				con.close();
			}
			
			
			// commit vs auto commit
			
			public static void commitDemo() throws SQLException {
				String url="jdbc:mysql://localhost:3306/jdbcdemo";
				String userName="root";
				String pwd="tiger";
				String query="update employee set salry = 5500000 where emp_id=1";
				String query1="update employee set salry = 4500000 where emp_id=3";
				Connection con = DriverManager.getConnection(url,userName,pwd);
				con.setAutoCommit(false);//by default it is true 
				Statement st=con.createStatement();
				int rows1= st.executeUpdate(query);
				System.out.println("Rows Affected : "+rows1);
				int rows2= st.executeUpdate(query1);
				System.out.println("Rows Affected : "+rows2);
				//if we give auto commit is fales then we need to give commit
				if(rows1>0 && rows2>0)
					con.commit();
				
				con.close();
			
			}
			
			
			//BATCH---PROCESSING
			// ROLL--BACK
			
			
			public static void batchDemo() throws SQLException {
				String url="jdbc:mysql://localhost:3306/jdbcdemo";
				String userName="root";
				String pwd="tiger";
				String query="update employee set salry = 300000 where emp_id=1";
				String query1="update employee set salry = 300000 where emp_id=3";
				String query2="update employee set salry = 300000 where emp_id=4";
				String query3="update employee set salry = 300000 where emp_id=5";
				
				Connection con = DriverManager.getConnection(url,userName,pwd);
				con.setAutoCommit(false);
				 Statement st=con.createStatement();
				 st.addBatch(query);
				 st.addBatch(query1);
				 st.addBatch(query2);
				 st.addBatch(query3);
				 
				 int[] res = st.executeBatch();
				 for(int i : res) {
					if(i>0)
						continue;
						else
							con.rollback();
				 }
				 con.commit();
				con.close();
			
			}
			
			
}
