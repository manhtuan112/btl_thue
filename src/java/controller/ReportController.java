/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.History;
import model.User;

/**
 *
 * @author BENH VIEN CONG NGHE
 */

@WebServlet(name="ReportController", urlPatterns={"/report"})
public class ReportController extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    } 

    public long xuly(String a){
            String tmp=a.replace(".", "");
            long x=Long.parseLong(tmp);
        return x;
    }
//    public String chuanhoa(String a){
//        
//        return tinh
//    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8"); 
//            Cookie cookies[] = request.getCookies();
//        boolean accecptLogin = false;
//        int indexLogin = 0;
//        for(int i=0; i<cookies.length;i++){
//            if(cookies[i].getName().equals("user")) {
//                accecptLogin=true;
//                indexLogin = i;
//                break;
//            }
//        }
//        if(accecptLogin){
//            request.setAttribute("username", cookies[indexLogin].getValue());
//            request.getRequestDispatcher("/result_repport.jsp").forward(request, response);
//        }
//        else{
//            response.sendRedirect("index.jsp");
//        }
        
            DAO dao=new DAO();
            int thang=Integer.parseInt(request.getParameter("month"));
            int nam=Integer.parseInt(request.getParameter("year"));
            String tinh=request.getParameter("tinh");
            
            String NotifyProviceEmpty="Xin mời bạn nhập tên tỉnh(thành phố) ";
            String NotifyProviceFail="Tỉnh bạn chọn k tồn tại";
            String url="";
            if(tinh==null||tinh==""){
                request.setAttribute("NotifyProviceEmpty", NotifyProviceEmpty);
                url="/report.jsp";
            }
            else{
                List <History> list= dao.getHistorybyAddressDate(tinh, thang, nam);
                String thue=list.get(0).getSotiendadong();
                long DongThueNhieuNhat=0;
                long DongThueItNhat=xuly(thue);
                long NoThueNhieuNhat=0;
                String IDDTNN="";
                String IDDTIN="";
                String IDNTNN="";
                int SoNguoiDongThue=0;
                long TongThueThuDuoc=0;
                long TongThueNo=0;
                long TrungBinhThue=0;
            
           
                List <String> uniqueH=new ArrayList<>();
                for(History i:list){
                    long Dong=xuly(i.getSotiendadong());
                    long No=xuly(i.getSotienconno());
                
                    if(Dong>DongThueNhieuNhat) {
                        DongThueNhieuNhat=Dong;
                        IDDTNN=i.getIdthue();
                    }
                    if(Dong<=DongThueItNhat) {
                        DongThueItNhat=Dong;
                        IDDTIN=i.getIdthue();
                    }
                    if(No>NoThueNhieuNhat){
                        NoThueNhieuNhat=No;
                        IDNTNN=i.getIdthue();
                    }
                    if(!uniqueH.contains(i.getIdthue())){
                        uniqueH.add(i.getIdthue());
                        SoNguoiDongThue+=1;
                    }
                
                    TongThueThuDuoc+=Dong;
                    TongThueNo+=No;
                }
                try{
                    TrungBinhThue=TongThueThuDuoc/SoNguoiDongThue;
                }catch(ArithmeticException e){
                    System.out.println("Khong có ai đóng thuế cả");
                }
            
            
            
            //tim nguoi dung theo idthue
                User ntnn=dao.getUserByIdThue(IDNTNN);
                String nameNTNN=ntnn.getHoten();
           
                User dtnn=dao.getUserByIdThue(IDDTNN );
                String nameDTNN=dtnn.getHoten();
       
                User dtin=dao.getUserByIdThue(IDDTIN);
                String nameDTIN=dtin.getHoten();
           
           
                request.setAttribute("DongThueNhieuNhat", DongThueNhieuNhat);
                request.setAttribute("nameDTNN", nameDTNN);
                request.setAttribute("DongThueItNhat", DongThueItNhat);
                request.setAttribute("nameDTIN", nameDTIN);
                request.setAttribute("NoThueNhieuNhat", NoThueNhieuNhat);
                request.setAttribute("nameNTNN", nameNTNN);
                request.setAttribute("TrungBinhThue", TrungBinhThue);
                request.setAttribute("TongThueThuDuoc", TongThueThuDuoc);
                request.setAttribute("TongThueNo", TongThueNo);
                request.setAttribute("SoNguoiDongThue", SoNguoiDongThue);
                request.setAttribute("tinh", tinh);
                request.setAttribute("thang", thang);
                request.setAttribute("nam", nam);
           
           
                url="/result_report.jsp";
            }
            
//            List <History> list= dao.getHistorybyAddressDate(tinh, thang, nam);
//            
//            String thue=list.get(0).getSotiendadong();
//            long DongThueNhieuNhat=0;
//            long DongThueItNhat=xuly(thue);
//            long NoThueNhieuNhat=0;
//            String IDDTNN="";
//            String IDDTIN="";
//            String IDNTNN="";
//            int SoNguoiDongThue=0;
//            long TongThueThuDuoc=0;
//            long TongThueNo=0;
//            long TrungBinhThue=0;
//            
//           
//            List <String> uniqueH=new ArrayList<>();
//            for(History i:list){
//                long Dong=xuly(i.getSotiendadong());
//                long No=xuly(i.getSotienconno());
//                
//                if(Dong>DongThueNhieuNhat) {
//                    DongThueNhieuNhat=Dong;
//                    IDDTNN=i.getIdthue();
//                }
//                if(Dong<=DongThueItNhat) {
//                    DongThueItNhat=Dong;
//                    IDDTIN=i.getIdthue();
//                }
//                if(No>NoThueNhieuNhat){
//                    NoThueNhieuNhat=No;
//                    IDNTNN=i.getIdthue();
//                }
//                if(!uniqueH.contains(i.getIdthue())){
//                    uniqueH.add(i.getIdthue());
//                    SoNguoiDongThue+=1;
//                }
//                
//                TongThueThuDuoc+=Dong;
//                TongThueNo+=No;
//            }
//            try{
//                TrungBinhThue=TongThueThuDuoc/SoNguoiDongThue;
//            }catch(ArithmeticException e){
//                System.out.println("Khong có ai đóng thuế cả");
//            }
//            
//            
//            
//            //tim nguoi dung theo idthue
//           User ntnn=dao.getUserByIdThue(IDNTNN);
//           String nameNTNN=ntnn.getHoten();
//           
//           User dtnn=dao.getUserByIdThue(IDDTNN );
//           String nameDTNN=dtnn.getHoten();
//       
//           User dtin=dao.getUserByIdThue(IDDTIN);
//           String nameDTIN=dtin.getHoten();
//           
//           
//           request.setAttribute("DongThueNhieuNhat", DongThueNhieuNhat);
//           request.setAttribute("nameDTNN", nameDTNN);
//           request.setAttribute("DongThueItNhat", DongThueItNhat);
//           request.setAttribute("nameDTIN", nameDTIN);
//           request.setAttribute("NoThueNhieuNhat", NoThueNhieuNhat);
//           request.setAttribute("nameNTNN", nameNTNN);
//           request.setAttribute("TrungBinhThue", TrungBinhThue);
//           request.setAttribute("TongThueThuDuoc", TongThueThuDuoc);
//           request.setAttribute("TongThueNo", TongThueNo);
//           request.setAttribute("SoNguoiDongThue", SoNguoiDongThue);
//           request.setAttribute("tinh", tinh);
//           request.setAttribute("thang", thang);
//           request.setAttribute("nam", nam);
//           
//           
//            String url="/result_report.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
