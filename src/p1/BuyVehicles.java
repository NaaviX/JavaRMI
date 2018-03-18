package p1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import pObjets.Voiture;

public class BuyVehicles extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private Button acheter;
	private Panel contenu;
	private JComboBox<String> vehiclesList;
	public BuyVehicles() {
		super("Acheter véhicule");
		setConnected(Window.IDUtilisateur);
		List<Voiture> voitures = ServiceClient.toutevoiture();
		
		String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"}; //requete vehicules disponibles à l'achat
		vehiclesList = new JComboBox<String>(tab);
		vehiclesList.setPreferredSize(new Dimension(100, 20));
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		acheter = new Button("Ajouter au panier");
		
		acheter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String[] rep = {vehiclesList.getSelectedItem().toString(), Window.IDUtilisateur};
		        //TODO : requete ajouter au panier
		    	  JOptionPane.showMessageDialog(null, "Voiture ajoutée au panier", "Information", JOptionPane.INFORMATION_MESSAGE);
		      }
		    });
		
		contenu.add(label);
		contenu.add(vehiclesList);
		contenu.add(acheter);
		
		this.setContentPane(contenu);
		this.setVisible(true);
	} 
}

