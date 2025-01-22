
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Quiz Application</title>
  <style>
            body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .quiz-container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 90%;
            max-width: 400px;
        }
        .quiz-container h1 {
            margin-bottom: 20px;
            color: #333;
        }
        .start-btn {
            display: inline-block;
            padding: 10px 20px;
            font-size: 16px;
            color: white;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
        }
        .start-btn:hover {
            background-color: #0056b3;
        }
    </style>
  <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"> -->
</head>
<body style="background-color: rgb(11, 116, 177);">
  <div class="container">
  <div class="quiz-container">
    <h1>Welcome to the Quiz!</h1>
    <p>Test your knowledge with java program questions.</p>
    <a href="quiz.do" class="start-btn">Start Quiz</a>
</div>   
</div>


    
</body>
</html>