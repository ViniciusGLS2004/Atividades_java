package Iinterface;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

import javafx.fxml.FXML;

public class viewcontroller {

	@FXML
	private TextField txtnota1;
	@FXML
	private TextField txtnota2;
	@FXML
	private TextField txtnota3;
	@FXML
	private Label lblResultado;
	@FXML
	private Button btncalcula;;
	
	public void onbtncalculaction() {
	double nota1 = Double.parseDouble(txtnota1.getText());
	double nota2 = Double.parseDouble(txtnota2.getText());	
	double nota3 = Double.parseDouble(txtnota3.getText());	
	
	Double resultado = 7 - (nota1* 0.25 + nota2 * 0.25 + nota3 * 0.25);
		if(resultado > 0) {
			lblResultado.setText(resultado + "pontos");
		}
		else {
			lblResultado.setText("APROVADO");
		}
	}
} 
