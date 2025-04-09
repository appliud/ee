<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>JSP 演示首页</title>
  <style>
    body {
      font-family: 'PingFang SC', 'Microsoft YaHei', sans-serif;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      min-height: 100vh;
      margin: 0;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      color: #ffffff;
    }

    .container {
      text-align: center;
      max-width: 800px;
      width: 90%;
      padding: 40px;
      border-radius: 20px;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      border: 1px solid rgba(255, 255, 255, 0.2);
      margin: 20px;
    }

    h1 {
      color: #ffffff;
      font-size: 3.5rem;
      margin-bottom: 30px;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
      position: relative;
      display: inline-block;
    }

    h1::after {
      content: '';
      position: absolute;
      bottom: -10px;
      left: 50%;
      transform: translateX(-50%);
      width: 80px;
      height: 4px;
      background: linear-gradient(90deg, #00ff87, #60efff);
      border-radius: 2px;
    }

    p {
      color: rgba(255, 255, 255, 0.9);
      font-size: 1.4rem;
      margin-bottom: 40px;
      line-height: 1.6;
    }

    .link-group {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
      gap: 25px;
      padding: 20px;
    }

    .link-group a {
      display: flex;
      align-items: center;
      justify-content: center;
      padding: 15px 25px;
      font-size: 1.2rem;
      color: #ffffff;
      text-decoration: none;
      border-radius: 12px;
      transition: all 0.3s ease;
      background: rgba(255, 255, 255, 0.1);
      border: 1px solid rgba(255, 255, 255, 0.2);
      backdrop-filter: blur(5px);
      position: relative;
      overflow: hidden;
    }

    .link-group a::before {
      content: '';
      position: absolute;
      top: 0;
      left: -100%;
      width: 100%;
      height: 100%;
      background: linear-gradient(
        90deg,
        transparent,
        rgba(255, 255, 255, 0.2),
        transparent
      );
      transition: 0.5s;
    }

    .link-group a:hover {
      transform: translateY(-5px);
      background: rgba(255, 255, 255, 0.2);
      box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
    }

    .link-group a:hover::before {
      left: 100%;
    }

    @media (max-width: 768px) {
      .container {
        padding: 20px;
        margin: 10px;
      }

      h1 {
        font-size: 2.5rem;
      }

      p {
        font-size: 1.2rem;
      }

      .link-group {
        grid-template-columns: 1fr;
        gap: 15px;
      }

      .link-group a {
        padding: 12px 20px;
        font-size: 1.1rem;
      }
    }
  </style>
</head>
<body>
<div class="container">
  <h1><%= "欢迎来到 JSP 演示" %></h1>
  <p>探索我们的功能演示页面，体验不同的交互效果</p>
  <div class="link-group">
    <a href="student1.html">学生管理系统</a>
    <a href="jsq.html">计算器</a>
    <a href="t.html">测试页面</a>
    <a href="1_1.html">AI 智能助手</a>
  </div>
</div>
</body>
</html>
