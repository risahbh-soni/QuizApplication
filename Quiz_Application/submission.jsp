<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #a{
            margin-top: 300px;
            border: 1px solid rgb(48, 37, 37);
            box-shadow: 2px 2px 2px 2px;
            background-color: greenyellow;
            font-weight: bold;
            font-size: 50px;
            font-style: normal;
            text-align: center;
        }
    </style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body style="background-color: rgb(218, 164, 94);">
    
    <div class="container">
       
    <div id="a">
        Thank You for Subbmisson

        <% Integer score = (Integer)session.getAttribute("score"); %>
       
           Your score is <h1><%= score %><h1>

          
    </div>
   
 
          
<h1> <a href="records.do">cheek your answer</a></h1>

</div>
</body>
</html>