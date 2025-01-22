package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Quiz {
    private Integer quizId;
    private String question_1;
    private String question_2;
    private String question_3;
    private String question_4;
    private String question_5;
    private String question_6;
    private String question_7;
    private String question_8;
    private String question_9;
    private String question_10;
    private User user;
    private Integer score;
   
    
    

    public Quiz(String question_1, String question_2, String question_3, String question_4, String question_5,
            String question_6, String question_7, String question_8, String question_9, String question_10) {
        this.question_1 = question_1;
        this.question_2 = question_2;
        this.question_3 = question_3;
        this.question_4 = question_4;
        this.question_5 = question_5;
        this.question_6 = question_6;
        this.question_7 = question_7;
        this.question_8 = question_8;
        this.question_9 = question_9;
        this.question_10 = question_10;
    }

    
    public Quiz(Integer quizId, String question_1, String question_2, String question_3, String question_4,
            String question_5, String question_6, String question_7, String question_8, String question_9,
            String question_10, User user, Integer score) {
        this.quizId = quizId;
        this.question_1 = question_1;
        this.question_2 = question_2;
        this.question_3 = question_3;
        this.question_4 = question_4;
        this.question_5 = question_5;
        this.question_6 = question_6;
        this.question_7 = question_7;
        this.question_8 = question_8;
        this.question_9 = question_9;
        this.question_10 = question_10;
        this.user = user;
        this.score = score;
    }


    public Quiz(String question_1, String question_2, String question_3, String question_4, String question_5,
            String question_6, String question_7, String question_8, String question_9, String question_10, User user,
            Integer score) {
        this.question_1 = question_1;
        this.question_2 = question_2;
        this.question_3 = question_3;
        this.question_4 = question_4;
        this.question_5 = question_5;
        this.question_6 = question_6;
        this.question_7 = question_7;
        this.question_8 = question_8;
        this.question_9 = question_9;
        this.question_10 = question_10;
        this.user = user;
        this.score = score;
    }



    
    public static ArrayList<Quiz> collectBooks(User user) {
        ArrayList<Quiz> quizs = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizappdb?user=root&password=1234");

            String query = "select * from quizs where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, user.getUserId());

            ResultSet rs = ps.executeQuery();

            while(rs.next())    
                quizs.add(new Quiz(rs.getInt(1),rs.getString(2) ,rs.getString(3), rs.getString(4) ,
                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
                 rs.getString(11), user,rs.getInt(13)));

        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return quizs;
    }


    
    public boolean saveQuizs() {
        boolean flag = false;

        try {
            // System.out.println(question_1 + " " + question_2 + " " + question_3 + " " + question_5 + score);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizappdb?user=root&password=1234");

            String query = "insert into quizs(question_1,question_2,question_3,question_4,question_5,question_6,question_7,question_8,question_9,question_10,user_id,score) value (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,question_1);
            ps.setString(2,question_2);
            ps.setString(3,question_3);
            ps.setString(4,question_4);
            ps.setString(5,question_5);
            ps.setString(6,question_6);
            ps.setString(7,question_7);
            ps.setString(8,question_8);
            ps.setString(9,question_9);
            ps.setString(10,question_10);
            ps.setInt(11, user.getUserId());
            ps.setInt(12, score);
           
          if(ps.executeUpdate()==1) 
                flag = true;
            
            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public String getQuestion_1() {
        return question_1;
    }
    public void setQuestion_1(String question_1) {
        this.question_1 = question_1;
    }
    public String getQuestion_2() {
        return question_2;
    }
    public void setQuestion_2(String question_2) {
        this.question_2 = question_2;
    }
    public String getQuestion_3() {
        return question_3;
    }
    public void setQuestion_3(String question_3) {
        this.question_3 = question_3;
    }
    public String getQuestion_4() {
        return question_4;
    }
    public void setQuestion_4(String question_4) {
        this.question_4 = question_4;
    }
    public String getQuestion_5() {
        return question_5;
    }
    public void setQuestion_5(String question_5) {
        this.question_5 = question_5;
    }
    public String getQuestion_6() {
        return question_6;
    }
    public void setQuestion_6(String question_6) {
        this.question_6 = question_6;
    }
    public String getQuestion_7() {
        return question_7;
    }
    public void setQuestion_7(String question_7) {
        this.question_7 = question_7;
    }
    public String getQuestion_8() {
        return question_8;
    }
    public void setQuestion_8(String question_8) {
        this.question_8 = question_8;
    }
    public String getQuestion_9() {
        return question_9;
    }
    public void setQuestion_9(String question_9) {
        this.question_9 = question_9;
    }
    public String getQuestion_10() {
        return question_10;
    }
    public void setQuestion_10(String question_10) {
        this.question_10 = question_10;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getQuizId() {
        return quizId;
    }
    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }




    public Integer getScore() {
        return score;
    }




    public void setScore(Integer score) {
        this.score = score;
    }

    
    
}
