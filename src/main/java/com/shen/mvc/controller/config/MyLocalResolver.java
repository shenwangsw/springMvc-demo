package com.shen.mvc.controller.config;

import com.sun.corba.se.spi.orbutil.closure.Closure;

import org.omg.CORBA.Object;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Set;

@Configuration
public class MyLocalResolver implements LocaleResolver {


    public LocaleContext resolveLocaleContext(HttpServletRequest request) {
        return null;
    }

    public void setLocaleContext(HttpServletRequest request, HttpServletResponse response, LocaleContext localeContext) {

    }

    public Locale resolveLocale(HttpServletRequest request) {
            String lang = request.getParameter("text");
            Locale locale = Locale.getDefault();
            if (!StringUtils.isEmpty(lang)){
                String [] split = lang.split("_");
                locale = new Locale(split[0],split[1]);

            }
            return locale;


    }

    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
