<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<% String name = request.getParameter("name"); %>
<% String email = request.getParameter("email"); %>
<% String contact = request.getParameter("contact"); %>

<title>Insert title here</title>
    <style>
        body{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            background-repeat: no-repeat;
            background-size: cover;
            background-color:silver hh;
           background-image: linear-gradient(orange,white,green);
           background-repeat: no-repeat;
             
        }
        .box{
            height:450px;
            width: 800px;
            /* border: 1px solid; */
            margin: 0 auto;
           /* background-image: url(.); */
           background-size: cover;
           opacity: .5;
           background-color: rgb(4, 2, 2);
           position: relative;
           color: white;
           border-radius: 20px;
            box-shadow:  black 10px 20px 5px;
        }
        h1{
             color:black;
             margin-left: 500px;
             font-family: 'Times New Roman', Times, serif;
             margin-top: 75px;
             font-style:oblique;
             font-size: 40px;
        }
        label{
            letter-spacing: 5px;
            margin-left: 100px;
           font-family: 'Times New Roman', Times, serif;
        }
        input{
            font-family: 'Times New Roman', Times, serif;
        }
        select{
            font-family: 'Times New Roman', Times, serif;
            margin-left: 25px;
            width:150px;
            height: 25px;
        }
       
      
    </style>
</head>
<body>
 
 <h1>student details</h1>
    
      name:
      <%=name %> <br> <br>
      
	 email:
	<%=email %><br> <br>
	
	 contact:
   <%=contact %><br> <br>
   
</body>
</html>