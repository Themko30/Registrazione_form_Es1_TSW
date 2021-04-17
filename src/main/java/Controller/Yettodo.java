package Controller;


import Model.Customer;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Yettodo")
public class Yettodo extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cname = request.getParameter("nome");
        String csurname = request.getParameter("cognome");
        String cbirthday = request.getParameter("datanascita");
        String ccity = request.getParameter("city");
        String cprovince = request.getParameter("provincia");
        String czip = request.getParameter("Zip");
        String caddress = request.getParameter("strada");
        String cgender = request.getParameter("gender");
        String cid = request.getParameter("codid");
        String cemail = request.getParameter("email");
        String ctel = request.getParameter("tel");
        String cweb = request.getParameter("webpage");

        int postalCode;
        int numCID;
        long tel;
        String path;
        postalCode = Integer.parseInt(czip);
        numCID = Integer.parseInt(cid);
        tel = Long.parseLong(ctel);

        Customer customer = new Customer(cname, csurname, cgender, cbirthday, ccity, cprovince, postalCode, caddress, numCID, cemail, tel, cweb);
        request.setAttribute("customerkey", customer);
        path = "/WEB-INF/Results/output.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);

    }

}
