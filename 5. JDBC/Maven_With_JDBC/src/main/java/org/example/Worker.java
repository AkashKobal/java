package org.example;

public class Worker {
    // Instance variables datatype should
    // match with "worker" table datatype
    private int workerId;
    private String workerName;
    private float salary;
    private int additionalBenefits;
    private String contractPeriod;
    private int pricePerHour;
    private String type;

    // Getter and setter methods
    public int getWorkerId()
    {
        return workerId;
    }
    public void setWorkerId(int workerId)
    {
        this.workerId = workerId;
    }
    public String getWorkerName()
    {
        return workerName;
    }
    public void setWorkerName(String workerName)
    {
        this.workerName = workerName;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    public int getAdditionalBenefits()
    {
        return additionalBenefits;
    }
    public void setAdditionalBenefits(int additionalBenefits)
    {
        this.additionalBenefits = additionalBenefits;
    }
    public String getContractPeriod()
    {
        return contractPeriod;
    }
    public void setContractPeriod(String contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    public int getPricePerHour()
    {
        return pricePerHour;
    }
    public void setPricePerHour(int pricePerHour)
    {
        this.pricePerHour = pricePerHour;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
}