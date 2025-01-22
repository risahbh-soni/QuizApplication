<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Quiz Application</title>
  <style>
    /* General Reset */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: Arial, sans-serif;
    }

    /* Body Styling */
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #8383e8;
    }

    /* Main Container */
    .container {
      text-align: center;
      background-color: #ffffff;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      width: 100%;
      max-width: 400px;
    }

    .container h1 {
      font-size: 24px;
      margin-bottom: 20px;
      color: #333333;
    }

    /* Buttons */
    .container a {
      display: inline-block;
      width: 100%;
      padding: 12px 20px;
      margin: 10px 0;
      text-align: center;
      text-decoration: none;
      color: #ffffff;
      background-color: #4CAF50;
      border-radius: 5px;
      font-size: 16px;
      font-weight: bold;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    .container a:hover {
      background-color: #45a049;
    }

    .container a.register {
      background-color: #007BFF;
    }

    .container a.register:hover {
      background-color: #0056b3;
    }

    /* Responsive Design */
    @media (max-width: 480px) {
      .container h1 {
        font-size: 20px;
      }

      .container a {
        font-size: 14px;
        padding: 10px 15px;
      }
    }
  </style>
</head>
<body>
  
  <div class="container">
    <h1>Welcome to Quiz Application</h1>
    <a href="login.jsp" class="login">Login</a>
    <a href="register.jsp" class="register">Register</a>
  </div>

</body>
</html>
