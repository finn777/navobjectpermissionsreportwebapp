package navobjectpermissionsreportwebapp.database;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet","/index.html"})
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String varTextA = "Github forever... (jsp) URL: " + Data.GetConnectionURL() + "<br>";
        request.setAttribute("textA", varTextA);

        Data data = new Data();
        String varTextB = "(jsp) Data: " + data.GetData() + "<br>";
        request.setAttribute("textB", varTextB);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);

    }

}

/*

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>navobjectpermissionsreportwebapp</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>navobjectpermissionsreportwebapp</h3>");
        out.println("<h4>Information</h4>");
        out.println("URL: " + Data.GetConnectionURL()+"<br>");
        Data data = new Data();
        out.println("Data: " + data.GetData()+"<br>");
        out.println("</body>");
        out.println("</html>");

        out.close();

*/


