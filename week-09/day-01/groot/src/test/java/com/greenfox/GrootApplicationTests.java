package com.greenfox;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GrootApplicationTests {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void translateTest() throws Exception {
    mockMvc.perform(get("/groot?message=something"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.received").value("something"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.translated").value("I am groot!"));
  }

  @Test
  public void errorMessageTest() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("I am groot!"));
  }

  @Test
  public void yonduTest() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.distance").value(100.0))
            .andExpect(MockMvcResultMatchers.jsonPath("$.time").value(10.0))
            .andExpect(MockMvcResultMatchers.jsonPath("$.speed").value(10.0));
  }
}
