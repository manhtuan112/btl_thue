<%-- 
    Document   : baocao
    Created on : Mar 19, 2023, 4:57:04 PM
    Author     : BENH VIEN CONG NGHE
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thuế thu nhập cá nhân</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="icon" type="image/png"
        href="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg" sizes="32x32">
    </head>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include>
        <h1>Báo cáo Thuế</h1>
        <form action="report" method="get">
                <table width="100%">
                    <%-- khung thời gian --%>
                    <tr>
                        <td>Thời gian</td>
                        <td>
                            <select id="month" name="month">
                                <c:forEach var = "i" begin = "1" end = "12">
                                    <option value="${i}">Tháng ${i}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td>
                            <select id="year" name="year">
                                <c:forEach var = "i" begin = "2010" end = "2023">
                                    <option value="${i}">Năm ${i}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <%-- Không gian --%>
                    <td >Tỉnh thành:</td>
                    <td>
                        <input type="text" name="tinh"  >
                    </td>
                    <td></td>
                    
                    <%-- Nút hiện thị--%>
                    <tr>
                        <td><input type="submit" value="Xuất báo cáo"></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
                    <span>${requestScope.NotifyProviceEmpty}</span>
        </form>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
        <script>
            let logoutBtn = document.querySelector(".logout-btn")
            logoutBtn.addEventListener("click", (e) => {
                document.cookie = 'user' + '=;expires=Thu, 01 Jan 1970 00:00:01 GMT;';
            })
            

        </script>
    </body>
</html>
