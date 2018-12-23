package com.spring;

import com.spring.domain.repository.KnightRepository;
import com.spring.domain.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
    KnightRepository knightRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void testCastle(){
		String except = "znaduje się tu zamek o nazwie Castle Black.Zamieszkały przez rycerza o imeniu  Lancelot(29)Ma za zadanie: Ukryj księżniczke";
		assertEquals(except, knightRepository.toString());

	}

}
