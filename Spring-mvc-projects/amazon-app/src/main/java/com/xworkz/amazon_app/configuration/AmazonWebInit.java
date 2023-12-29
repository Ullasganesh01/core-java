package com.xworkz.amazon_app.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AmazonWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AmazonAppConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
