package com.xworkz.techapp.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TechAppWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Invoking getRootConfig Class");
        return  null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Invoking servlet config Class");
        return new Class[]{TechAppConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Invoking servlet mapping");
        return new String[]{"/"};
    }
}
