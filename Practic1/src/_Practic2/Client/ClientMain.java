package Practic2.Client;

import Practic2.RMI.Coefficients;
import Practic2.RMI.QuadraticEqu;
import Practic2.RMI.Result;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    public static final String UNIQUE_BINDING_NAME = "server.quadequ";

    public static void main(String[] args)  throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(2732);

        QuadraticEqu calculator = (QuadraticEqu) registry.lookup(UNIQUE_BINDING_NAME);

        Coefficients coefficients = new Coefficients(2, 3, 4);
        Result res = calculator.calculate(coefficients, 30);

        System.out.println(res.getMsg() + ": " + res.getRes());
    }
}
