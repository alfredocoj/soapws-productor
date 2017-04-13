package br.ws;

import org.springframework.core.io.ClassPathResource;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.SimpleXsdSchema;

@Configuration
@EnableWs
@ComponentScan("br.ws") 
public class WsAppConfiguration extends WsConfigurerAdapter {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}
	
	@Bean(name = "alunos")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema){
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AlunosPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://ws.br/soap");
		wsdl11Definition.setSchema(studentsSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema studentsSchema() {
		return new SimpleXsdSchema(new ClassPathResource("alunos.xsd"));
	}
}
