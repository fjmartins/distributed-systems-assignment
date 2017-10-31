package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Client.ICalculator;

public class Calculator extends UnicastRemoteObject implements ICalculator {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2554737704573766724L;

	public Calculator() throws RemoteException {
		super();
	}

	public double doTheMath(double a, double b, String op) throws RemoteException {
		double result = 0;

		switch (op) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				if (b == 0) throw new RemoteException("You can't divide by zero!");
				result = a / b;
				break;
			default:
				throw new RemoteException("Invalid Operation!");
		}

		return result;
	}
}
