<%-- 
    Document   : Navbar
    Created on : Mar 16, 2023, 10:29:14 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <!-- Container wrapper -->
          <div class="container">
            <!-- Navbar brand -->
            <a class="navbar-brand me-2" href="#">
              <img
                src="https://inkythuatso.com/uploads/thumbnails/800/2021/12/logo-thue-nha-nuoc-vector-inkythuatso-01-07-16-32-44.jpg"
                height="50"
                alt="Logo"
                loading="lazy"
                style="margin-top: -1px;"
              />
            </a>



            <!-- Collapsible wrapper -->
            <div class="collapse navbar-collapse" id="navbarButtonsExample">
              <!-- Left links -->
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <a class="nav-link h3" href="home">Hệ thống hỗ trợ tính thuế thu nhập cá nhân</a>
                </li>
              </ul>
              <!-- Left links -->

              <div class="d-flex align-items-center">
                <button type="button" class="btn px-3 me-2">
                  Xin chào, ${username}
                </button>
                <a href="login" class="logout-btn btn btn-primary me-3" role="button" aria-pressed="true">Logout</a>
                

                
              </div>
            </div>
            <!-- Collapsible wrapper -->
          </div>
          <!-- Container wrapper -->
        </nav>