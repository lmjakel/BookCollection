package com.leeannjakel.controller;

import com.leeannjakel.entity.Role;
import com.leeannjakel.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.leeannjakel.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * The type Sign up.
 */
@WebServlet(
        urlPatterns = {"/SignUp"}
)

/**
 * class adds new user to database
 * @author LeeAnn Jakel
 */
public class SignUp extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao<User> userDao = new GenericDao(User.class);
    boolean notUnique;
    String jspToCall = "";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        logger.debug("username: {}", username);

        notUnique = verifyUniqueUsername(username);

        if (notUnique) {
            String errorMessage = "That username is already in use. Please select a new username and try again";
            req.setAttribute("Error", errorMessage);
            logger.debug("username removed?  {}", req.getParameter("userName"));
            jspToCall = "/signUp.jsp";

        } else {
            logger.debug("is unique username");
            User user = new User();
            user.setFirstName(req.getParameter("firstName"));
            user.setLastName(req.getParameter("lastName"));
            user.setUserName(username);
            user.setEmail(req.getParameter("email"));
            user.setPassword(req.getParameter("password"));

            User newUser = new User(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassword(), user.getEmail());
            logger.debug("Added user: {}", newUser);

            Role role = new Role(newUser, "basic_user", newUser.getUserName());
            newUser.addRole(role);

            int id = userDao.insert(newUser);
            String successMessage = "Your signup was successful, please log in!";
            req.setAttribute("Success", successMessage);
            req.setAttribute("newUser", userDao.getByPropertyEqualsId("id", id));
            jspToCall = "/signUpSuccess.jsp";
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(jspToCall);
        dispatcher.forward(req, resp);
    }

    public Boolean verifyUniqueUsername(String username) {
        List<User> userList = userDao.getAll();
        for (User user: userList) {
            logger.debug("user list: {}", user.getUserName());
            String previousUserName = user.getUserName();
            if (username.equals(previousUserName)) {
                notUnique = true;
                break;
            } else {
                notUnique = false;
            }
        }
        return notUnique;
    }

}
