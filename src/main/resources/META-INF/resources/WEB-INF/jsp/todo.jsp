<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Add Todo</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    </head>
    <body>
    <div class="container">
            <h1>Add Todo</h1>
            <form:form class="form" method="post" modelAttribute="todo">
                <form:input type="text" path="description" placeholder= "Description"/>
                <form:input type="hidden" path="todoID"/>
                <form:input type="hidden" path="userID"/>
                <form:input type="hidden" path="targetDate"/>
                <form:input type="hidden" path="done"/>
                <br>
                <form:errors path="description" cssClass="text-warning"/>
                <br>
                <input type="submit" class="btn btn-success"></input>
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>