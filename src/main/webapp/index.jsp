<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h1>
    <%= "Hello World!" %>
</h1>
<br/>
<a href="">Hello Servlet</a>

<button class="button-for-insert">abcd</button>
</body>

<script type="text/javascript">
    $(function () {
        $(".button-for-insert").click(function () {
            let time=new Date();
            time.toLocaleDateString();
        })
    });
</script>
</html>