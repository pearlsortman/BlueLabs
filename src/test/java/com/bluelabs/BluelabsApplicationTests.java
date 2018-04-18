package com.bluelabs;

import com.bluelabs.controllers.CountiesController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BluelabsApplicationTests {

	@Autowired
	private CountiesController countiesController;

	@Test
	public void contextLoads() {
		assertThat(countiesController).isNotNull();
	}
}
