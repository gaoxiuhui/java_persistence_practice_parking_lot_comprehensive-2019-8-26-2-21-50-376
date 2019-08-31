package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;
import tws.service.ParkingBoyService;

import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyService parkingBoyService;

    // get 获得列表
    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {
        List<ParkingBoy> parkingBoy=parkingBoyService.selectAllParkingBoys();
        return ResponseEntity.ok(parkingBoy);
    }
 // 插入  post  添加值
    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
        parkingBoyService.insertParkingBoys(parkingBoy);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
 // get 获得某一个停车男孩下的所有停车场
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = parkingBoyService.selectAllEmployeesParkingBoys();
        return ResponseEntity.ok(employees);
    }
}
