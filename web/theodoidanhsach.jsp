<%-- 
    Document   : list
    Created on : Mar 16, 2023, 10:33:26 PM
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
        
        .container1{
            margin: 90px auto 10px;
            width: 80%;
        }
        .txt-center{
            text-align: center;
        }
        
        .pr-6{
            padding-right: 4%!important;
        }
        
    </style>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include>
        
        <div class="container1">
            <h2 class="txt-center">Theo dõi danh sách</h2>
            
            <div class="filter-wrapper">
                <h4>Bộ lọc</h4>
                <form class="form-filter" action="theodoidanhsach" method="post">
                    <select name="filter-roll" class="form-select mb-3 form-toogle" aria-label=".form-select-lg example">
                        <option selected value="0">Chọn bộ lọc</option>
                        <option value="1">Lọc theo Địa chỉ</option>
                        <option value="2">Lọc theo Họ và tên</option>
                        <option value="3">Lọc theo Mã số thuế</option>
                     </select>
                    
                    
                    <select name="ls_province" class="form-select mb-3 address-input__tinh" aria-label=".form-select-lg example"></select>
                    <select name="ls_district" class="form-select mb-3 address-input__huyen" aria-label=".form-select-lg example"></select>
                    <select name="ls_ward" class="form-select mb-3 address-input__xa" aria-label=".form-select-lg example"></select>
                    
                    
                    <div class="input-group mb-3 name_id-input">
                        <div class="input-group-prepend">
                          <span class="input-group-text" id="inputGroup-sizing-lg">Giá trị</span>
                        </div>
                        <input name="value" type="text" class="form-control name_id-input__value" aria-label="Large" aria-describedby="inputGroup-sizing-sm">
                     </div>
                    
                    <div class="input-group mb-3 status-input">
                        <div class="input-group-prepend">
                          <span class="input-group-text">Tình trạng đóng thuế</span>
                        </div>
                        <select name="status-value" class="form-select mb-3 form-toogle" aria-label=".form-select-lg example">
                            <option selected value="0">Tất cả</option>
                            <option value="1">Còn nợ thuế</option>
                            <option value="2">Đã nộp đủ</option>
                        </select>
                     </div>
                    
                    <div class="d-flex justify-content-center mb-3">
                            <button type="submit" class="btn btn-success btn-block">Tìm kiếm</button>
                        </div>
                </form>
                
                
            </div>
            
            <c:if test="${valueShow=='not_show'}">
                <p class="txt-center">Chưa có thông tin lọc</p>
            </c:if>
                
            <c:if test="${valueShow=='not_find'}">
                <p class="txt-center">Không tìm thấy thông tin người dùng</p>
            </c:if>
            
            <c:if test="${valueShow=='show'}">
                <table class="table align-middle mb-0 bg-white">
                    <thead class="bg-light">
                      <tr>
                        <th>Họ và tên</th>
                        <th>Giới tính</th>
                        <th>Thông tin</th>
                        <th>Tình trạng</th>
                        <th>Mã số thuế</th>
                        <th>Hành động</th>
                      </tr>
                    </thead>
                    <tbody>

                        <c:forEach items="${listU}" var="u">
                            <tr>
                            <td>
                              <div class="d-flex align-items-center">
                                <img
                                    src="${u.image}"
                                    alt=""
                                    style="width: 45px; height: 45px"
                                    class="rounded-circle"
                                    />
                                <div class="ms-3">
                                  <p class="fw-bold mb-1">${u.hoten}</p>
                                  <p class="text-muted mb-0">${u.email}</p>
                                </div>
                              </div>
                            </td>
                            <td>${u.gioitinh}</td>
                            <td>
                              <p class="fw-normal mb-1">${u.ngaysinh}</p>
                              <p class="text-muted mb-0">${u.nghenghiep}</p>
                            </td>
                            <td>
                                <c:if test="${u.sothueconno=='0'}">
                                    <span class="badge rounded-pill bg-success">Đã nộp đủ</span>
                                </c:if>
                                    
                                <c:if test="${u.sothueconno!='0'}">
                                    <span class="badge rounded-pill bg-warning text-dark">Còn nợ thuế</span>
                                </c:if>
                              
                              
                            </td>
                            <td class="text-end pr-6">${u.idThue}</td>
                            <td>
                              <a href="thongtincanhan?idThue=${u.idThue}" class="btn btn-link btn-sm btn-rounded" role="button" aria-pressed="true">Xem chi tiết</a>
                            </td>
                          </tr>
                        </c:forEach>






                    </tbody>
                </table>
            </c:if>
            
            
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
       <script src="./js/selectoraddress.js"></script>
       <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
       
       <script>
           
           //huy session
            let logoutBtn = document.querySelector(".logout-btn")
            logoutBtn.addEventListener("click", (e) => {
                document.cookie = 'user' + '=;expires=Thu, 01 Jan 1970 00:00:01 GMT;';
            })
            
            // them dia chi cho o address-input
            
            var localpicker = new LocalPicker({
                province: "ls_province",
                district: "ls_district",
                ward: "ls_ward"
            });
            var options = {
                /*
                HTML Selector. You can pass value of name, id or class. 
                It will automatically detect exist elements for you.
                Example: 'myIdOrClass','#myId', '.myClass', 'myName'
                */
                province: 'ls_province',
                district: 'ls_district',
                ward: 'ls_ward',

                /*
                Define value for option tag. Valid option: id|name           
                */
                getValueBy: 'id',

                //Placeholder text
                provinceText: 'Chọn tỉnh / thành phố',
                districtText: 'Chọn quận / huyện',
                districtNoText: 'Địa phương này không có quận / huyện',
                wardText: 'Chọn phường / xã',
                wardNoText: 'Địa phương này không có phường / xã',

                // Default value if no location exist
                emptyValue: " ",

                // Hide option where no local exist
                hideEmptyValueOption: true,

                // Hide place-holder option (first option)
                hidePlaceHolderOption: true,

                /*
                Include local level on option text as prefix
                Example: true = Quận Bình Thạnh | false = Bình Thạnh
                */
                provincePrefix: false,
                districtPrefix: true,
                wardPrefix: true,

                /*
                Include local level in option tag's attribute
                */
                levelAsAttribute: true,
                levelAttributeName: "data-level",
            };
            
            // an hien o name_id input
            
            let formToogle = document.querySelector(".form-toogle");
            let formTinh = document.querySelector(".address-input__tinh");
            let formHuyen = document.querySelector(".address-input__huyen");
            let formXa = document.querySelector(".address-input__xa");
            let formTen_id = document.querySelector(".name_id-input");
            let formStatus = document.querySelector(".status-input")
            
            
            let formFilter = document.querySelector(".form-filter");
            
            let valueTinh, valueHuyen, valueXa;
            formTinh.addEventListener("change", (e) => {
              valueTinh = e.target.value;  
            })
            formHuyen.addEventListener("change", (e) => {
              valueHuyen = e.target.value;  
            })
            formXa.addEventListener("change", (e) => {
              valueXa = e.target.value;  
            })
            
            
            
            //ngăn chán 1 số ngoại lệ trống trong các ô input
            formFilter.addEventListener("submit", (e) => { //không chọn ô lọc
                if(formToogle.value==0) {
                    e.preventDefault();
                    Swal.fire({
                        icon: 'warning',
                        title: 'Bạn thao tác sai rồi...!',
                        text: 'Vui lòng chọn bộ lọc để xem kết quả!!!'
                    })                    
                } else if(formToogle.value==2 || formToogle.value==3){ // để trống không nhập tên hoặc id thuế
                    if(document.querySelector(".name_id-input__value").value.trim()===''){
                        e.preventDefault();
                        Swal.fire({
                            icon: 'warning',
                            title: 'Bạn thao tác sai rồi...!',
                            text: 'Không được để trống giá trị lọc!!!'
                        })  
                    }
                    
                } else { //để trống không chọn tỉnh huyện xa
                    if(typeof valueTinh==='undefined' && typeof valueHuyen==='undefined' && typeof valueXa==='undefined'){
                        e.preventDefault();
                        Swal.fire({
                            icon: 'warning',
                            title: 'Bạn thao tác sai rồi...!',
                            text: 'Không được để trống giá trị lọc!!!'
                        })  
                    }
                    
                    
                    
                }

            })
            
            
            
            
            
            if(formToogle.value==0) {
                    formTinh.style.display = "none";
                    formHuyen.style.display = "none";
                    formXa.style.display = "none";
                    formTen_id.style.display = "none";
                    formStatus.style.display = "none";
            }
            
            formToogle.addEventListener("change", (e) => {
                let value = e.target.value;
                if(value==1) {
                    formTinh.style.display = "block";
                    formHuyen.style.display = "block";
                    formXa.style.display = "block";                  
                    formTen_id.style.display = "none";
                    formStatus.style.display = "flex";
                    formTen_id.attributes.required = '';
                } else if(value==2||value==3){
                    formTen_id.style.display = "flex"; 
                    formStatus.style.display = "flex";
                    formTinh.style.display = "none";
                    formHuyen.style.display = "none";
                    formXa.style.display = "none";

                } else{
                    formTinh.style.display = "none";
                    formHuyen.style.display = "none";
                    formXa.style.display = "none";
                    formTen_id.style.display = "none";
                    
                }
            })
            
            
            
            
        </script>
    </body>
</html>
