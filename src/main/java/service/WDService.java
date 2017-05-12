package service;

import domain.Workers;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public interface WDService {

    //TODO implement methods

    Workers addWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date);
    Workers editWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date);
    Workers delWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date);
    Workers listOfWorkers(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker, Workers ageOfWorker, Workers date);
    void closeDBConnection();

}
