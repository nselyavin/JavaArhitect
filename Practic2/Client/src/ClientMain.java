import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    static String UNIQ_NAME = "server.quad";

    public static void main(String[] args) throws NotBoundException, RemoteException {
        final Registry registry = LocateRegistry.getRegistry(2732);

        QuadEqu calculator = (QuadEqu) registry.lookup(UNIQ_NAME);

        Coefficients coefficients = new Coefficients(2, 3, 4);
        Result res = calculator.countRes(coefficients, 30);

        System.out.println(res.getResult());
    }
}
