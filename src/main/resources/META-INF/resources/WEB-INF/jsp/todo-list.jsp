<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <title>Todos</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    </head>
    <body>
        <div class="container">
            <div> <h2>Welcome ${username}</h2> </div>
            <hr>
                <h1>Your todo list</h1>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Description</th>
                            <th>Target date</th>
                            <th>Is done?</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.todoID}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.todoID}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-todo?id=${todo.todoID}" class="btn btn-success">UPDATE</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <a href="add-todo" class="btn btn-success">Add Todo</a>
            </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>