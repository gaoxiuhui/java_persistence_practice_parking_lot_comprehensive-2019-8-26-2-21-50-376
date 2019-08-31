package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.util.List;

@Service
public class ParkingBoyService {
    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

    // get 获得列表
    public List<ParkingBoy> selectAllParkingBoys(){
        return parkingBoyMapper.selectAll();
    }
    // 插入  post  添加值
    public void insertParkingBoys(ParkingBoy parkingBoy){
        parkingBoyMapper.insert(parkingBoy);
    }
    // get 获得某一个停车男孩下的所有停车场
    public  List<Employee> selectAllEmployeesParkingBoys(){
        return parkingBoyMapper.selectAllEmployees();
    }
}
