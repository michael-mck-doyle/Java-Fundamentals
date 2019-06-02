package practicePackage.mySQL_Practice;

public class mySQL_college {


    import java.sql.*;

    public class JDBC_Example_1 {

        public static void main(String[] args)  {
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;


            try {
                // This will load the MySQL driver, each DB has its own driver
                Class.forName("com.mysql.jdbc.Driver");
            /* Other examples include:
                 Class.forname("oracle.jdbc.driver.oracledriver");
                 Class.forName("org.postgresql.Driver");
                 Class.forName("mongodb.jdbc.mongodriver"); */

                // configure the "connection string" with the following format
                // jdbc:/mysql://H.O.S.T:<PORT>/DATABASE (for localhost we don't need the port ":3306")
                String connectionString = "jdbc:mysql://localhost/college?"
                        +"user=<USERNAME>&password=<PASSWORD>&useSSL=false";


                // Example connection String to remote MySQL instance:
                // "jdbc:mysql://178.34.21.99:3306/codingnomads?user=root&password=3tr0ngP@33W0rd"


                // Setup the connection with the DB
                connection = DriverManager.getConnection(connectionString);


                // Statements allow us to issue SQL queries to the database
                statement = connection.createStatement();
                // Execute the query on the Statement, getting a ResultSet in return
                resultSet = statement.executeQuery("select * from college.courses");


                // loop through the result set while there are more records
                while (resultSet.next()) {
                    // get the id, name and units fields from the result set and assign them to local variables
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int units = resultSet.getInt("credits");


                    // print out the result
                    System.out.println("Course ID: " + id + " is " + name + " and has " + units + units);
                }
            } catch (SQLException exc) {
                System.out.println("Exception occurred");
                exc.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Exception occured - driver not found on classpath");
                e.printStackTrace();
            } finally {
                try {
                    // close all JDBC elements
                    statement.close();
                    resultSet.close();
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
