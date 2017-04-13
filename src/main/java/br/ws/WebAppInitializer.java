package br.ws;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(WsAppConfiguration.class);  
        ctx.setServletContext(servletContext);    
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	servlet.setApplicationContext(ctx);
	servlet.setTransformWsdlLocations(true);
        Dynamic dynamic = servletContext.addServlet("dispatcher",servlet);  
        dynamic.addMapping("/wssoap/*");  
        dynamic.setLoadOnStartup(1);  
		
	}

}
