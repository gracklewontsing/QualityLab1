package mx.tec.lab;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.PanelUI;

@SpringBootTest
class FirstUnitTestApplicationTests {

	private static final Log LOG = LogFactory.getLog(FirstUnitTestApplicationTests.class);
	@Test
	public void simpleTest(){
		LOG.info("simple test");
	}
	@Test
	public void otherSimpleTest() {
		LOG.info("other simple test");
	}

	@Test
	void contextLoads() {
	}

	@BeforeAll
	public static void	setup(){
		LOG.info("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	public void init(){
		LOG.info("@BeforeEach - executes before each test method in this class");
	}

	@AfterEach
	public void tearDown(){
		LOG.info("@AfterEach - executed after each test method.");
	}

	@AfterAll
	public static void done(){
		LOG.info("@AfterAll - executed after all test methods.");
	}

	@Test
	@Disabled("Test is ignored as demonstration")
	public void notImplementedTest(){
		LOG.info("Not implemented yet");
	}
}
