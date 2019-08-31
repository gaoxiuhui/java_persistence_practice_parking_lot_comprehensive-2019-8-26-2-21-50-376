package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;


import java.util.List;

@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    // get 获得列表
    @GetMapping("")
    public ResponseEntity<List<ParkingLot>> getAll() {
        List<ParkingLot> parkingLot=parkingLotMapper.selectAll();
        return ResponseEntity.ok(parkingLot);
    }
    // 插入  post  添加值
    @PostMapping("")
    public ResponseEntity<ParkingLot> insert(@RequestBody ParkingLot parkingLot) {
        parkingLotMapper.insert(parkingLot);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
