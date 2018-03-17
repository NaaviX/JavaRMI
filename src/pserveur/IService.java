package pserveur;

import java.io.UnsupportedEncodingException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import p1.ResponseUser;
import p1.ResponseVoiture;

public interface IService extends Remote{

	public Panier trouvevoiture(ResponseVoiture response) throws RemoteException;
	
	public boolean userExist(ResponseUser response) throws RemoteException;
	
}
