package tws.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingBoyControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_isCreated_when_given_a_post_request_parkingboys() throws Exception {
        mockMvc.perform(post("/parkingBoys")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .content("{\"employeeID\":2,\"parkingBoyName\":\"xiaoming\",\"age\":18}"))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void should_return_isOK_and_content_when_given_a_get_request_parkingboys() throws Exception {
        mockMvc.perform(get("/parkingBoys"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"employeeID\":1,\"parkingBoyName\":\"xiaoming\",\"age\":18}]"));
    }
}
