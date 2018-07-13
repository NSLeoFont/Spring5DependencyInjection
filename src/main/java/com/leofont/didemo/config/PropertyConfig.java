package com.leofont.didemo.config;

import com.leofont.didemo.examplebeans.FakeDataSource;
import com.leofont.didemo.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
////@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

//    @Autowired
//    Environment env;

    @Value("${dbLeo.username}")
    String user;

    @Value("${dbLeo.password}")
    String password;

    @Value("${dbLeo.dburl}")
    String url;

    @Value("${dbLeo.jms.username}")
    String jmsuser;

    @Value("${dbLeo.jms.password}")
    String jmspassword;

    @Value("${dbLeo.jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
      //  fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJmsBroker() {
        FakeJMSBroker fakeJmsBroker = new FakeJMSBroker();
        fakeJmsBroker.setUser(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}
