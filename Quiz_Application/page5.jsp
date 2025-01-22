<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz Question</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            
        }
        .quiz-container {
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 400px;
            width: 100%;
            text-align: left;
        }
        h1 {
            font-size: 22px;
            margin-bottom: 20px;
        }
        .question {
            margin-bottom: 15px;
        }
        .answers label {
            display: block;
            margin-bottom: 10px;
            font-size: 16px;
            cursor: pointer;
        }
        button {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

</head>
<body style="  background-color: #8383e8;">
    <div class="quiz-container">
        <h1>Quiz Question</h1>
        <form action="access.do" method="get">
            <input type="hidden" name="page" value="page5" />
        <div class="question">

            <p>5. What will be the output of the following Java program? <br>

                class output { <br>
                        public static void main(String args[])  <br>
                        {<br>
                            double a, b,c; <br>
                            a = 3.0/0; <br>
                            b = 0/4.0; <br>
                            c=0/0.0;   <br>
                 
                         System.out.println(a); <br>
                         System.out.println(b); <br>
                            System.out.println(c); <br>
                        } <br>
                    }  <br> </p>
            <div class="answers">
                <label><input type="radio" name="q5" value="NaN"> NaN</label>
                <label><input type="radio" name="q5" value="Infinity"> Infinity</label>
                <label><input type="radio" name="q5" value="0.0"> 0.0</label>
                <label><input type="radio" name="q5" value="all of the mentioned"> all of the mentioned</label>
            </div>
        </div>
        <input type="submit" value="submit" id="inp" class="btn btn-primary">
        </form>
    </div>

</body>
</html>
