/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Paises", urlPatterns = {"/Paises"})
public class Paises extends HttpServlet {
Argelia argelia;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title style=\"color:white\">Paises de africa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Paises Africanos</h1>");
            int pais=Integer.parseInt(request.getParameter("paises"));
            switch (pais){
                case 1:
                    //out.println("<h3 style=\"color:white\">Argelia</h3>");
                    argelia=new Argelia(request.getParameter("paises"), (int) Double.parseDouble( request.getParameter("pesos")),request.getParameter("palabra") );
                    out.print(argelia.implimir());// argelia.implimir();
                    break;
                case 2: 
                    out.println("<h3>Camerún</h3>");
                    break;
                case 3:
                    out.println("<h3>Costa de Marfil</h3>");
                    break;
                case 4:
                       out.println("<h3>Egipto</h3>");
                       break;
                case 5:
                       out.println("<h3>Nigeria</h3>");
                       break;
                    
            }
            
          //  out.println("<h1>Servlet Paises at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}