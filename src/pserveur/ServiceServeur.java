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
			LocateRegistry.createRegistry(1099);
			LocateRegistry.getRegistry();
			String currentPath = System.getProperty("user.dir");
			System.setProperty("java.security.policy",System.getProperty("user.dir") + "/src/sec.policy.txt");
			System.setProperty("java.rmi.server.hostname",InetAddress.getLocalHost().getHostAddress());
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}
			
			Service serviceImplem = new Service();
			String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/ServiceProjetRmi";
			System.out.println("Enregistrement de l'objet avec l'url : " + url);
			Naming.rebind(url, serviceImplem);
		} catch (Exception e) {
			System.out.println("ca n'a pas marché " + e);
		}
	}

}
