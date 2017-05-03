package domain;

/**
 * Created by Valsorya94 on 29.04.2017.
 */
public class Departments {

    private String nameOfDepartment;
    private String siteOfDepartment;
    private String phoneOfDepartment;
    private int numOfWorkers;
    private long idOfDepartment;

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getSiteOfDepartment() {
        return siteOfDepartment;
    }

    public void setSiteOfDepartment(String siteOfDepartment) {
        this.siteOfDepartment = siteOfDepartment;
    }

    public String getPhoneOfDepartment() {
        return phoneOfDepartment;
    }

    public void setPhoneOfDepartment(String phoneOfDepartment) {
        this.phoneOfDepartment = phoneOfDepartment;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    public long getIdOfDepartment() {
        return idOfDepartment;
    }

    public void setIdOfDepartment(long idOfDepartment) {
        this.idOfDepartment = idOfDepartment;
    }
}
