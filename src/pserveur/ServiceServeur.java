package pserveur;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;

public class ServiceServeur {
	

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(8001);
			
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}
			
			Service serviceImplem = new Service();
			String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/ServiceProjetRmi";
			System.out.println("Enregistrement de l'objet avec l'url : " + url);
			Naming.rebind(url, serviceImplem);
		} catch (Exception e) {
			System.out.println("ca n'a pas marché" + e);
		}
	}

}
