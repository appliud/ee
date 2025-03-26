<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>JSP - Hello World</title>
  <style>
    body {
      font-family: 'Arial', sans-serif;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
      margin: 0;
      background: linear-gradient(135deg, #f4f4f9, #dfe9f3);
    }

    .container {
      text-align: center;
      max-width: 600px;
      width: 100%;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
      background-color: #ffffff;
    }

    h1 {
      color: #333333;
      font-size: 3rem;
      margin-bottom: 20px;
    }

    p {
      color: #666666;
      font-size: 1.2rem;
      margin-bottom: 30px;
    }

    .link-group {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 20px;
    }

    .link-group a {
      display: inline-block;
      padding: 10px 20px;
      font-size: 1.1rem;
      color: #ffffff;
      text-decoration: none;
      border-radius: 5px;
      transition: all 0.3s ease;
      background-color: #007bff;
    }

    .link-group a:hover {
      background-color: #0056b3;
      transform: translateY(-2px);
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }
  </style>
</head>
<body>
<div class="container">
  <h1><%= "Hello World!" %></h1>
  <p>Welcome to the JSP Demo Page</p>
  <div class="link-group">
    <a href="student1.html">Student Management</a>
    <a href="jsq.html">Calculator</a>
  </div>
</div>
</body>
</html>
