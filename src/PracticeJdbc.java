import java.sql.*; 

//Java Database Connectivity

public class PracticeJdbc {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/demojdbc";
		String uname = "root";
		String pwd = "B7301@kish#";
		String query = "select * from studentjdbc";
		Class.forName("com.mysql.cj.jdbc.Driver"); //loading the drivers
		Connection con = DriverManager.getConnection(url,uname,pwd); //connecting to database
		Statement st = con.createStatement();//creating the statement
		ResultSet rs = st.executeQuery(query); //executing the query
		while(rs.next())//fetching the elements
		{
			String name = rs.getString("studName");
			System.out.println(name);
		}
		st.close();
		con.close();
	}

}
