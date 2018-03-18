package p1;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		setConnected(Window.IDUtilisateur);
		
		
		String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"}; //requete liste vehicule à louer non réalisé fonction dans service client
		vehiclesList = new JComboBox<String>(tab);
		vehiclesList.setPreferredSize(new Dimension(100, 20));
		vehiclesList.addItemListener(new ItemState());
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		attente = new Button("Mise en attente");
		
		louer = new Button("Louer");
		louer.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String[] rep = {vehiclesList.getSelectedItem().toString(), Window.IDUtilisateur};
		        //TODO : louer voiture
		    	  JOptionPane.showMessageDialog(null, "Voiture louée avec succès", "Information", JOptionPane.INFORMATION_MESSAGE);
		      }
		    });
		
		contenu.add(label);
		contenu.add(vehiclesList);
		contenu.add(attente);
		contenu.add(louer);
		
		
		
		this.setContentPane(contenu);
		this.setVisible(true);
	}
	
	class ItemState implements ItemListener{
	    public void itemStateChanged(ItemEvent e) {
	    	if(isAvailable(vehiclesList.getSelectedItem().toString())) {
				attente.setEnabled(false);
				louer.setEnabled(true);
			} else {
				louer.setEnabled(false);
				attente.setEnabled(true);
			}
	    }               
	  }

	public boolean isAvailable(String voiture) {
		//requete sql qui renvoie dispo du vehicule
		return true;
	}
}
