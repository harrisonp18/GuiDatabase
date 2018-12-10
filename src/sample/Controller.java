package sample;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.transitions.JFXKeyFrame;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class Controller {

  @FXML
  private JFXTextField nameText;
  @FXML
  private JFXTextField lastNameText;
  @FXML
  private JFXTreeTableView nameTable;
  @FXML
  private JFXTextArea outputBox;

  DatabaseConnection buttonConnect = new DatabaseConnection();

  public Label connectionLabel = new Label();

  //Connect to database
  @FXML
  private void connectionButton() {  // button clicked
    Boolean connectBool = buttonConnect
        .databaseConnect(); //perform action, connect to database, set bool
    if (connectBool == true) {
      connectionLabel.setText("Connection Successful");
    } else {
      connectionLabel.setText("Connection Unsuccessful");
    }
  }



}



