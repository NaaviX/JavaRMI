import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
 
public class Window extends JFrame {
	public Window(){             
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 100);
	    this.setLocationRelativeTo(null);    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    GridLayout gl = new GridLayout(10, 1);
	    gl.setHgap(5); //Cinq pixels d'espace entre les colonnes (H comme Horizontal)
	    gl.setVgap(5); //Cinq pixels d'espace entre les lignes (V comme Vertical) 
	    //Ou en abrégé : GridLayout gl = new GridLayout(3, 2, 5, 5);
	    this.setLayout(gl);
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(new Panel());              
	    this.setVisible(true);
	  }       
}