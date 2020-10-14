package com.algorithm;

import com.jiahuixi.design.design.MyStarter.StarterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgorithmApplicationTests {
	@Autowired
	private StarterService starterService;

	@Test
	public void starterTest() {
		String[] splitArray = starterService.split(",");
		for (int i = 0; i < splitArray.length; i++) {
			System.out.println(splitArray[i]);
		}
	}


}
