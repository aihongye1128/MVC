package domain;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class StaticFilter implements Filter {
	private FilterConfig config;

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

	
		String category = request.getParameter("category");
		String htmlPage = category + ".html";// 得到对应的文件名称
		String htmlPath = config.getServletContext().getRealPath("/htmls");// 

		File destFile = new File(htmlPath, htmlPage);		
		if (destFile.exists()) {
			res.sendRedirect(req.getContextPath() + "/htmls/" + htmlPage);
			return;
		} else{
			StaticResponse sr = new StaticResponse(res, destFile.getAbsolutePath());
			chain.doFilter(request, sr);	
			res.sendRedirect(req.getContextPath() + "/htmls/" + htmlPage);
		}
		
		
	}
}
