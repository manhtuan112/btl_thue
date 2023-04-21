<%-- 
    Document   : setting
    Created on : 19-03-2023, 10:11:03
    Author     : KhongDuyTuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Các cấu hình thuế thu nhập cá nhân</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="icon" type="image/png"
        href="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg" sizes="32x32">
    </head>
    
    <style>
        .txt-center{
            text-align: center;
        }
        
        .pr-6{
            padding-right: 4%!important;
        }
    </style>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include> 
            <section class="intro">
                <div class="bg-image h-100">
                    <div class="mask d-flex align-items-center h-100" style="background-color: rgba(127, 244, 51, 0.2);">
                            <table class="table table-success table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">ID</th>
                                        <th scope="col">Mốc thuế dưới<br>(Triệu đồng/tháng)</th>
                                        <th scope="col">Mốc thuế trên<br>(Triệu đồng/tháng)</th>
                                        <th scope="col">Thuế suất<br>(%)</th>
                                        <th scope="col">Ngày sửa đổi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${Lists}" var="x">
                                    <tr>
                                        <th scope="row">${x.id}</th>
                                        <td>${x.mocDuoi}</td>
                                        <td>${x.mocTren}</td>
                                        <td>${x.thueSuat}</td>
                                        <td>${x.ngaySuaDoi}</td>
                                        <td>
                                            <a href="update?sid=${x.id}">update</a>
                                        </td>
                                    </tr>
                                </c:forEach>


                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
                integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
                integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    </body>
</html>
