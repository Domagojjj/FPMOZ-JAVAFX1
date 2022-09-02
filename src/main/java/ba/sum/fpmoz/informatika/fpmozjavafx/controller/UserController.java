package ba.sum.fpmoz.informatika.fpmozjavafx.controller;

import ba.sum.fpmoz.informatika.fpmozjavafx.Program;
import ba.sum.fpmoz.informatika.fpmozjavafx.model.Table;
import ba.sum.fpmoz.informatika.fpmozjavafx.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    @FXML
    TextField nameTxt;

    @FXML
    TextField surnameTxt;

    @FXML
    TextField emailTxt;

    @FXML
    TextField pswdTxt;

    @FXML
    TableColumn tableColumnID;

    @FXML
    TableColumn tableColumnName;

    @FXML
    TableColumn tableColumnSurname;

    @FXML
    TableColumn tableColumnEmail;

    @FXML
    TableColumn tableColumnPassword;

    @FXML
    TableView tableViewUsers;




    @FXML
    Button deleteBtn;

    User selectedUser;

    @FXML
    protected void selectUser (){
        this.selectedUser = (User) this.tableViewUsers.getSelectionModel().getSelectedItem();
        this.deleteBtn.setDisable(false);
        this.nameTxt.setText(this.selectedUser.getName());
        this.surnameTxt.setText(this.selectedUser.getSurname());
        this.emailTxt.setText(this.selectedUser.getEmail());
        this.pswdTxt.setText(this.selectedUser.getPassword());

    }
    @FXML
    protected void deleteUser() throws Exception {
        if (this.selectedUser != null){
            this.selectedUser.delete();
            this.fillUsers();
        }
    }


    @FXML
    protected void saveUser() throws Exception {
        if (this.selectedUser == null){

            User newUser = new User();
            newUser.setName(this.nameTxt.getText());
            newUser.setSurname(this.surnameTxt.getText());
            newUser.setEmail(this.emailTxt.getText());
            newUser.setPassword(this.pswdTxt.getText());
            newUser.save();
        }else {
            this.selectedUser.setName(this.nameTxt.getText());
            this.selectedUser.setSurname(this.surnameTxt.getText());
            this.selectedUser.setEmail(this.emailTxt.getText());
            this.selectedUser.setPassword(this.pswdTxt.getText());
            this.selectedUser.update();
            this.selectedUser = null;

        }

        this.fillUsers();
        this.nameTxt.setText("");
        this.surnameTxt.setText("");
        this.emailTxt.setText("");
        this.pswdTxt.setText("");
    }




    @FXML
    protected void introAdministration(ActionEvent evt) {
        Stage stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        Program.swapScene(stage, "intro-view.fxml", "Administracija korisnika");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.tableColumnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.tableColumnSurname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        this.tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.tableColumnPassword.setCellValueFactory(new PropertyValueFactory<>("password"));

        this.fillUsers();

    }

    private void fillUsers() {
        try {
            ObservableList<?> users = FXCollections.observableList(Table.list(User.class));
            this.tableViewUsers.setItems(users);
        } catch (Exception e) {
            System.out.println("Nastala je greška: " + e.getMessage());
        }
        {

        }
    }
}


