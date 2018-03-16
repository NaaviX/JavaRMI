import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class RentVehicles extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private Button louer;
	private Button attente;
	private Panel contenu;
	private JComboBox<String> vehiclesList;
	public RentVehicles() {
		super("Louer véhicule");
		
		
		
		String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"}; //requete liste vehicule à louer
		vehiclesList = new JComboBox<String>(tab);
		vehiclesList.setPreferredSize(new Dimension(100, 20));
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		attente = new Button("Mise en attente");
		
		louer = new Button("Louer");
		louer.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String[] rep = {vehiclesList.getSelectedItem().toString(), Window.IDUtilisateur};
		        //TODO : louer voiture
		      }
		    });
		
		contenu.add(label);
		contenu.add(vehiclesList);
		contenu.add(attente);
		contenu.add(louer);
		if(isAvailable()) {
			attente.setEnabled(false);
			louer.setEnabled(true);
		} else {
			louer.setEnabled(false);
			attente.setEnabled(true);
		}
		
		this.setContentPane(contenu);
		this.setVisible(true);
	}

	public boolean isAvailable() {
		//requete sql qui renvoie dispo
		return true;
	}
}
