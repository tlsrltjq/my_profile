import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        String mbti = request.getParameter("mbti");
        String foods = request.getParameter("foods");
        String[] foodsArr = foods.split(",");

        request.setAttribute("name", name);
        request.setAttribute("age", ageStr);
        request.setAttribute("mbti",mbti);
        request.setAttribute("foods", foodsArr);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }


    }

