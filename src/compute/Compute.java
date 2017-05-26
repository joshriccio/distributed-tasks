package compute;

import java.rmi.*;

public abstract interface Compute extends Remote{	
	<T> T executeTask(Task<T> t) throws RemoteException;	
}
