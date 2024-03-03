<%@ include file = "common/header.jspf" %>
        <title>Welcome</title>
    </head>
    <body>
    <%@ include file = "common/navigation.jspf" %>
        <div class="container">
            <div> <h2>Welcome ${username}</h2> </div>
            <hr>
            <div><a href="todos">Manage</a> your todos</div>
        </div>
    <%@ include file = "common/footer.jspf" %>