package pserveur;

import java.io.UnsupportedEncodingException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import pObjets.Panier;
import pObjets.ResponseUser;
import pObjets.ResponseVoiture;
import pObjets.Voiture;

public interface IService extends Remote{

	public Panier trouvevoiture(ResponseVoiture response) throws RemoteException;
	
	public boolean userExist(ResponseUser response) throws RemoteException;
	
	public List<Voiture> touteVoiture()throws RemoteException;
	
	public void updateVoiture(boolean status)throws RemoteException;
	
	public void ajoutVoiture(Voiture voiture) throws RemoteException;
	
}
