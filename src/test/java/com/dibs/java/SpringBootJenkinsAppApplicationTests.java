package com.dibs.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpringBootJenkinsAppApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test case executed..");
		assertEquals(true, true);
	}

}
