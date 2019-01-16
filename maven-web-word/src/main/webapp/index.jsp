<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>电信word</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
<style type="text/css">
* {
    font-family: "微软雅黑";
}

.textField {
    border: none;
    /* border-bottom: 1px solid gray; */
    text-align: center;
}

#file {
    border: 1px solid black;
    width: 80%;
    margin: 0 auto;
}

h1 input {
    font-size: 72px;
}

td textarea {
    font-size: 14px;
}

.key {
    width: 125px;
    font-size: 20px;
}
.photo{
    border: 1px solid black;
    width: 80%;
    margin: 0 auto;
}
</style>
</head>

  <body>
    <form action='<c:url value="/freemarker/downResumeDoc"/>' method="post">  
    <div id="file" align="center">
        <h1><input type="text" class="textField" value="word模板导出"/></h1>  
        <hr/>  
        <table  style="border-collapse:separate; border-spacing:0px 10px;" id="searchTable" border="1">  
            <tr>  
                <td class="key">网&nbsp;&nbsp;站：</td>  
                <td><input type="text" name="webSite" class="textField"/></td>  
                <td class="key">时&nbsp;&nbsp;间：</td>
                <td><input type="text" name="createDate1" class="textField"/></td>
                                         
            </tr>  
           
        </table>  
    </div>  
    <div align="center" style="margin-top:15px;">  
        <input type="submit" value="保存Word文档" />  
    </div>  
    </form>  
  </body>
</html>