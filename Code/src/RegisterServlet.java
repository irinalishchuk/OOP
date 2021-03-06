import user.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(request.getParameter("username"),
                request.getParameter("password"),
                request.getParameter("firstname"),
                request.getParameter("secondname"));

        //user = UserDAO.register(user);

        HttpSession session = request.getSession(true);
        session.setAttribute("currentSessionUser", user);
        response.sendRedirect("loggedIn.jsp");

    }

}
