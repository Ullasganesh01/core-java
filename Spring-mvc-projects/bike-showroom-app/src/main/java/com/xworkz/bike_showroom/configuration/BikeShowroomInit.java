package com.xworkz.bike_showroom.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BikeShowroomInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BikeShowroomConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
