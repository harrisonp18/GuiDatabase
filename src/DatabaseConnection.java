import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

  public void databaseConnect(){

    final String DATABASE_URL = "jdbc:derby:/Users/harrisonpaxton/OneDrive - Florida Gulf Coast University/IdeaProjects/Database/lib/MyDbTest";
    // URL for my test database, created using apache derby and located in my project files


    try {
      Connection connection = DriverManager.getConnection(DATABASE_URL);      // connects to database url
      Statement statement = connection.createStatement();                     // creates statement stating connection
      System.out.println(statement);                                          // prints statement of connection
    } catch (SQLException e) {
      System.out.println(e);                  // if connection isn't made, prints exception
    };
  }

}
