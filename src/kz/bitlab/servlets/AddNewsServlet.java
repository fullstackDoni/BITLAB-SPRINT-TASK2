package kz.bitlab.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.db.DBConnection;
import kz.bitlab.db.Items;
import kz.bitlab.db.Users;

import java.io.IOException;

@WebServlet(value = "/AddNews")
public class AddNewsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users users = (Users) request.getSession().getAttribute("currentUser");
        if(users!=null){
            request.getRequestDispatcher("/AddNews").forward(request,response);

        }else{
            response.sendRedirect("/login");
        }
    }
}
