package controller;

import entity.Role;
import entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/SignUp"}
)
/*
  A servlet to add a new user.

  @author LeeAnn Jakel
 */
public class SignUp extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);

        User user = new User();
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setUserName(req.getParameter("userName"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));

        User newUser = new User(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassword(), user.getEmail());
        logger.debug("Added user: {}", newUser);

        Role role = new Role(newUser, "basic_user", newUser.getUserName());
        newUser.addRole(role);

        int id = userDao.insert(newUser);

        req.setAttribute("newUser", userDao.getByPropertyEqualsId("id", id));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpSuccess.jsp");
        dispatcher.forward(req, resp);
    }

}
