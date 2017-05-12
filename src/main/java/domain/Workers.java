package domain;

import java.util.Date;

/**
 * Created by Valsorya94 on 29.04.2017.
 */
public class Workers {

    private String firstNameOfWorker;
    private String lastNameOfWorker;
    private String mailOfWorker;
    private int ageOfWorker;
    private Date date;

    public Workers() {
    }

    public Workers(String firstNameOfWorker, String lastNameOfWorker, String mailOfWorker, int ageOfWorker, Date date) {
        this.firstNameOfWorker = firstNameOfWorker;
        this.lastNameOfWorker = lastNameOfWorker;
        this.mailOfWorker = mailOfWorker;
        this.ageOfWorker = ageOfWorker;
        this.date = date;
    }

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

    public String getMailOfWorker() {
        return mailOfWorker;
    }

    public void setMailOfWorker(String mailOfWorker) {
        this.mailOfWorker = mailOfWorker;
    }

    public int getAgeOfWorker() {
        return ageOfWorker;
    }

    public void setAgeOfWorker(int ageOfWorker) {
        this.ageOfWorker = ageOfWorker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}