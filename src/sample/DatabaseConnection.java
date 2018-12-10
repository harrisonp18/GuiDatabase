package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

  /**
   * Creates connection to database "MyDbTest".
   * The connect is made using the DriverManager and the getConnection() method
   * The URL of my database is use as the argument for the method and a object of type Connection
   * is created to show the connection has been made.
   * @return returns boolean based on connection was successful or not
   */
  public boolean databaseConnect() {

    final String databaseUrl =
        "jdbc:derby:/Users/harrisonpaxton/OneDrive - Florida Gulf Coast University/IdeaProjects/"
            + "GuiDatabase/lib/MyDbTest";
    // URL for my test database, created using apache derby and located in my project files

    Boolean connectBool = true;              // determines if connection was successful or not

    try {
      Connection connection = DriverManager
          .getConnection(databaseUrl);      // connects to database url

      connection.close();                    //closes connection if connected

      //Statement statement;        // Statement code is commented out because I'm not using it yet
      //statement = connection
      //    .createStatement();
      //System.out.println(
      //    statement);             // prints statement of connection
      //statement.close();
      //statement = null;
    } catch (SQLException e) {
      System.out.println(e);        // if connection isn't made, prints exception
      connectBool = false;
    }

    ;
    return connectBool;
  }


}
