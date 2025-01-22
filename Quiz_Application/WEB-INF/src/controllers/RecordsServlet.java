package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.annotation.WebServlet;

import models.Quiz;
import models.User;
 
@WebServlet("/records.do")
public class RecordsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException , ServletException {

            HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");


            ArrayList<Quiz>  quizs = Quiz.collectBooks(user);
  
            System.out.println(quizs);
             
        
            request.setAttribute( "quizs", quizs);



        request.getRequestDispatcher("recordsServlet.jsp").forward(request, response);

    }
}
