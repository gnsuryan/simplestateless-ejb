package wlstest.functional.core.common.apps.simplestateless;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface SimpleStateless extends EJBObject {
  public String getServerName() throws RemoteException;
  public String getPartitionName() throws RemoteException;
}
