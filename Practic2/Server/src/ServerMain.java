import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain {
    static String UNIQ_NAME = "server.quad";

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        final RemoteQuadEqu server = new RemoteQuadEqu();

        final Registry registry = LocateRegistry.createRegistry(2732);

        Remote stub = UnicastRemoteObject.exportObject(server, 0);
        registry.bind(UNIQ_NAME, stub);

        System.out.println("!Ready for connection");

        Thread.sleep(Integer.MAX_VALUE);
    }
}
