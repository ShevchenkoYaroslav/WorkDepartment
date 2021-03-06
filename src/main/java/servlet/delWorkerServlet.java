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
 * Created by Valsorya94 on 18.05.2017.
 */
@WebServlet("/MainPage")
public class delWorkerServlet extends HttpServlet {

    private WDService wdService;

    public delWorkerServlet() {
        wdService = new WDServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MainPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNameOfWorker = req.getParameter("first_name_of_worker");
        String lastNameOfWorker =  req.getParameter("last_name_of_worker");
        String mailOfWorker =  req.getParameter("mail_of_worker");
        String ageOfWorker =  req.getParameter("age_of_worker");
        String date =  req.getParameter("date");

        if (firstNameOfWorker != null && lastNameOfWorker != null && mailOfWorker != null && ageOfWorker != null
                && date != null) {
            wdService.delWorker(firstNameOfWorker, lastNameOfWorker, mailOfWorker, ageOfWorker, date);
        }

        req.getRequestDispatcher("MainPage.jsp").forward(req, resp);
    }
}
