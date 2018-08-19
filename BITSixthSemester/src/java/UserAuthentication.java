/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authentication")
public class UserAuthentication extends HttpServlet
{
    @Override
    public void init() throws ServletException
    {
        System.out.println("INIT Invoked");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("DO POst Invoked");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        
        PrintWriter pw=resp.getWriter();
        resp.setContentType("text/html");
        if(username.equalsIgnoreCase("admin")&password.equalsIgnoreCase("admin"))
        {
            pw.print("<h3>User Authenticated</h3>");
            pw.print("<a href='index.html'>Back</a>");
        }
        else
        {
            pw.print("<h3>Wrong Username or Password</h3>");
        }
    }
    @Override
    public void destroy()
    {
        System.out.println("Destroy Invoked");
    }
}
