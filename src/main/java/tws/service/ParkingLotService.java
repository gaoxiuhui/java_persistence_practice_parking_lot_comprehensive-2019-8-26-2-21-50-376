package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.util.List;

@Service
public class ParkingLotService {
    @Autowired
    private ParkingLotMapper  parkingLotMapper ;
    // get 获得列表
    public List<ParkingLot> selectAllParkingLot() {
        return parkingLotMapper.selectAll();
    }
    // 插入  post  添加值
    public void insertParkingLot(@RequestBody ParkingLot parkingLot) {
        parkingLotMapper.insert(parkingLot);
    }
}
