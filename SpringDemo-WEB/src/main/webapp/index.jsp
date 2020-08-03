<%--
  Created by IntelliJ IDEA.
  User: chenjiahong11
  Date: 2020/7/13
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"type="text/javascript"></script>
    <script src="http://misc.360buyimg.com/??jdf/lib/jquery-1.6.4.js"type="text/javascript"></script>
    <%--<script src="/js/tan.js" type="text/javascript"></script>--%>
    <title>测试</title>
</head>
<body>
<h4>这是第一个主页面</h4>
<button id= "qq" name = "qq" type = "button">提交</button>
<input type= "text" id = "abc" name = "abc">123</input>
<div>
    <h4>返回结果：</h4>
    <span id="result"></span>
</div>
</div>
</body>
<script type="text/javascript">
    $().ready(function () {
        $('#qq').click(function () {
            var param={};
            param.type=$("#abc").val();
            alert(param.type);
            $.ajax({
                type: "POST",
                contentType: "application/x-www-form-urlencoded; charset=utf-8",
                url: "/alertSth",
                data:param,
                success: function (data) {
                    console.log(data);
                    $("#result").html(data);
                },
                error: function (e) {
                    console.log("error:" + e);
                    alert(e)
                }
            });
        });
    });
</script>
</html>