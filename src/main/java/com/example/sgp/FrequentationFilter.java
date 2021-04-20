package com.example.sgp;

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter( urlPatterns="/*" )
public class FrequentationFilter implements Filter {
    private FilterConfig config = null;
    private VisiteWebService visiteService = Constantes.VISITE_SERVICE;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = config;
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long before = System.currentTimeMillis();
        chain.doFilter(request, response);
        long after = System.currentTimeMillis();
        String uriPath = ((HttpServletRequest) request).getRequestURI();
        VisiteWeb visite = new VisiteWeb(uriPath, (int)(after-before));
        visiteService.sauvegarderVisite(visite);
        for(VisiteWeb stat: visiteService.listerVisites()){
            System.out.println("Page URI ["+stat.getChemin()+"] fetched in "+stat.getTempsExecution()+"ms");
        }
    }
}
