package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Quiz;
import models.User;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/access.do")
public class AccessAllQuestionServlet extends HttpServlet {
    
    private void handleQuestion(HttpServletRequest request, HttpServletResponse response, HttpSession session, 
    String questionKey, String correctAnswer, String nextPage) throws IOException {
    String answer = questionKey; // Get the answer from the request
    Integer score = (Integer) session.getAttribute("score");
    if (score == null) {
    score = 0;
    }

    // Check if the answer is correct
    if (correctAnswer.equals(answer)) {
    score += 10;
    }
    // Update quiz answers in session
    Map<String, String> quizAnswers = (Map<String, String>) session.getAttribute("quizAnswers");

    if (quizAnswers == null) {
    quizAnswers = new HashMap<>();
    }
    
    quizAnswers.put(questionKey , answer);  //Save the answer for the current question
    session.setAttribute("quizAnswers",quizAnswers);
    session.setAttribute("score", score);
                      
    
    // Redirect to the next page
    response.sendRedirect(nextPage);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
    
        // Check if the user is logged in
        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    
        
        // Get the current page identifier
        String page = request.getParameter("page");
    
        // Handle questions based on the current page
        switch (page) {
            case "page1":
                handleQuestion(request, response, session, request.getParameter("q1"), "James Gosling", "page2.jsp");
                break;
            case "page2":
        
                handleQuestion(request, response, session, request.getParameter("q2"), "JDK", "page3.jsp");
                break;
            case "page3":
                handleQuestion(request, response, session, request.getParameter("q3"), "Use of pointers", "page4.jsp");
                break;
            case "page4":
                handleQuestion(request, response, session, request.getParameter("q4"), "32", "page5.jsp");
                break;
            case "page5":
                handleQuestion(request, response, session, request.getParameter("q5"), "all of the mentioned", "page6.jsp");
                break;
            case "page6":
                handleQuestion(request, response, session,  request.getParameter("q6"), "1 2 3", "page7.jsp");
                break;
            case "page7":
     
                handleQuestion(request, response, session, request.getParameter("q7"), "Compilation", "page8.jsp");
                break;
            case "page8":
         
                handleQuestion(request, response, session, request.getParameter("q8"), "false", "page9.jsp");
                break;
            case "page9":
                handleQuestion(request, response, session, request.getParameter("q9"), "ziuQ", "page10.jsp");
                break;
            case "page10":
                handleQuestion(request, response, session, request.getParameter("q10"), "Object class", "submission.jsp");
    
                // Save the quiz after the last question
                Map<String, String> quizAnswers = (Map<String, String>) session.getAttribute("quizAnswers");
                Integer score = (Integer) session.getAttribute("score");
                
                if (quizAnswers != null && score != null) {
                    Quiz quiz = new Quiz(
                        quizAnswers.get("James Gosling"), quizAnswers.get("JDK"), quizAnswers.get("Use of pointers"),
                        quizAnswers.get("32"), quizAnswers.get("all of the mentioned"), quizAnswers.get("1 2 3"),
                        quizAnswers.get("Compilation"), quizAnswers.get("false"), quizAnswers.get("ziuQ"),
                        quizAnswers.get("Object class"), user, score
                    );
                    quiz.saveQuizs();  // Save quiz to database
                }
                break;
            default:
                response.sendRedirect("error.jsp");
                break;
        }
    }
    

}
    