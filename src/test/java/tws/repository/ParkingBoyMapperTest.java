package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.dto.Employee;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyMapperTest {
    @Autowired
    private ParkingBoyMapper parkingBoyMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;
   // 插入测试
    @Test
    public void insertTest(){
        //given
        ParkingBoy parkingBoy=new ParkingBoy(1,"高阳",20);
        //when
        parkingBoyMapper.insert(parkingBoy);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parking_boy"));
    }
// 查询测试
    @Test
    public void selectAllTest(){
        //given
        jdbcTemplate.execute("insert into parking_boy values(1,'胡鑫',20)");
        //when
        List<ParkingBoy> parkingBoys = parkingBoyMapper.selectAll();
        //then
        assertEquals(1,parkingBoys.size());
    }
// 查询停车男孩下所有停车场的测试
    @Test
    public void selectAllParkingEmployee(){
        //given
        jdbcTemplate.execute("insert  into `parking_boy` values(1,'高阳',18)");
        jdbcTemplate.execute("insert into `parking_lot` values(1,100,10,1)");
        //when
        List<Employee> parkingEmployees = parkingBoyMapper.selectAllEmployees();
        //then
        assertEquals(1,parkingEmployees.size());
    }
}
