package p1;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

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
		
		
		
		String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"}; //requete vehicules disponibles à l'achat
		vehiclesList = new JComboBox<String>(tab);
		vehiclesList.setPreferredSize(new Dimension(100, 20));
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		acheter = new Button("Ajouter au panier");
		
		acheter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String[] rep = {vehiclesList.getSelectedItem().toString(), Window.IDUtilisateur};
		        //TODO : acheter voiture
		      }
		    });
		
		contenu.add(label);
		contenu.add(vehiclesList);
		contenu.add(acheter);
		
		this.setContentPane(contenu);
		this.setVisible(true);
	}
}
