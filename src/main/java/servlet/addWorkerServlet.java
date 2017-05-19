package servlet;

import service.WDService;
import service.WDServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Valsorya94 on 29.04.2017.
 */
@WebServlet("/MainPage")
public class addWorkerServlet extends HttpServlet {

    private WDService wdService;

    public addWorkerServlet() {
        wdService = new WDServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MainPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNameOfWorker = req.getParameter("firstnameofworker");
        String lastNameOfWorker =  req.getParameter("lastnameofworker");
        String mailOfWorker =  req.getParameter("mailofworker");
        String ageOfWorker =  req.getParameter("ageofworker");
        String date =  req.getParameter("date");

        if (firstNameOfWorker != null && lastNameOfWorker != null && mailOfWorker != null && ageOfWorker != null
                && date != null) {
            wdService.addWorker(firstNameOfWorker, lastNameOfWorker, mailOfWorker, ageOfWorker, date);
        }

        req.getRequestDispatcher("MainPage.jsp").forward(req, resp);
    }
}
