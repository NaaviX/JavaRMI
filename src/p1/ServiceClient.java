package p1;
import pObjets.Panier;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.util.List;

import pObjets.ResponseUser;
import pObjets.ResponseVoiture;
import pObjets.Voiture;
import pserveur.Service;

public class ServiceClient {
	public static List<Voiture> toutevoiture() {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
				List<Voiture> voitures = ((Service)r ).touteVoiture();
				return voitures;
			}
			
			} catch (Exception e) {
			System.out.println(e);
			}
		return null;
	}
	
	public static boolean connexionUtilisateur(ResponseUser response) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
				boolean bool = ((Service)r ).userExist(response);
				return bool;
			}
			
			} catch (Exception e) {
			System.out.println(e);
			}
		return false;
	}
	
	public static Panier Trouvevoiture(ResponseVoiture response) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
				Panier bool = ((Service)r ).trouvevoiture(response);
				return bool;
			}
			
			} catch (Exception e) {
			System.out.println(e);
			}
		return null;
	}
	
	public static void updateVoiture(boolean status)
	{
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
				((Service)r ).updateVoiture(status);
	}
		} catch (Exception e) {
			System.out.println(e);
			}

}
	
	public static void ajoutVoirute(Voiture voiture)
	{
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
				((Service)r ).ajoutVoiture(voiture);
			}
			} catch (Exception e) {
				System.out.println(e);
			}
	}
}
