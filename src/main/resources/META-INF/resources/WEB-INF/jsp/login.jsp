<html>
    <head>
        <title>Login</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    </head>
    <body>
    <div class="container">
            <h1>TODO Application</h1>
            <pre>${errorMessage}</pre>
            <form class="form" method="post">
                Username: <input type="text" name="username" placeholder="Username">
                Password: <input type="password", name="password" placeholder="Password">
                <input type="submit">
            </form>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>