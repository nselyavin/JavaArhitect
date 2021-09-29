package Practic2.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuadraticEqu extends Remote {
    Result calculate(Coefficients coefficients, double x) throws RemoteException;
}
