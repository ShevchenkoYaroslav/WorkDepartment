package service;

import domain.Workers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public class WDServiceImpl implements WDService{

    private Connection connection;

    public WDServiceImpl() {

        final String USER = "postgres";
        final String PASSWORD = "root";
        final String DB_NAME = "WorkDepartment";

    }


    public Workers addWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date) {
        return null;
    }

    public Workers editWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date) {
        return null;
    }

    public Workers delWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date) {
        return null;
    }

    public Workers listOfWorkers(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date) {
        return null;
    }

    public void closeDBConnection() {

    }
}
