package p1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField IDUtilisateur;
	private JPasswordField MotDePasse;
	private JTextField NumPermis;
	private JTextField NumAssurance;
	private JComboBox<String> TypeUtilisateur;
	private JTextField Nom;
	private JTextField Prenom;
	private JFormattedTextField DateNaiss;
	private JTextField Rue;
	private JTextField CodePostal;
	private JTextField Ville;
	private Button register;
	private Panel contenu;
	public Register() {
		super("Editer véhicules");
		
		IDUtilisateur = new JTextField("login");
		MotDePasse = new JPasswordField("MotDePasse");
		NumPermis = new JTextField();
		NumAssurance = new JTextField();
		String[] tab = {"Externe", "Etudiant UPEM", "Professeur UPEM"};
		TypeUtilisateur = new JComboBox<String>(tab);
		Nom = new JTextField();
		Prenom = new JTextField();
		DateNaiss = new JFormattedTextField(DateFormat.getDateInstance());
		Rue = new JFormattedTextField();
		CodePostal = new JTextField();
		Ville = new JTextField();
		
		contenu = new Panel();
		
		register = new Button("S'inscrire");
		register.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String mdp = null;
				try {
					mdp = ParserClient.stringtoBase64(MotDePasse.getPassword().toString());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	  String[] rep = {IDUtilisateur.getText(),mdp ,NumPermis.getText(),NumAssurance.getText(),Nom.getText(),Prenom.getText(),DateNaiss.getText(),Rue.getText(),CodePostal.getText(),Ville.getText(),TypeUtilisateur.getSelectedItem().toString()};
		        //TODO : inscrire utilisateur dans la BDD, réponse reçue : booleen
		      }
		    });
		
		contenu.add(IDUtilisateur);
		contenu.add(MotDePasse);
		contenu.add(NumPermis);
		contenu.add(NumAssurance);
		contenu.add(TypeUtilisateur);
		contenu.add(Nom);
		contenu.add(Prenom);
		contenu.add(DateNaiss);
		contenu.add(Rue);
		contenu.add(CodePostal);
		contenu.add(Ville);
		contenu.add(register);
		
		this.setContentPane(contenu);
		this.setVisible(true);
	}
	

}
