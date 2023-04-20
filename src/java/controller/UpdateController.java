/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import context.DBContext;
import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SettingInform;

/**
 *
 * @author KhongDuyTuan
 */
@WebServlet(name = "UpdateController", urlPatterns = {"/update"})
public class UpdateController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("sid");
        DAO dao = new DAO();
        SettingInform s = dao.getSettingInforById(id);
        request.setAttribute("st", s);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("id", id);
        String mocDuoi = request.getParameter("mocDuoi");
//        request.setAttribute("mocDuoi", mocDuoi);
        String mocTren = request.getParameter("mocTren");
//        request.setAttribute("mocTren", mocTren);
        float thueSuat = Float.parseFloat(request.getParameter("thueSuat"));
//        request.setAttribute("thueSuat", thueSuat);
        String ngaySuaDoi = request.getParameter("ngaySuaDoi");
//        request.setAttribute("ngaySuaDoi", ngaySuaDoi);
        DAO dao = new DAO();
        Connection conn = DBContext.getConnection();
        dao.updateSettingInform(id, mocDuoi, mocTren, thueSuat, ngaySuaDoi, conn);
//        response.sendRedirect("setting");
        request.getRequestDispatcher("setting").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
