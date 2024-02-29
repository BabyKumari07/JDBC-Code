steps to java database connectivity
1. import the package (java.sql.*)
2. load and register the driver - com.mysql.jdbc.Driver
	load -
	register - class.forName("driver name")
3. establish the connection - Connection
4. create the statement
	Statement
	PreparedStatement
	CollableStatement
5. execute the query
6. process result
7. close the connection or statement