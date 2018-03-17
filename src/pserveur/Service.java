package pserveur;

import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Base64;

import p1.ResponseUser;
import p1.ResponseVoiture;

public class  Service extends UnicastRemoteObject implements IService{
	
	public Service() throws RemoteException {
		super();
	}
	public Panier trouvevoiture(ResponseVoiture response) throws RemoteException
	{
		//ici on choppe ReponseVoiture qu'on va recup dans le main grace au rmi
		// donc tu fais la récup des objets faut sortir qu'une seul voiture que t'implémente ici et tu l'ajoute au panier que tu renvoies 
		return null;
	}
	public boolean userExist(ResponseUser response) throws RemoteException
	{
		//ici tu choppe ResponseUser tu vas check le bool pour savoir si cest externe interne ensuite tu fait tas requete la question cest :
		//mdp en base 64 en bdd ou en string je sais pas trop je te mets quand meme une petite méthodes pour les converstions string en base64
		return false;
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
