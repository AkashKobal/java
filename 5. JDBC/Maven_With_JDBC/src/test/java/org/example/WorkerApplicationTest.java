package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.List;
import org.junit.Test;

public class WorkerApplicationTest {
    WorkerQueries workerQueriesObject = new WorkerQueries();
    @Test
    public void listWorkerDetails_positive()
    {
        List<Worker> listWorkerDetails = workerQueriesObject.listWorkerDetails();

        // Checking whether totally 3 workers are available
        assertEquals(listWorkerDetails.size(), 20);

        // Checking whether first worker id is 1
        assertEquals(listWorkerDetails.get(0).getWorkerId(), 1);

        // Checking whether first worker name is Rachel Green
        assertEquals(listWorkerDetails.get(0).getWorkerName(), "Alice Johnson");

        // Checking whether second worker name is Rachel Green
        assertEquals(listWorkerDetails.get(1).getWorkerName(), "Bob Smith");

        // Checking whether first  worker priceperhour is 20
        assertEquals(listWorkerDetails.get(0).getPricePerHour(), 350);

        // Checking whether second  worker price per hour  is 2000
        assertEquals(listWorkerDetails.get(1).getPricePerHour(), 400);

        // checking whether third worker contract period is 25 hours
        assertEquals(listWorkerDetails.get(2).getContractPeriod(), "3 months");

        // checking whether third worker type is contractworker
        assertEquals(listWorkerDetails.get(2).getType(), "Intern");
    }

    @Test
    public void listworkerDetails_negative()
    {
        List<Worker> listworkerDetails = workerQueriesObject.listWorkerDetails();
        // As this is negative testing we need to check with assertNotEquals
        assertNotEquals(listworkerDetails.size(), 11);

        // Checking whether first worker id is not 10
        assertNotEquals(listworkerDetails.get(0).getWorkerId(), 10);

        // Checking whether first worker name is not Monica
        assertNotEquals(listworkerDetails.get(0).getWorkerName(), "Monica");

        // Checking whether second  worker salary is not 30000
        assertNotEquals(listworkerDetails.get(1).getSalary(), 30000);

        // Checking whether second  worker price per hour  is not 400
        assertNotEquals(listworkerDetails.get(1).getPricePerHour(), 450);

        // Checking whether third  worker is not a regular worker
        assertNotEquals(listworkerDetails.get(2).getType(), "regularworker");
    }

    @Test
    public void getworkerName_PositiveTestCase()
    {
        String workerName = workerQueriesObject.getWorkerNameById(1);
        assertEquals(workerName, "Rachel Green");
        workerName = workerQueriesObject.getWorkerNameById(2);
        assertEquals(workerName, "Ross");
        workerName = workerQueriesObject.getWorkerNameById(3);
        assertEquals(workerName, "Joey Tribbiani");
    }

    @Test
    public void getdworkerName_NegativeTestCase()
    {
        String workerName = workerQueriesObject.getWorkerNameById(2);
        assertNotEquals(workerName, "Phoebe");
    }

    @Test
    public void getFirstworkerPricePerHour_PositiveTestCase()
    {
        int pricePerHour = workerQueriesObject.getWorkerPricePerHour(1);
        assertEquals(pricePerHour, 1000);
    }

    @Test
    public void getSecondworkerPricePerHour_NegativeTestCase()
    {
        int pricePerHour = workerQueriesObject.getWorkerPricePerHour(2);
        assertNotEquals(pricePerHour, 5000);
    }
}