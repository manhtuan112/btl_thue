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
        <title>Update cấu hình thuế</title>
        <link rel="icon" type="image/png"
              href="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg" sizes="32x32">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">        
    </head>
    
    <body >
        <jsp:include page="Navbar.jsp"></jsp:include>
        <form action="update" method="post" >
            <table table class="table table-success table-striped" border="1" style="width: 100%;"  >
                <td>ID</td>
                <td>
                    <input value="${st.id}" type="text" name="id" readonly>
                </td>
            </table>
            <table table class="table table-success table-striped" border="1" style="width: 100%;">
                <td>Mốc thuế Dưới(Triệu đồng/tháng)</td>
                <td>
                    <input value="${st.mocDuoi}" type="text" name="mocDuoi" >
                </td>
            </table>
            <table table class="table table-success table-striped" border="1" style="width: 100%;;">
                <td>Mốc thuế Trên(Triệu đồng/tháng)</td>
                <td>
                    <input value="${st.mocTren}" type="text" name="mocTren" >
                </td>
            </table>
            <table table class="table table-success table-striped" border="1" style="width: 100%;;">
                <td>Thuế suất(%)</td>
                <td>
                    <input value="${st.thueSuat}" type="text" name="thueSuat" >
                </td>
            </table>
            <table table class="table table-success table-striped" border="1" style="width: 100%;;">
                <td>Ngày sửa đổi</td>
                <td>
                    <input value="${st.ngaySuaDoi}" type="text" name="ngaySuaDoi" >
                </td>
            </table>
            <table class="btn-group" role="group" aria-label="Basic example">
                <td></td>
                <td>
                    <button type="submit" class="btn btn-primary">Update</button>
                </td>
            </table>

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
    </body>
</html>
