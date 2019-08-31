package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;
import tws.entity.ParkingBoy;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {

    List<ParkingBoy> selectAll();
    // 获得某一个停车男孩下的所有停车场
    void insert(@Param("parkingBoy") ParkingBoy parkingBoy);
    List<Employee> selectAllEmployees();
}
