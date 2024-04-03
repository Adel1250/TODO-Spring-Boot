<%@ include file = "common/header.jspf" %>
        <title>Add Todo</title>
    </head>
    <body>
        <%@ include file = "common/navigation.jspf" %>
        <div class="container">
            <h4>Add Todo</h4>
            <form:form class="form" method="post" modelAttribute="todo">
                <fieldset class="mb-3">
                    <form:label path="description">Description</form:label>
                    <form:input type="text" path="description" required="required"/>
                    <form:errors path="description" cssClass="text-warning"/>
                </fieldset>

                <fieldset class="mb-3">
                    <form:label path="targetDate">Target date</form:label>
                    <form:input type="text" path="targetDate" required="required"/>
                    <form:errors path="targetDate" cssClass="text-warning"/>
                </fieldset>

                <form:input type="hidden" path="todoID"/>
                <form:input type="hidden" path="done"/>
                <form:input type="hidden" path="username"/>
                <input type="submit" class="btn btn-success"></input>
            </form:form>
        </div>
        <%@ include file = "common/footer.jspf" %>
        <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">
            $('#targetDate').datepicker({
                format: 'yyyy-mm-dd'
            });
        </script>