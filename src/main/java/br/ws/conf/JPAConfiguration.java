package br.ws.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
/*@EnableJpaRepositories(basePackages = {"br.ws.models.*"})*/
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"br.ws.models"})
@PropertySource("classpath:application.properties")
public class JPAConfiguration {
	@Autowired
    private Environment env;

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( env.getProperty( "database.driver" ) );
        dataSource.setUrl(env.getProperty("database.url"));
        dataSource.setUsername(env.getProperty("database.user"));
        dataSource.setPassword(env.getProperty("database.password"));
        dataSource.setSchema(env.getProperty("database.schema"));
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan(new String[]{ "br.ws.entities" });
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(additionalProperties());
        return em;
    }

    private Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto",env.getProperty( "hibernate.hbm2ddl.auto" ));
        properties.setProperty("hibernate.show_sql", env.getProperty( "hibernate.show_sql" ));
        properties.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.dialect", env.getProperty( "hibernate.dialect" ));

        return properties;
    }

    @Bean
    public PlatformTransactionManager transactionManager
            (EntityManagerFactory emf){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }
}
