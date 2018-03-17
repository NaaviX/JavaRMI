package p1;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Panier extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private Button acheter;
	private Panel contenu;
	private JComboBox<String> vehiclesList;
	 
	//Boîte du message d'information
	
	public Panier() {
		super("Louer véhicule");
		
		
		
		String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"}; //REQUETE liste vehicule dans le panier
		vehiclesList = new JComboBox<String>(tab);
		vehiclesList.setPreferredSize(new Dimension(100, 20));
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		acheter = new Button("Acheter voiture");
		acheter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String[] rep = {vehiclesList.getSelectedItem().toString(), Window.IDUtilisateur};
		        //TODO : REQUETE acheter voiture
		    		JOptionPane.showMessageDialog(null, "Voiture achetée avec succès", "Information", JOptionPane.INFORMATION_MESSAGE);
		      }
		    });
		
		contenu.add(label);
		contenu.add(vehiclesList);
		contenu.add(acheter);
		
		this.setContentPane(contenu);
		this.setVisible(true);
	}
}
