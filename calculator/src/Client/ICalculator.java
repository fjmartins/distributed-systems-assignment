package Client;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {

	public double doTheMath(double a, double b, String operation) throws RemoteException;

}
