import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor2 {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        try {
            Registry registry2 = LocateRegistry.createRegistry(4000);

            registry2.rebind("administrador2", Administrador.getInstance());
            System.out.println("Servidor2.Main: Esperando ações do cliente . . .");
        } catch (Exception e) {
            System.out.println("Servidor2.main: " + e.getMessage());
        }
        System.out.println("Pronto para receber chamadas RMI...");
    }
}
