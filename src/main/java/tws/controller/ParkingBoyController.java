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
import tws.ParkingBoyMapper;

import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {
        List<ParkingBoy> parkingBoy=parkingBoyMapper.selectAll();
        return ResponseEntity.ok(parkingBoy);
    }

    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
        parkingBoyMapper.insert(parkingBoy);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = parkingBoyMapper.selectAllEmployees();
        System.out.println(employees.toString());
        return ResponseEntity.ok(employees);
    }
}
