package service;

import domain.Workers;

/**
 * Created by Valsorya94 on 03.05.2017.
 */
public interface WDService {

    Workers addWorker(Workers firstNameOfWorker, Workers lastNameOfWorker, Workers mailOfWorker);
    Workers editWorker();
    Workers delWorker();
    Workers listOfWorkers();

}
