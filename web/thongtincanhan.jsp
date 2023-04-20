<%-- 
    Document   : thongtincanhan
    Created on : Mar 17, 2023, 5:42:57 PM
    Author     : ADMIN
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
    <style>
        nav{
            position: fixed!important;
            top: 0;
            left: 0;
            right: 0;
        }
        
        
        .txt-center{
            text-align: center;
        }
        
/*        .img-avatar{
            width: 30%;
            height: auto;
        }*/
        
        .img-avatar >img{
            object-fit: cover;
            width: 100%;
            height: 100%;
        }
        
        .pr-6{
            padding-right: 9%!important;
        }
        
    </style>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include>
        
        <div class="container" style="margin-top: 90px">
            <h2 class="txt-center">Theo dõi thông tin cá nhân</h2>
            <div class="row d-flex justify-content-center align-items-start my-5">
                <div class="col-md-4 d-flex justify-content-center">
                    <div class="col-4 col-md-6 img-avatar">
                        <img src="${user.image}"
                        alt="Ảnh chân dung">
                    </div>
                    
                </div>
                <div class="col-md-4 d-flex justify-content-center">
                    <div class="info-container">
                        <p>Họ và tên: ${user.hoten}</p>
                        <p>Giới tính: ${user.gioitinh}</p>
                        <p>Ngày sinh: ${user.ngaysinh}</p>
                        <p>CCCD/CMT: ${user.cccd}</p>
                        <p>Địa chỉ: ${user.diachi}</p>
                        <p>Email: ${user.email}</p>
                        <p>Số điện thoại: ${user.sdt}</p>
                        
                        

                        



                    </div>
                </div>
                <div class="col-md-4 d-flex justify-content-center">
                    <div class="info-container">
                        <p>Nghề nghiệp: ${user.nghenghiep}</p>
                        <p>Mã số thuế: ${user.idThue}</p>
                        <p>Thu nhập: ${user.thunhap} VND</p>
                        <p>Thu nhập không chịu thuế: ${user.thunhapkhongchiuthue} VND</p>
                        <p>Các khoản giảm trừ: ${user.khoangiamtru} VND</p>
                        <p>Số thuế đang còn nợ: ${user.sothueconno} VND</p>


                    </div>
                </div>
            </div>
            <div class="row">
                <h5>Lịch sử đóng thuế</h5>
                <c:if test="${showHistory=='no'}">
                    <p class="text-center">Không có lịch sử đóng thuế</p>
                </c:if>
                <c:if test="${showHistory=='yes'}">
                  <table class="table align-middle mb-0 bg-white">
                    <thead class="bg-light">
                      <tr>
                        <th>Mã Lịch sử giao dịch</th>
                        <th>Ngày đóng thuế</th>
                        <th>Số tiền phải đóng</th>
                        <th>Số thuế đã đóng</th>
                        <th>Số thuế còn nợ</th>
                      </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="#{listH}" var="h">
                    


                        <tr>
                            <td>
                              <span class="fw-normal">${h.idLichsu}</span>
                            </td>
                            <td>
                              <p class="fw-normal mb-1">${h.ngaydongthue}</p>
                            </td>
                            <td class="text-end pr-6">
                              <span class="fw-normal">${h.sotienphaidong}</span>
                            </td>
                            <td class="text-end pr-6">
                                ${h.sotiendadong}
                            </td>
                            <td class="text-end pr-6">
                                ${h.sotienconno}
                            </td>
                         </tr>

                    </c:forEach>
                    </tbody>
                </table>  
                </c:if>  

                 

                
                
            </div>
            
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
            //huy session
            let logoutBtn = document.querySelector(".logout-btn")
            logoutBtn.addEventListener("click", (e) => {
                document.cookie = 'user' + '=;expires=Thu, 01 Jan 1970 00:00:01 GMT;';
            })
        </script>
    </body>
</html>
