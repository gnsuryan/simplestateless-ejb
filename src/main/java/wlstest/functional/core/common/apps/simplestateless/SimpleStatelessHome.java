package wlstest.functional.core.common.apps.simplestateless;

import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import java.rmi.RemoteException;

public interface SimpleStatelessHome extends EJBHome {

  SimpleStateless create() throws CreateException, RemoteException;                                
}
