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
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include> 
            <section class="intro">
                <div class="bg-image h-100" style="background-image: url('https://mdbootstrap.com/img/Photos/new-templates/tables/img2.jpg');">
                    <div class="mask d-flex align-items-center h-100" style="background-color: rgba(0,0,0,.25);">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-12">
                                    <div class="card bg-dark shadow-2-strong">
                                        <div class="card-body">
                                            <div class="table-responsive">
                                                <table class="table table-dark table-borderless mb-0">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">ID</th>
                                                            <th scope="col">Thue suat theo thang</th>
                                                            <th scope="col">Moc thue</th>
                                                            <th scope="col">Ngay sua doi</th>
                                                            <!--                        <th scope="col">ADDRESS</th>
                                                                                    <th scope="col">SALARY</th>-->
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${Lists}" var="x">
                                                        <tr>
                                                            <th scope="row">${x.id}</th>
                                                            <td>${x.thueSuat}</td>
                                                            <td>${x.mocThue}</td>
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
                            </div>
                        </div>
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
