package Server;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {

	public static void main(String[] args) {
		try {
			Calculator server = new Calculator();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost/ServidorCalculadora", server);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
