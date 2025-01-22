<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
            border: 1px solid rebeccapurple;
            border-radius: 7px;
            box-shadow: 2px 2px 2px 2px black;
            margin: 20px auto;
            padding: auto;
        }
        th{
            padding: 14px;
        }
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body style="background-color: rgb(218, 164, 94)" >

   <div class="container">
    <table border="1" align="center" width="80%">
        <tr style="background-color: rgb(69, 69, 199); color: wheat; font-size: 25px;">
            <th>Sr No.</th>
            <th>Answer 1</th>
            <th>Answer 2</th>
            <th>Answer 3</th>
            <th>Answer 4</th>
            <th>Answer 5</th>
            <th>Answer 6</th>
            <th>Answer 7</th>
            <th>Answer 8</th>
            <th>Answer 9</th>
            <th>Answer 10</th>
            <th>User Name</th>
            <th>User Score</th>
        </tr>
        <c:forEach var="quizs" items="${quizs}" varStatus="a">
            <tr style=" background-color: rgb(193, 242, 242); color: rgb(46, 36, 18); font-size: 25px;">
                <td>${a.count}.</td>
                <td>${quizs.question_1}</td>
                <td>${quizs.question_2}</td>
                <td>${quizs.question_3}</td>
                <td>${quizs.question_4}</td>
                <td>${quizs.question_5}</td>
                <td>${quizs.question_6}</td>
                <td>${quizs.question_7}</td>
                <td>${quizs.question_8}</td>
                <td>${quizs.question_9}</td>
                <td>${quizs.question_10}</td>
                <td>${quizs.user.userName}</td>
                <td>${quizs.score}</td>
            </tr>
        </c:forEach>
    </table>

    <h4 style="color: rgb(36, 42, 14); margin-left: 100px;"> <u>Note: your worng answer not show in table</u></h4>
    

   
    <table border="1" align="center" width="80%">
        <caption class="fs-1">Correct Answers</caption>
        <tr style="background-color: rgb(56, 240, 71); color: wheat; font-size: 25px;">
            <th>Answer 1</th>
            <th>Answer 2</th>
            <th>Answer 3</th>
            <th>Answer 4</th>
            <th>Answer 5</th>
            <th>Answer 6</th>
            <th>Answer 7</th>
            <th>Answer 8</th>
            <th>Answer 9</th>
            <th>Answer 10</th>
        </tr>
        <tr style=" background-color: rgb(193, 242, 242); color: rgb(46, 36, 18); font-size: 25px;">
            <td> James Gosling</td>
            <td> JDK</td>
            <td> Use of pointers</td>
            <td> 32</td>
            <td> all of the mentioned</td>
            <td> 1 2 3</td>
            <td> Compilation</td>
            <td> false</td>
            <td> ziuQ</td>
            <td> Object class</td>
        </tr>
   </table>
     
   </div>
</body>
</html>