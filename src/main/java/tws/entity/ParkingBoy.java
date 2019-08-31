package tws.entity;

import javax.validation.constraints.NotNull;

public class ParkingBoy {
    @NotNull(message="输入不能为空")
    private int parkingBoyID;
    @NotNull(message="输入不能为空")
    private String parkingBoyName;
    @NotNull(message="输入不能为空")
    private int parkingBoyAge;

    public ParkingBoy() {
    }

    public ParkingBoy(int parkingBoyID, String parkingBoyName, int parkingBoyAge) {
        this.parkingBoyID = parkingBoyID;
        this.parkingBoyName = parkingBoyName;
        this.parkingBoyAge = parkingBoyAge;
    }

    public int getParkingBoyID() {
        return parkingBoyID;
    }

    public void setParkingBoyID(int parkingBoyID) {
        this.parkingBoyID = parkingBoyID;
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
}
