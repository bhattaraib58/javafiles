
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
@WebServlet("/addition")
public class addition extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        int firstnumber=Integer.parseInt(req.getParameter("firstnumber"));
        int secondnumber=Integer.parseInt(req.getParameter("secondnumber"));
        
        req.setAttribute("firstnumber", firstnumber);
        req.setAttribute("secondnumber", secondnumber);
        req.setAttribute("result", firstnumber+secondnumber);
        
        req.getRequestDispatcher("addition.jsp").forward(req, resp);
       
    }
}
