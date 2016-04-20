package navobjectpermissionsreportwebapp.database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet","/index.html"})
public class Servlet extends HttpServlet {
    private String varTextURL;
    private String varRowsCount;
    private Data data;
    private Filter filter;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        if (request.getParameter("Clear") == null) {

            filter.setFilterobjecttype(request.getParameter("filterobjecttype"));
            try {
                filter.setFilterobjectid(Integer.parseInt(request.getParameter("filterobjectid")));
            } catch (NumberFormatException e) {
                filter.setFilterobjectid(-1);
            }

            request.getSession().setAttribute("filter", filter);

            ArrayList<Row> rows = data.getRows(filter.getFilterobjecttype(), filter.getFilterobjectid());
            request.getSession().setAttribute("rows", rows);

        } else {

            filter = new Filter();
            data = new Data();

            request.getSession().setAttribute("filter", null);
            request.getSession().setAttribute("rows", null);

        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        filter = new Filter();
        data = new Data();

        varTextURL = "URL: " + Data.getConnectionURL() + "<br>";
        request.getSession().setAttribute("textURL", varTextURL);

        varRowsCount = "Rows count: " + data.getRowsCount() + "<br>";
        request.getSession().setAttribute("textRowsCount", varRowsCount);

        ArrayList<String> types = data.getTypes();
        request.getSession().setAttribute("types", types);

        request.getSession().setAttribute("filter", null);
        request.getSession().setAttribute("rows", null);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

}



