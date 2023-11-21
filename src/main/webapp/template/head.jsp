<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<style>
    body{
        background-image: url("https://gas-kvas.com/uploads/posts/2023-03/1678453075_gas-kvas-com-p-devushka-i-paren-risunok-belim-na-chernom-48.jpg");

    }
    footer {
        background-color: #f9f9f9;
        padding: 20px;
        text-align: left;
    }

    .game-stats p {
        margin: 10px 0;
    }
    @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }

    {
        animation: fadeIn 1s ease-in-out;
    }

    .game-stats span {
        font-weight: bold;
    }

    .game-stats p span {
        color: #ff0000;
    }
    form{
        margin-top: 100px;
        align-items: center;
        font-family: Arial, sans-serif;
        background-color: #ffffff;
    }
    .imger{
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
      margin-left: 500px;
        width: 450px;
        height: 400px;
    }

    h1 {
        font-size: 36px;
        font-weight: bold;
        text-align: center;
    }

    p {
        font-size: 24px;
        text-align: center;
    }

    .button {
        display: inline-block;
        padding: 12px 24px;
        background-color: #bd8db8;
        color: #fff;
        font-size: 18px;
        border-radius: 4px;
        transition: background-color 0.3s ease;
        margin-left: 600px;
        margin-top: 50px;
    }

    .button:hover {
        background-color: #700166;
    }
     .bttn {
         display: inline-block;
         padding: 10px 20px;
         background-color: #007bff;
         color: #fff;
         font-size: 16px;
         border-radius: 5px;
         border: none;
         cursor: pointer;
         transition: background-color 0.3s ease;
     }

    .bttn:hover {
        background-color: #0056b3;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }

    @keyframes slideIn {
        from {
            transform: translateY(-50px);
        }
        to {
            transform: translateY(0);
        }
    }
    .start-again-bttn {
        animation: fadeIn 1s ease-in-out;
        animation-delay: 0.5s;
    }

    .try-again-bttn {
        animation: fadeIn 1s ease-in-out;
        animation-delay: 1s;
    }
</style>
