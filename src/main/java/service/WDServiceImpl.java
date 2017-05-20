package service;

import domain.Worker;

import java.sql.*;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public class WDServiceImpl implements WDService {

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

    public Worker addWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker,
                            Worker ageOfWorker, Worker date) {

        String sql = "INSERT INTO workers(firstnameofworker, lastnameofworker, mailofworker, ageofworker, date) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')";

        Worker worker = null;

        sql = String.format(sql, firstNameOfWorker.getFirstNameOfWorker(), lastNameOfWorker.getLastNameOfWorker(),
                mailOfWorker.getMailOfWorker(), ageOfWorker.getAgeOfWorker(), date.getDate());

        executeSQL(sql);


        //TODO need fix
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                worker = new Worker();
                worker.setFirstNameOfWorker(rs.getString("first_name_of_worker"));
                worker.setLastNameOfWorker(rs.getString("last_name_of_worker"));
                worker.setMailOfWorker(rs.getString("mail_of_worker"));
                worker.setAgeOfWorker(rs.getInt("age_of_worker"));
                worker.setDate(rs.getDate("date"));
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return worker;
    }

    public Worker editWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker,
                             Worker ageOfWorker, Worker date) {

        String sql = "UPDATE * FROM workers(firstnameofworker, lastnameofworker, mailofworker, ageofworker, date) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')";

        Worker worker = null;

        sql = String.format(sql, firstNameOfWorker.getFirstNameOfWorker(), lastNameOfWorker.getLastNameOfWorker(),
                mailOfWorker.getMailOfWorker(), ageOfWorker.getAgeOfWorker(), date.getDate());

        executeSQL(sql);

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                worker = new Worker();
                worker.setFirstNameOfWorker(rs.getString("first_name_of_worker"));
                worker.setLastNameOfWorker(rs.getString("last_name_of_worker"));
                worker.setMailOfWorker(rs.getString("mail_of_worker"));
                worker.setAgeOfWorker(rs.getInt("age_of_worker"));
                worker.setDate(rs.getDate("date"));
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return worker;
    }

    public Worker delWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker,
                            Worker ageOfWorker, Worker date) {

        String sql = "DELETE * FROM workers(firstnameofworker, lastnameofworker, mailofworker, ageofworker, date) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')";

        Worker worker = null;

        sql = String.format(sql, firstNameOfWorker.getFirstNameOfWorker(), lastNameOfWorker.getLastNameOfWorker(),
                mailOfWorker.getMailOfWorker(), ageOfWorker.getAgeOfWorker(), date.getDate());

        executeSQL(sql);

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                worker = new Worker();
                worker.setFirstNameOfWorker(rs.getString("first_name_of_worker"));
                worker.setLastNameOfWorker(rs.getString("last_name_of_worker"));
                worker.setMailOfWorker(rs.getString("mail_of_worker"));
                worker.setAgeOfWorker(rs.getInt("age_of_worker"));
                worker.setDate(rs.getDate("date"));
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return worker;
    }

    public Worker listOfWorkers(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker,
                                Worker ageOfWorker, Worker date) {

        String sql = "SELECT * FROM workers(firstnameofworker, lastnameofworker, mailofworker, ageofworker, date) " +
                "VALUES('%s', '%s', '%s', '%s', '%s')";

        Worker worker = null;

        sql = String.format(sql, firstNameOfWorker.getFirstNameOfWorker(), lastNameOfWorker.getLastNameOfWorker(),
                mailOfWorker.getMailOfWorker(), ageOfWorker.getAgeOfWorker(), date.getDate());

        executeSQL(sql);

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                worker = new Worker();
                worker.setFirstNameOfWorker(rs.getString("first_name_of_worker"));
                worker.setLastNameOfWorker(rs.getString("last_name_of_worker"));
                worker.setMailOfWorker(rs.getString("mail_of_worker"));
                worker.setAgeOfWorker(rs.getInt("age_of_worker"));
                worker.setDate(rs.getDate("date"));
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return worker;
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

    public void closeDBConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
