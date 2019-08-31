package tws.entity;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    private int employeeID;
    private String parkingBoyName;
    private int parkingBoyAge;
    private List<ParkingLot> parkingLotList;

    public Employee(int employeeID, String parkingBoyName, int parkingBoyAge, List<ParkingLot> parkingLotList) {
        this.employeeID = employeeID;
        this.parkingBoyName = parkingBoyName;
        this.parkingBoyAge = parkingBoyAge;
        this.parkingLotList = parkingLotList;
    }

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getParkingBoyName() {
        return parkingBoyName;
    }

    public void setParkingBoyName(String parkingBoyName) {
        this.parkingBoyName = parkingBoyName;
    }

    public int getParkingBoyAge() {
        return parkingBoyAge;
    }

    public void setParkingBoyAge(int parkingBoyAge) {
        this.parkingBoyAge = parkingBoyAge;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", parkingBoyName=" + parkingBoyName + '\'' +
                ", parkingBoyAge=" + parkingBoyAge +
                ", parkingLotList=" + parkingLotList +
                '}';
    }
}
