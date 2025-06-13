package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorkerQueries {
    // We can write our required business logic methods here
    public List<Worker> listWorkerDetails()
    {
        MySQLConnection connClass = new MySQLConnection();
        Connection con = connClass.getFileFromResources();
        List<Worker> workerList = new ArrayList<Worker>();
        Worker worker = null;
        ResultSet resultSet = null;
        Statement statement = null;
        String query = "select * from worker";
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                worker = new Worker();
                worker.setWorkerId(resultSet.getInt(1));
                worker.setWorkerName(resultSet.getString(2));
                worker.setSalary(resultSet.getFloat(3));
                worker.setAdditionalBenefits(resultSet.getInt(4));

                // We can get by columnaname as well
                worker.setPricePerHour(resultSet.getInt("pricePerHour"));
                worker.setContractPeriod(resultSet.getString("contractPeriod"));
                worker.setType(resultSet.getString("type"));
                // System.out.println(rs.getInt(1) + " " + rs.getString(2));
                workerList.add(worker);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connClass.close(con);
            connClass.close(statement);
            connClass.close(resultSet);
        }
        return workerList;
    }

    public String getWorkerNameById(int workerId)
    {
        MySQLConnection connClass = new MySQLConnection();
        Connection con = connClass.getFileFromResources();
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        String workerName = null;
        try {
            String query = "select * from worker where workerId=?";
            pStmt = con.prepareStatement(query);
            pStmt.setInt(1, workerId);
            rs = pStmt.executeQuery();

            while (rs.next()) {
                workerName = rs.getString("workerName");
                System.out.println(rs.getString(2));
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            connClass.close(con);
            connClass.close(pStmt);
            connClass.close(rs);
        }
        return workerName;
    }

    public int getWorkerPricePerHour(int workerId)
    {
        MySQLConnection connClass = new MySQLConnection();
        Connection con = connClass.getFileFromResources();
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        int pricePerHour = 0;
        try {
            String query = "select * from worker where workerId=?";
            pStmt = con.prepareStatement(query);
            pStmt.setInt(1, workerId);
            rs = pStmt.executeQuery();
            while (rs.next()) {
                pricePerHour = rs.getInt("pricePerHour");
                System.out.println(pricePerHour);
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            connClass.close(con);
            connClass.close(pStmt);
            connClass.close(rs);
        }
        return pricePerHour;
    }
}