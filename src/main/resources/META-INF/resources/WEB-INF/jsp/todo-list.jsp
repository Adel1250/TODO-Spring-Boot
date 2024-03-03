<%@ include file = "common/header.jspf" %>
        <title>Todos</title>
    </head>
    <body>
        <%@ include file = "common/navigation.jspf" %>
        <div class="container">
            <div> <h2>Welcome ${username}</h2> </div>
            <hr>
                <h3>Your todo list</h3>
                <table class="table">
                    <thead>
                        <tr>
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
        <%@ include file = "common/footer.jspf" %>