package exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
	public ModelAndView resolveException(HttpServletRequest request,
	    HttpServletResponse response, Object handler, Exception ex) {
    	
    	System.out.println("全局异常发生");
	CustomException customException = null;
	String message =null;
	ModelAndView modelAndView = new ModelAndView();
	System.out.println(ex);
	if (ex instanceof CustomException) {
	     customException = (CustomException) ex; 
	     modelAndView.addObject("message", customException.getMessage());
		 modelAndView.setViewName(customException.getPath());
	  //  message="CustomException："+customException.getMessage()+"\t"+"错误位置："+ex.getStackTrace()[0];	   
	} else {	   
	    message = "Exception:"+ex.getMessage()+"\t"+"错误位置："+ex.getStackTrace()[0];
	    modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
	}
	
	 return modelAndView;

    }
}