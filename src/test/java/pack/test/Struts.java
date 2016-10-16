package pack.test;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionSupport;

public abstract class Struts extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletRequest,ServletResponse {

	
	
	
	private HttpServletRequest Request;
	
	//struts.action
	
	public String add(){
		return"";
	}
	
	public String update(){
		return"";
	}
	@Override
	public String execute() throws Exception {
	System.out.println("Ö´ÐÐAction");
	
	return SUCCESS;
	
	}
	
	
	
	

}
