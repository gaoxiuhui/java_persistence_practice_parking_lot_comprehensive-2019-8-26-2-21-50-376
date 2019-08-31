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

import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyMapper parkingBoyMapper;
    // get 获得列表
    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {
        List<ParkingBoy> parkingBoy=parkingBoyMapper.selectAll();
        return ResponseEntity.ok(parkingBoy);
    }
 // 插入  post  添加值
    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
        parkingBoyMapper.insert(parkingBoy);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
 // get 获得某一个停车男孩下的所有停车场
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = parkingBoyMapper.selectAllEmployees();
        System.out.println(employees.toString());
        return ResponseEntity.ok(employees);
    }
}
