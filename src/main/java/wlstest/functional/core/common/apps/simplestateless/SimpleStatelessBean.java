package wlstest.functional.core.common.apps.simplestateless;


import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

//import java.security.AccessController;

//import weblogic.security.acl.internal.AuthenticatedSubject;
//import weblogic.security.service.PrivilegedActions;
//import weblogic.invocation.ComponentInvocationContextManager;
//import weblogic.management.provider.ManagementService;

public class SimpleStatelessBean implements SessionBean {
  private SessionContext sc;
  public void ejbActivate() {
	}          
  public void ejbCreate () {
	}              
  public void ejbPassivate() {
	}          
  public void ejbRemove() {
	}          
	
  public String getServerName(){
    /*AuthenticatedSubject kernelId = (AuthenticatedSubject)
      AccessController.doPrivileged(PrivilegedActions.getKernelIdentityAction());
    return ManagementService.getRuntimeAccess(kernelId).getServerName(); */
     return System.getProperty("weblogic.Name","NA");
  }
  public String getPartitionName(){
	  //return ComponentInvocationContextManager.getInstance().getCurrentComponentInvocationContext().getPartitionName();
	  return "No Partition";
  }  
  
  
  public void setSessionContext(SessionContext ctx) {
	  sc = ctx;
	}          
}
