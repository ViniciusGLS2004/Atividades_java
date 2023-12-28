package Iinterface;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.Categoria;
import Model.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class viewcontroller implements Initializable {

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtCusto;

	@FXML
	private TextField txtEstoque;

	@FXML
	private TextField txtPreco;

	@FXML
	private Button btnCadastrar;

	@FXML
	private ComboBox<Categoria> cbbCategoria;
	private ObservableList<Categoria> obsLista;

	private List<Categoria> categorias = new ArrayList<Categoria>();
	private List<Produto> produtos = new ArrayList<Produto>();

	public void onbtnCadastrarAction() {
		String nome = txtNome.getName();
		Double custo = Double.parseDouble(txtCusto.getText());
		Integer estoque = Integer.parseInt(txtEstoque.getText());
		Categoria categoria = cbbCategoria.getValue();
		
		Produto prod = new Produto(nome, categoria, custo, estoque);
		produtos.add(prod);
		for(Produto p: produtos) {
			System.out.println(p);
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		categorias.add(new Categoria("Imformatica", 0.2));
		categorias.add(new Categoria("Papelaria", 0.1));
		categorias.add(new Categoria("Alimentos", 0.25));

		obsLista = FXCollections.observableArrayList(categorias);
		cbbCategoria.setItems(obsLista);
	}

}