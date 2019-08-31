package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingLot;
import static org.junit.Assert.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotMapperTest {
    @Autowired
    private ParkingLotMapper parkingLotMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;
// 插入测试
    @Test
    public void insertTest(){
        //given
        ParkingLot parkingLot=new ParkingLot(1,80,20,1);
        //when
        parkingLotMapper.insert(parkingLot);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parking_lot"));
    }
// 查询测试
    @Test
    public void selectAllTest(){
        //given
        jdbcTemplate.execute("insert into parking_lot values(1,80,20,1)");
        //when
        List<ParkingLot> parkingLots = parkingLotMapper.selectAll();
        //then
        assertEquals(1,parkingLots.size());
    }
}
