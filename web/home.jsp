<%-- 
    Document   : home
    Created on : Mar 14, 2023, 10:39:36 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thuế thu nhập cá nhân</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    
    <style>
        .container-custom{
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            position: fixed;
            width: 70%;
            min-width: 450px;
        }
        .container-custom > div{
            width: 100%;
        }
        .container-custom a{
            width: 100%;
        }
    </style>
    <body>
        
        
        <!-- Navbar -->
        <jsp:include page="Navbar.jsp"></jsp:include>
        
        
        <div class="container-custom">
            <div>
                <a href="theodoidanhsach" class="btn btn-info btn-lg mb-4" role="button" aria-pressed="true">Theo dõi danh sách</a>
            </div>
            
            <div>
                <a href="report.jsp" class="btn btn-info btn-lg mb-4" role="button" aria-pressed="true">Xuất báo cáo</a>
            </div>
            <div>
                <a href="setting" class="btn btn-info btn-lg mb-4" role="button" aria-pressed="true">Cấu hình</a>
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
            let logoutBtn = document.querySelector(".logout-btn")
            logoutBtn.addEventListener("click", (e) => {
                document.cookie = 'user' + '=;expires=Thu, 01 Jan 1970 00:00:01 GMT;';
            })
            

        </script>
    </body>
    
</html>
