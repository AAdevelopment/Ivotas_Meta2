package wbserver.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class WbsInterceptor  implements Interceptor {

	private static final long serialVersionUID = 189237412378L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();

		// this method intercepts the execution of the action and we get access
		// to the session, to the action, and to the context of this invocation
		
		 String username = (String) session.get("username");

         if (username == null){
                 return Action.LOGIN;
         }
         
         else{
        	 return invocation.invoke();
         }

		//	return Action.INPUT; // the clock is broken every other minute
	}

	@Override
	public void init() { }

	@Override
	public void destroy() { }
}

