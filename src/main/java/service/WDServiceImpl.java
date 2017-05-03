package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public class WDServiceImpl {

    private Connection connection;

    public WDServiceImpl() {
        final String USER = "postgres";
        final String PASSWORD = "root";
        final String DB_NAME = "WorkDepartment";

    }

}
