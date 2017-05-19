package domain;

/**
 * Created by Valsorya94 on 29.04.2017.
 */
public class Department {

    private String nameOfDepartment;
    private int numOfWorkers;
    private long idOfDepartment;

    public Department() {
    }

    public Department(String nameOfDepartment, int numOfWorkers, long idOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
        this.numOfWorkers = numOfWorkers;
        this.idOfDepartment = idOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
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
