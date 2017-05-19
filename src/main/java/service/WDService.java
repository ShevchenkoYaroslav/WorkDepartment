package service;

import domain.Worker;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public interface WDService {

    //TODO implement methods

    Worker addWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker, Worker ageOfWorker, Worker date);
    Worker editWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker, Worker ageOfWorker, Worker date);
    Worker delWorker(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker, Worker ageOfWorker, Worker date);
    Worker listOfWorkers(Worker firstNameOfWorker, Worker lastNameOfWorker, Worker mailOfWorker, Worker ageOfWorker, Worker date);

    void closeDBConnection();
}
