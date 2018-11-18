package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {

  DatabaseConnection buttonConnect = new DatabaseConnection();

  public Label connectionLabel = new Label();

  @FXML
  private void ConnectionButton() {  // button clicked
    Boolean connectBool = buttonConnect
        .databaseConnect(); //perform action, connect to database, set bool
    if (connectBool == true) {
      connectionLabel.setText("Connection Successful");
    } else {
      System.out.println("Connection Unsuccessful");
    }
  }
}



