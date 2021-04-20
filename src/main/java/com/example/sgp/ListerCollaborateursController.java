package com.example.sgp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListerCollaborateursController", value = "/collaborateurs/lister")
public class ListerCollaborateursController extends HttpServlet {
    private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
        if (collaborateurs == null || collaborateurs.isEmpty()) {
            Collaborateur collab = new Collaborateur("Hue", "Robert", LocalDate.parse("1932-10-18"), "11 rue des rouges", "1 32 35 00 00");
            collabService.sauvegarderCollaborateur(collab);
        }
        req.setAttribute("listeNoms", collabService.listerCollaborateurs());
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration paramNames = req.getParameterNames();
//        while(paramNames.hasMoreElements()) {
//            String paramName = (String)paramNames.nextElement();
//            String paramValue = req.getParameter(paramName);
//            System.out.println("Param Name  [" + paramName+ "]  | value is ["+ paramValue + "]");
//        }
        Collaborateur collab = new Collaborateur(req.getParameter("nom"), req.getParameter("prenom"), LocalDate.parse(req.getParameter("date_de_naissance")), req.getParameter("adresse"), req.getParameter("numeroSecu"));
        collabService.sauvegarderCollaborateur(collab);
        req.setAttribute("listeNoms", collabService.listerCollaborateurs());
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
    }

}
