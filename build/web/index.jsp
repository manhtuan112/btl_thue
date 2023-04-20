<%-- 
    Document   : index
    Created on : Mar 14, 2023, 5:36:01 PM
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
    <link rel="icon" type="image/png"
        href="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg" sizes="32x32">
</head>
<style>
    .divider:after,
    .divider:before {
        content: "";
        flex: 1;
        height: 1px;
        background: #eee;
    }

    .signup-form {
        display: none;
    }
</style>

<body>
    <section class="vh-100">
        <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
        <input type="hidden" id="toggle" value="<%=request.getAttribute("toggle")%>"> 
        
        <div class="container py-5 h-100">
            <div class="row d-flex align-items-center justify-content-center h-100">
                <div class="col-md-8 col-lg-7 col-xl-6">
                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                        class="img-fluid" alt="Phone image">
                </div>
                <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                    <form class="login-form" action="login" method="post" >
                        <h1 class="d-flex justify-content-center">Đăng nhập</h1>
                        <!-- Email input -->
                        <div class="form-outline mb-4">
                            <label class="form-label" for="form1Example13">Tên người dùng</label>
                            <input type="text" id="form1Example13" class="form-control form-control-lg" name="user" value="" required />

                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
                            <label class="form-label" for="form1Example23">Mật khẩu</label>
                            <input type="password" id="form1Example23" class="form-control form-control-lg" value="" name="pass" required />

                        </div>

                        <div class="d-flex justify-content-center align-items-center mb-4">
                            <!-- Checkbox -->
                            <div class="form-check me-4">
                                Bạn chưa có tài khoản?
                            </div>
                            <a href="#" class="go-signup">Đăng kí</a>
                        </div>

                        <!-- Submit button -->
                        <div class="d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Đăng nhập</button>
                        </div>



                    </form>


                    <!--Form resigter-->
                    <form name="signup-form" class="signup-form" action="signup" method="post" onsubmit="return validateForm()">
                        <h1 class="d-flex justify-content-center">Đăng kí</h1>
                        <!-- Email input -->
                        <div class="form-outline mb-4">
                            <label class="form-label" for="form1Example13">Tên người dùng (*)</label>
                            <input type="text" id="form1Example13" class="form-control form-control-lg" name="user" required checked/>

                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
                            <label class="form-label" for="form1Example23">Mật khẩu (*)</label>
                            <input type="password" id="form1Example23" class="form-control form-control-lg pass" name="pass" required />
                            <p class="mess_validate" style="color: red"></p>
                        </div>
                        <div class="form-outline mb-4">
                            
                            <label class="form-label" for="form1Example23">Nhập lại mật khẩu (*)</label>
                            <input type="password" id="form1Example23" class="form-control form-control-lg" name="repass" required />
                            <p class="mess" style="color: red">${mess}</p>
                        </div>

                        <div class="d-flex justify-content-around align-items-center mb-4">
                            <!-- Checkbox -->

                            <a href="#" class="back-login">Đăng nhập</a>
                        </div>

                        <!-- Submit button -->
                        <div class="d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Đăng kí</button>
                        </div>



                    </form>
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
        
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script>
        let loginBtn = document.querySelector(".go-signup");
        let signupBtn = document.querySelector(".back-login");
        let loginForm = document.querySelector("form.login-form");
        let signupForm = document.querySelector("form.signup-form");
        
        let toggle = document.getElementById("toggle").value;
        if(toggle==="signup-form"){
            signupForm.style.display = 'block'
            loginForm.style.display = 'none'
        } 
        
        let status = document.getElementById("status").value;
        if(status==="Login Failed"){
            Swal.fire({
                icon: 'error',
                title: 'Đăng nhập thất bại...',
                text: 'Sai tên người dùng hoặc mật khẩu!!!'
            })
        } else if(status=="Signup Failed"){
            Swal.fire({
                icon: 'error',
                title: 'Đăng nhập thất bại...',
                text: 'Người dùng đã tồn tại!!!'
            })
        }
        


        loginBtn.addEventListener("click", (e) => {
            e.preventDefault()
            signupForm.style.display = 'block'
            loginForm.style.display = 'none'

        })
        signupBtn.addEventListener("click", (e) => {
            e.preventDefault()
            console.log("oke")
            signupForm.style.display = 'none'
            loginForm.style.display = 'block'
            document.querySelector(".mess").innerHTML="";

        })
        
        
        //Validate form
        const validateForm = () =>{
            let pass = document.querySelector(".signup-form .pass").value;
            if (pass.length < 6 || !(/[a-z]+/.test(pass) && /[0-9]+/.test(pass) && !(/\s+/.test(pass)) && /[A-Z]+/.test(pass) && /\W+/.test(pass))) {
        
            document.querySelector(".mess_validate").innerHTML = "Mật khẩu phải dài ít nhất 6 ký tự và chứa đầy đủ chữ hoa, chữ thường, số và ký tự đặc biệt"
            document.querySelector(".mess").innerHTML=""
            return false

            }
        }

    </script>
</body>

</html>