package application;

import java.util.ResourceBundle;

import java.net.URL;

import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AppController implements Initializable{
	
	//TableVeiw Clients
	@FXML
	private TableView<Client> clientTable;

	@FXML
	private TableColumn<Client, Long> idClient;

	@FXML
	private TableColumn<Client, String> nameClient;

	@FXML
	private TableColumn<Client, String> phoneClient;

	@FXML
	private TableColumn<Client, String> choice;

	@FXML
	private TableColumn<Client, Double> coins;
	
	ObservableList<Client> listClient = FXCollections.observableArrayList(
			new Client(65301248, "Ahmed Mohammed", "+212 611 11 11 11", "expresso", 1.00)
		);
	
	//add Clients
	@FXML
	private TextField clientID;
	
	@FXML
	private TextField clientName;
	
	@FXML
	private TextField clientPhone;
	
	@FXML
	private TextField clientChoice;
	
	@FXML
	private TextField clientCoins;
	
	public void addClient() {
		Long id = Long.parseLong(clientID.getText());
		String name = clientName.getText();
		String phone = clientPhone.getText();
		String choice = clientChoice.getText();
		Double coins = Double.parseDouble(clientCoins.getText());
		
		clientTable.getItems().add(new Client(id, name, phone, choice,coins));
	}
	
	
	//TableVeiw Technicians
	@FXML
	private TableView<Technician> technicianTable;

	@FXML
	private TableColumn<Technician, Long> idTech;

	@FXML
	private TableColumn<Technician, String> nameTech;

	@FXML
	private TableColumn<Technician, String> phoneTech;

	@FXML
	private TableColumn<Technician, String> idRef;

	@FXML
	private TableColumn<Technician, String> accessCode;
	
	ObservableList<Technician> listTechnician = FXCollections.observableArrayList(
		new Technician(12563408, "Kamal Bouhfid", "+212 600 00 00 00", "RF-08", "0000")
	);
	
	//add Technicians
	@FXML
	private TextField techID;
	
	@FXML
	private TextField techName;
	
	@FXML
	private TextField techPhone;
	
	@FXML
	private TextField techIdRef;
	
	@FXML
	private TextField techAccessCode;
	
	public void addTechnician() {
		Long id = Long.parseLong(techID.getText());
		String name = techName.getText();
		String phone = techPhone.getText();
		String idRef = techIdRef.getText();
		String accessCode = techAccessCode.getText();
		
		technicianTable.getItems().add(new Technician(id, name, phone, idRef,accessCode));
	}
	
	    
	
	//TableView Products
	@FXML
	private TableView<Product> productTable;   
	
	@FXML
	private TableColumn<Product,Long> idProd;

	@FXML
	private TableColumn<Product, String> nameProd;

	@FXML
	private TableColumn<Product, Double> priceProd;

	
	ObservableList<Product> listProduct = FXCollections.observableArrayList(
			new Product(32196577, "chocolat", 1.0),
			new Product(63100485, "expresso", 2.5),
			new Product(11299873, "lait-chocolat", 3.0),
			new Product(31005687, "coffee-long", 2.5),
			new Product(88621999, "tea", 2.0)
	);
	
	//add Products
	@FXML
	private TextField prodID;
	
	@FXML
	private TextField prodName;
	
	@FXML
	private TextField prodPrice;
	
	public void addProduct() {
		
		Long id = Long.parseLong(prodID.getText());
		String name = prodName.getText();
		Double price = Double.parseDouble(prodPrice.getText());
		
		productTable.getItems().add(new Product(id, name, price));
	}
	
	
	
	//TableView Machine
		@FXML
		private TableView<Machine> machineTable;   
		
		@FXML
		private TableColumn<Machine,Long> machineID;

		@FXML
		private TableColumn<Machine, Boolean> isTurnedOn;

		@FXML
		private TableColumn<Machine, Double> sumChange;

		
		ObservableList<Machine> listMachine = FXCollections.observableArrayList(
				new Machine(32196577)
		);
		
		
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		//Clients
		idClient.setCellValueFactory(new PropertyValueFactory<Client, Long>("id"));
		nameClient.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
		phoneClient.setCellValueFactory(new PropertyValueFactory<Client, String>("phone"));
		choice.setCellValueFactory(new PropertyValueFactory<Client, String>("choice"));
		coins.setCellValueFactory(new PropertyValueFactory<Client, Double>("coins"));
		clientTable.setItems(listClient);
		
		//Products
		idProd.setCellValueFactory(new PropertyValueFactory<Product, Long>("id"));
		nameProd.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		priceProd.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
		productTable.setItems(listProduct);
		
		//Technicians
		idTech.setCellValueFactory(new PropertyValueFactory<Technician, Long>("id"));
		nameTech.setCellValueFactory(new PropertyValueFactory<Technician, String>("name"));
		phoneTech.setCellValueFactory(new PropertyValueFactory<Technician, String>("phone"));
		idRef.setCellValueFactory(new PropertyValueFactory<Technician, String>("idRef"));
		accessCode.setCellValueFactory(new PropertyValueFactory<Technician, String>("accessCode"));
		technicianTable.setItems(listTechnician);
		
		//Machines
		machineID.setCellValueFactory(new PropertyValueFactory<Machine, Long>("id"));
		isTurnedOn.setCellValueFactory(new PropertyValueFactory<Machine, Boolean>("isTurnedOn"));
		sumChange.setCellValueFactory(new PropertyValueFactory<Machine, Double>("sumChange"));
		machineTable.setItems(listMachine);
	}
}
