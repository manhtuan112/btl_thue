<%-- 
    Document   : result_report
    Created on : Mar 23, 2023, 1:44:10 PM
    Author     : BENH VIEN CONG NGHE
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .content {
                max-width:600px;
                margin: auto;
            }
        </style>
        <link rel="stylesheet" href="css/report.css" >
        <title>Chi Tiết Báo Cáo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include>
        <h1> Danh sách báo cáo số liệu về thuế của  Tỉnh (Thành Phố)  ${requestScope.tinh    }    Tháng ${requestScope.thang    }    Năm ${requestScope.nam}   </h2>
        <div class="content">
            <h2>Báo cáo thống kê đối tượng tham gia</h1>
            <table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <thead>
                    <tr>
                        <th>Đối tượng</th>
                        <th>Số liệu</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Người tham gia đóng thuế </td>
                        <td>${requestScope.SoNguoiDongThue}</td>
                    </tr>
                </tbody>
            </table>
                   
            <h2>Báo cáo thống kê kế toán</h1>
            <table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                
                <thead>
                    <tr>
                        <th>Khoản tiền</th>
                        <th>Số liệu</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Tổng thu trong tháng </td>
                        <td>${requestScope.TongThueThuDuoc}</td>
                    </tr>
                    <tr>
                        <td>Chưa thu được trong tháng</td>
                        <td>${requestScope.TongThueNo}</td>
                    </tr>
                    <tr>
                        <td>Trung Bình Thuế </td>
                        <td>${requestScope.TrungBinhThue}</td>
                    </tr>
                </tbody>
            </table>
            </table>
            <h2>Báo cáo thống kê Cá Nhân</h1>
            <table class="table table-bordered table-hover" border="1" cellpadding="5" style="width: 100%;">
                <thead>
                    <tr>
                        <th>Mô tả</th>
                        <th>Tên</th>
                        <th>Số Tiền</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Cá Nhân đóng Thuế nhiều nhất </td>
                        <td>${requestScope.nameDTNN}</td>
                        <td>${requestScope.DongThueNhieuNhat}</td>
                    </tr>
                    <tr>
                        <td>Cá Nhân đóng Thuế ít nhất</td>
                        <td>${requestScope.nameDTIN}</td>
                        <td>${requestScope.DongThueItNhat}</td>
                    </tr>
                    <tr>
                        <td>Cá nhân nợ nhiều Thuế nhất</td>
                        <td>${requestScope.nameNTNN}</td>
                        <td>${requestScope.NoThueNhieuNhat}</td>
                    </tr>
                </tbody>
            </table>
        </div>
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
