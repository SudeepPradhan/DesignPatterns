package observer_pattern;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class UserController implements UserObserver, Initializable {
	private ConcreteNotifier nameCollection;

	@FXML
	private ListView<String> namesList;

	@FXML
	private TextField txtName;

	@FXML
	void btnAddClick(ActionEvent event) throws Exception {
		String name = txtName.getText();
		nameCollection.addName(name);
		txtName.setText("");
	}

	@FXML
	void btnRemoveClick(ActionEvent event) throws Exception {
		nameCollection.removeName(namesList.getSelectionModel().getSelectedIndex());
	}

	/* Observer update method */
	@Override
	public void update(ArrayList<String> names) {
		namesList.setItems(FXCollections.observableArrayList(names));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<String> names = new ArrayList<>();
		names.add("User 1");
		names.add("User 2");
		names.add("User 3");
		names.add("User 4");
		names.add("User 5");
		nameCollection = new ConcreteNotifier(names, this);

		namesList.setItems(FXCollections.observableArrayList(names));
	}

}
