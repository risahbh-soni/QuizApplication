package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class User {

    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private String mobile;

    static StrongPasswordEncryptor  spe = new StrongPasswordEncryptor();

    

     public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(String userName, String email, String password, String mobile) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }


    public boolean signinUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizappdb?user=root&password=1234");

            String query = "select password,user_id,user_name,mobile from users where email=?";

            PreparedStatement ps = con.prepareStatement(query);
           
            ps.setString(1, email);
            // ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                if(spe.checkPassword(password, rs.getString(1))) {
                    userId = rs.getInt(2);
                    userName = rs.getString(3);
                    mobile = rs.getString(4);
                    

                    flag = true;
                }                
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public boolean signupUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizappdb?user=root&password=1234");

            String query = "insert into users (user_name,email,password,mobile) value (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, spe.encryptPassword(password));
            ps.setString(4, mobile);
    

            int val = ps.executeUpdate();

            if(val==1)
                flag = true;

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

  

     public void setUserId(Integer userId) {
          this.userId = userId;
     }
     public Integer getUserId() {
        return userId;
     }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    

    
}
