package service;

import domain.Workers;

import java.sql.*;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public class WDServiceImpl implements WDService{

    private Connection connection;

    public WDServiceImpl() {

        final String USER = "postgres";
        final String PASSWORD = "root";
        final String DB_NAME = "WorkDepartment";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + DB_NAME, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public Workers addWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker,
                             Workers ageOfWorker, Workers date) {

        String sql = "INSERT INTO workers(firstnameofworker, lastnameofworker, mailofworker, ageofworker, date) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')";

        sql = String.format(sql, firstNameOfWorker.getFirstNameOfWorker(), lastNameOfWorker.getLastNameOfWorker(),
                mailOfWorker.getMailOfWorker(), ageOfWorker.getAgeOfWorker(), date.getDate());

        executeSQL(sql);

        return null;
    }

    public Workers editWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker,
                              Workers ageOfWorker, Workers date) {
        return null;
    }

    public Workers delWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker,
                             Workers ageOfWorker, Workers date) {
        return null;
    }

    public Workers listOfWorkers(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker,
                                 Workers ageOfWorker, Workers date) {
        return null;
    }

    public void closeDBConnection() {
        try {

            connection.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    private void executeSQL(String sql) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
