package p1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private Button seConnecter;
	private JTextField IDUtilisateur;
	private JPasswordField MotDePasse;
	private Panel contenu;
	public Login() {
		super("Login");
		
		seConnecter = new Button("Se connecter");
		seConnecter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  String mdp = null;
					try {
						mdp = ParserClient.stringtoBase64(MotDePasse.getPassword().toString());
					} catch (RemoteException e) {
						e.printStackTrace();
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
		    	  String[] rep = {IDUtilisateur.getText(), MotDePasse.getPassword().toString()};
		    	  setConnected(IDUtilisateur.getText());
		        //TODO : envoyer infos connexion, recupère reponse
		      }
		    });
		
		IDUtilisateur = new JTextField("Login");
		MotDePasse = new JPasswordField("Mot de Passe");
		
		contenu = new Panel();
		
		label = new JLabel("Voiture :");
		
		contenu.add(label);
		contenu.add(IDUtilisateur);
		contenu.add(MotDePasse);
		contenu.add(seConnecter);
		
		this.setContentPane(contenu);
		
		this.setVisible(true);
	}

}
