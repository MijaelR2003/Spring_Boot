/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MijaelRojas.MiPrimerSpringBoot.web;

import java.util.Locale;
//import org.hibernate.validator.spi.messageinterpolation.LocaleResolver;
//import org.springframework.web.servlet.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author MijaelR
 */
public class WebConfig implements WebMvcConfigurer{
    
    @Bean 
    public LocaleResolver localeResolver (){
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale ("en"));
        return slr;
    }
    
    @Bean 
    public LocaleChangeInterceptor localeChangeInterceptor (){
        var lci= new LocaleChangeInterceptor();
        lci.setParamName("Lang");
        return lci;
    }
    
    public void addInterceptor (InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
}