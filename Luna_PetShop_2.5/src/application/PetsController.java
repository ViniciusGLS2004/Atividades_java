package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Pet;


public class PetsController implements Initializable{
	private Pet pets;
	
	@FXML private TextField TextID;

    @FXML private TextField textDono;

    @FXML private DatePicker textIdade;

    @FXML private TextField textNomeP;

    @FXML private TextField textRaça;
    
    @FXML private Button btCadas;
    
    @FXML private Button bttREmove;
    
    @FXML private ComboBox<Pet> comboBoxEspecie;
    
    private List<Pet> Pets = new ArrayList<>();
    
    private ObservableList<Pet> obsPet;
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		CarregarPet();
		pets = new Pet();
		
	}
	
	public void CarregarPet() {
		
		Pet pets1 = new Pet(1, "Cachorro");
		Pet pets2 = new Pet(2, "Gato");
		
		Pets.add(pets1);
		Pets.add(pets2);
		
		obsPet = FXCollections.observableArrayList(Pets);
		
		comboBoxEspecie.setItems(obsPet);
	}
	
		
	public void CadastrarButtonAction(ActionEvent event) {	
		pets.cadastrar(pets);
		
		System.out.println("pet cadastrado");

	}
	
	@FXML
	protected void btNovoAction(ActionEvent e) {
		System.out.println("Voltar!!");
		
		Main.changeScreen("main");
	}
}
