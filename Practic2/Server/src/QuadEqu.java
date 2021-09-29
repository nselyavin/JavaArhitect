import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuadEqu extends Remote {
    Result countRes(Coefficients coefficent, double x) throws RemoteException;
}
