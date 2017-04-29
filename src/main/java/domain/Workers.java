package domain;

import java.util.Date;

/**
 * Created by Valsorya94 on 29.04.2017.
 */
public class Workers {

    private String firstNameOfWorker;
    private String lastNameOfWorker;
    private String positionOfWorker;
    private String sexOfWorker;
    private String mailOfWorker;
    private int salaryOfWorker;
    private int ageOfWorker;
    private long idOfWorker;
    private Date date;

    public String getFirstNameOfWorker() {
        return firstNameOfWorker;
    }

    public void setFirstNameOfWorker(String firstNameOfWorker) {
        this.firstNameOfWorker = firstNameOfWorker;
    }

    public String getLastNameOfWorker() {
        return lastNameOfWorker;
    }

    public void setLastNameOfWorker(String lastNameOfWorker) {
        this.lastNameOfWorker = lastNameOfWorker;
    }

    public String getPositionOfWorker() {
        return positionOfWorker;
    }

    public void setPositionOfWorker(String positionOfWorker) {
        this.positionOfWorker = positionOfWorker;
    }

    public String getSexOfWorker() {
        return sexOfWorker;
    }

    public void setSexOfWorker(String sexOfWorker) {
        this.sexOfWorker = sexOfWorker;
    }

    public String getMailOfWorker() {
        return mailOfWorker;
    }

    public void setMailOfWorker(String mailOfWorker) {
        this.mailOfWorker = mailOfWorker;
    }

    public int getSalaryOfWorker() {
        return salaryOfWorker;
    }

    public void setSalaryOfWorker(int salaryOfWorker) {
        this.salaryOfWorker = salaryOfWorker;
    }

    public int getAgeOfWorker() {
        return ageOfWorker;
    }

    public void setAgeOfWorker(int ageOfWorker) {
        this.ageOfWorker = ageOfWorker;
    }

    public long getIdOfWorker() {
        return idOfWorker;
    }

    public void setIdOfWorker(long idOfWorker) {
        this.idOfWorker = idOfWorker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
