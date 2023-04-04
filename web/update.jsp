<%-- 
    Document   : update.jsp
    Created on : 29-03-2023, 07:42:01
    Author     : KhongDuyTuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update</title>
        <link rel="icon" type="image/png"
        href="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg" sizes="32x32">
    </head>
    <body>
        <form action="update" method="post">
            <table table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <td>ID</td>
                <td>
                    <input value="${st.id}" type="text" name="id" readonly>
                </td>
            </table>
            <table table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <td>Mốc thuế</td>
                <td>
                    <input value="${st.mocThue}" type="text" name="mocThue" >
                </td>
            </table>
            <table table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <td>Thuế suất</td>
                <td>
                    <input value="${st.thueSuat}" type="text" name="thueSuat" >
                </td>
            </table>
            <table table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <td>Ngày sửa đổi</td>
                <td>
                    <input value="${st.ngaySuaDoi}" type="text" name="ngaySuaDoi" >
                </td>
            </table>
                
            <table>
                <td></td>
                <td>
                    <button type="submit">Update</button>
                </td>
            </table>
            
            
        </form>
    </body>
</html>
