package Interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyFileInterceptor extends HandlerInterceptorAdapter {
	
	
	@Override
    public boolean preHandle(HttpServletRequest request, 
            HttpServletResponse response, Object handler)throws Exception {
        boolean flag= true;
            
            MultipartHttpServletRequest multipartRequest = 
                    (MultipartHttpServletRequest) request;
   
            List<MultipartFile> lists= multipartRequest.getFiles("multipartFile");
            for(MultipartFile file:lists){
            	if(!file.isEmpty()){          
                        String filename=file.getOriginalFilename();
                        if( file.getSize()>1000000){
                        	 request.setAttribute("message", "文件大小超过范围！");
                             request.getRequestDispatcher("/UpLoad.jsp")
                             .forward(request, response); 
                             flag= false;
                        }                     
                        //判断是否为限制文件类型
                        if (! checkFile(filename)) {
                            //限制文件类型，请求转发到原始请求页面，并携带错误提示信息
                            request.setAttribute("message", "不支持的文件类型！");
                            request.getRequestDispatcher("/UpLoad.jsp")
                            .forward(request, response); 
                            flag= false;
                        } 
                    }
            	}
      

        return flag;
    }
   
  
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
    
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	
    
	  private boolean checkFile(String fileName) {
	        //设置允许上传文件类型
	        String suffixList = "jpg,gif,png,ico,bmp,jpeg";
	        // 获取文件后缀
	        String suffix = fileName.substring(fileName.lastIndexOf(".")
	                + 1, fileName.length());
	        if (suffixList.contains(suffix.trim().toLowerCase())) {
	            return true;
	        }
	        return false;
	    }

    
    
    
    
    
    
    
}