package p1;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

import pserveur.Panier;
import pserveur.Service;

public class ServiceClient {
	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote r = Naming.lookup("rmi://10.0.0.13/ServiceProjetRmi");
			if (r instanceof Service) {
			boolean Userexist = ((Service) r).userExist(responseUser);
			if(Userexist)
			{
			Panier voitureTrouver = ((Service) r).trouvevoiture(responseVoiture);
			}else
			{
				System.out.println("Utilisateur non trouvé");
			}
			}
			} catch (Exception e) {
			System.out.println(e);
			}
	}

}
