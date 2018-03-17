package p1;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
public class Window extends JFrame{
	public static boolean isLogged;
	public static String IDUtilisateur;
	public static JMenuBar menuBar;
	public static JMenu menu;
	public static JMenuItem connexion;
	public static JMenuItem inscription;
	public static JMenuItem louer;
	public static JMenuItem acheter;
	public static JMenuItem panier;
	public static JMenuItem deconnexion;
	
	public Window(String title){   
	    this.setTitle(title);
	    this.setSize(800, 800);
	    this.setLocationRelativeTo(null);    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    isLogged = false;
	    menuBar = new JMenuBar();
	    menu = new JMenu("Menu");
		connexion = new JMenuItem("Connexion");
		inscription = new JMenuItem("Inscription");    
		louer = new JMenuItem("Louer"); 
		acheter = new JMenuItem("Acheter"); 
		panier = new JMenuItem("Mon panier"); 
		deconnexion = new JMenuItem("Déconnexion");
		IDUtilisateur = null;
		setNotConnected();
		menuBar.add(menu);
		
		connexion.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        new Login().setVisible(true);
		      }
		    });
		
		inscription.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        new Register().setVisible(true);
		      }
		    });
		
		louer.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        new RentVehicles().setVisible(true);
		      }
		    });
		
		acheter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        new BuyVehicles().setVisible(true);
		      }
		    });
		deconnexion.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		    	  setNotConnected();
		        new Login().setVisible(true);
		      }
		    });
		
		
		
		//this.menuBar.remove(connexion);
		this.setJMenuBar(menuBar);
	  }

	public void setNotConnected() {
		IDUtilisateur = null;
		menu.remove(louer);
		menu.remove(acheter);
		menu.remove(panier);
		menu.remove(deconnexion);
		menu.add(connexion);
		menu.add(inscription);
		isLogged = false;
	}
	
	public void setConnected(String IDUser) {
		IDUtilisateur = IDUser;
		menu.remove(connexion);
		menu.remove(inscription);
		menu.add(louer);
		menu.add(acheter);
		menu.add(panier);
		menu.add(deconnexion);
		isLogged = true;
	}
	
}