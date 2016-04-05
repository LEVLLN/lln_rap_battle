package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("mainpage.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     //   resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String n=req.getParameter("username");
        String p=req.getParameter("userpass");
        System.out.println(n+" "+p);
        out.println("<html><body>");
        out.println("<h1>"+n+"</h1>");
        out.println("</script>");
        out.println("</body></html>");
        resp.sendRedirect("secondpage.jsp");
        out.write(n);
    }
}
 
