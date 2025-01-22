package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

@WebServlet("/register.do")
public class RegisterServlet  extends HttpServlet {

    public void doGet(HttpServletRequest request , HttpServletResponse response ) throws IOException , ServletException  {

         request.getRequestDispatcher("register.jsp").forward(request, response);
    }


    public void doPost(HttpServletRequest request , HttpServletResponse response ) throws IOException , ServletException  {
        
        String userName = request.getParameter("first_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");

        System.out.println(userName + " " + email + " " + password + " " + mobile);

        String nextPage = "login.jsp";
         
     
        User user = new User(userName, email, password, mobile);
    
        if (user.signupUser()) {
            nextPage = "login.jsp";
        }


        request.getRequestDispatcher(nextPage).forward(request, response);

       
   }
    
}
