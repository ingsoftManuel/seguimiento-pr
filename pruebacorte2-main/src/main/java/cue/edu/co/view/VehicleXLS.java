package cue.edu.co.view;

import cue.edu.co.Service.VehicleServiceImpl;
import cue.edu.co.mapping.dtos.VehiclesDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet({"/vehicles.xls", "/vehicles.html", "/vehicles"})
public class VehicleXLS extends HttpServlet {

    private static VehicleServiceImpl service;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        List<VehiclesDto> vehiclesDtos = null;
        try {
            vehiclesDtos = service.listVehicles();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        resp.setContentType("text/html;charset=UTF-8");
        String servletPath = req.getServletPath();
        boolean esXls = servletPath.endsWith(".xls");
        if (esXls) {
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition", "attachment;filename=students.xls");
        }
        try (PrintWriter out = resp.getWriter()) {
            if(!esXls) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Listado de Estudiantes</title>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Listado de Vehiculos!</h1>");
                out.println("<p><a href=\"" + req.getContextPath() + "/vehicles.xls" + "\">exportar a xls</a></p>");

            }
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>id</th>");
            out.println("<th>nombre</th>");
            out.println("<th>tipo</th>");
            out.println("<th>precio</th>");
            out.println("</tr>");
            vehiclesDtos.forEach(p ->{
                out.println("<tr>");
                out.println("<td>" + p.id() + "</td>");
                out.println("<td>" + p.name() + "</td>");
                out.println("<td>" + p.type() + "</td>");
                out.println("<td>" + p.available() + "</td>");
                out.println("</tr>");
            });
            out.println("</table>");
            if(!esXls) {
                out.println(" </body>");
                out.println("</html>");
            }
        }
    }
}
