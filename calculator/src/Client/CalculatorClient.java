package Client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class CalculatorClient {

	public static void main(String[] args) {
		try {
			ICalculator server = (ICalculator) Naming.lookup("rmi://localhost/CalculatorServer");
			System.out.println("Calculator server found!");

			double num1 = Double.parseDouble(JOptionPane.showInputDialog("First number:"));
			double num2 = Double.parseDouble(JOptionPane.showInputDialog("Second number:"));
			String op = JOptionPane.showInputDialog("Operation: (+, -, *, /)");
			double res = server.doTheMath(num1, num2, op);
			JOptionPane.showMessageDialog(null, num1 + " " + op + " " + num2 + " = " + res);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
