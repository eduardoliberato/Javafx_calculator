package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML // for they be associate with the display
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;
	
	@FXML
	private Button btSubtract;
	
	@FXML
	private Button btMultiplicate;
	
	@FXML
	private Button btDivide;

	@FXML
	public void onBtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText()); //to transform the text of the the number in a number for the system
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));//to address the sum for the label and transform into a string 
	}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);}
		}

	@FXML
	public void onBtSubtractAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); // to transform the text of the the number in a
																		// number for the system
			double number2 = Double.parseDouble(txtNumber2.getText());
			double subtract = number1 - number2;
			labelResult.setText(String.format("%.2f", subtract));// to address the sum for the label and transform into a
															// string
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}

	}
	
	@FXML
	public void onBtMultiplicateAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); // to transform the text of the the number in a
																		// number for the system
			double number2 = Double.parseDouble(txtNumber2.getText());
			double multiplicate = number1 * number2;
			labelResult.setText(String.format("%.2f", multiplicate));// to address the sum for the label and transform into a
															// string
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}

	}
	
	@FXML
	public void onBtDivideAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText()); // to transform the text of the the number in a
																		// number for the system
			double number2 = Double.parseDouble(txtNumber2.getText());
			double divide = number1 / number2;
			labelResult.setText(String.format("%.2f", divide));// to address the sum for the label and transform into a
															// string
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}

	}
}
