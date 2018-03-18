package pserveur;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import pObjets.Panier;
import pObjets.ResponseUser;
import pObjets.ResponseVoiture;
import pObjets.Voiture;

public class  Service extends UnicastRemoteObject implements IService{
	
	public Service() throws RemoteException {
		super();
	}
	
	public void updateVoiture(boolean status)throws RemoteException
	{
		
	}
	
	
	public void ajoutVoiture(Voiture voiture) throws RemoteException
	{

	}
	
	public List<Voiture> touteVoiture()throws RemoteException
	{
		try {
		     Class.forName("org.postgresql.Driver");
		         
		      String url = "jdbc:postgresql://localhost:5432/Ecole";
		      String user = "postgres";
		      String passwd = "postgres";
		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      
		      List<Voiture> voitures = new ArrayList<>();
		      
		      Statement state1 = conn.createStatement();
		      ResultSet result1 = state1.executeQuery("SELECT * FROM Voiture;");
		      ResultSetMetaData resultMeta1 = result1.getMetaData();
		      
		      while(result1.next())
		      {
		      Voiture voiture = new Voiture(result1.getString("idVoiture"),result1.getInt("etat"),result1.getString("commentaire"), result1.getString("marque"),result1.getString("modèle"),result1.getInt("puissance"),result1.getInt("annee"),result1.getInt("prixLocation"),result1.getInt("prixAchat"),result1.getInt("nbkm"),result1.getBoolean("disponibilite"));
		      voitures.add(voiture);
		      }
		      return voitures;
		}catch (Exception e) {
		      e.printStackTrace();
		    }   
		return null;
	}
	
	
	public Panier trouvevoiture(ResponseVoiture response) throws RemoteException
	{
		try {
		     Class.forName("org.postgresql.Driver");
		         
		      String url = "jdbc:postgresql://localhost:5432/Ecole";
		      String user = "postgres";
		      String passwd = "postgres";
		         
		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      Statement state = conn.createStatement();
		      ResultSet result = state.executeQuery("SELECT * FROM Voiture where taille =" + response.getTaille());
	      ResultSetMetaData resultMeta = result.getMetaData();

	      
	      while(result.next()){
	      Voiture voiture1 = new Voiture(result.getString("idVoiture"),result.getInt("etat"),result.getString("commentaire"), result.getString("marque"),result.getString("modèle"),result.getInt("puissance"),result.getInt("annee"),result.getInt("prixLocation"),result.getInt("prixAchat"),result.getInt("nbkm"),result.getBoolean("disponibilite"));
	      Panier panier1 = new Panier(voiture1, response.getDateDebut(), response.getDateDebut());
	    
	      return panier1 ;
	      }
	    

	      result.close();
	      state.close();
	         
	    } catch (Exception e) {
	      return null;
	    } 
		return null;
	  }   
	
	public boolean userExist(ResponseUser response) throws RemoteException
	{
		try {
		     Class.forName("org.postgresql.Driver");
		         
		      String url = "jdbc:postgresql://localhost:5432/Ecole";
		      String user = "postgres";
		      String passwd = "postgres";
		      
		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      Statement state = conn.createStatement();
		      ResultSet result = state.executeQuery("SELECT * FROM User WHERE IDUtilisateur = '" + response.getIdentifiant() + "' AND MotDePasse = '" + Base64toString(response.getMdp().toString())  + "';");
		      ResultSetMetaData resultMeta = result.getMetaData();
		      
		      if(result.isBeforeFirst())
		      {
		    	  return true;
		      }
		      return false;
		
		
		
		} catch (Exception e) {
		      return false;
		    } 
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String stringtoBase64(String stringtobase64string) throws RemoteException, UnsupportedEncodingException
	{
		if(stringtobase64string != null)
		{
			String asB64 = Base64.getEncoder().encodeToString(stringtobase64string.getBytes("utf-8"));
			return asB64;
		}
		return null;
	}
	public static String Base64toString(String stringformatbase64toString) throws RemoteException
	{
		if(stringformatbase64toString != null)
		{
		byte[] asBytes = Base64.getDecoder().decode(stringformatbase64toString);   
		String string = asBytes.toString();
		return string;
		}
		return null;
	}
}
