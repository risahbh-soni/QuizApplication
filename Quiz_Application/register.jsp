<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Responsive Registration Page</title>
  <style>   /* General Reset */
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

    /* Registration Container */
    .registration-container {
      width: 100%;
      max-width: 500px;
      background-color: #ffffff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .registration-container h2 {
      text-align: center;
      margin-bottom: 20px;
      color: #333333;
    }

    /* Input Fields */
    .registration-container input {
      width: 100%;
      padding: 10px;
      margin: 10px 0;
      border: 1px solid #ccc;
      border-radius: 5px;
      font-size: 16px;
    }

    /* Button */
    .registration-container button {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }

    .registration-container button:hover {
      background-color: #45a049;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
      .registration-container {
        padding: 15px;
      }

      .registration-container h2 {
        font-size: 24px;
      }
    }

    @media (max-width: 480px) {
      .registration-container {
        padding: 10px;
      }

      .registration-container input, .registration-container button {
        font-size: 14px;
      }
    }
  </style>

  <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"> -->
</head>
<body>
    
  <div class="container">
  <div class="registration-container  ">
    <h2>Register</h2>
    <form action="register.do" method="post">
      <input type="text" name="first_name" placeholder="First Name" required>
      <input type="email" name="email" placeholder="Email" required>
      <input type="password" name="password" placeholder="Password" required>
      <input type="text" name="mobile" placeholder="Mobile" required>
      <button type="submit">Register</button>
    </form>
  </div>

</body>
</html>
