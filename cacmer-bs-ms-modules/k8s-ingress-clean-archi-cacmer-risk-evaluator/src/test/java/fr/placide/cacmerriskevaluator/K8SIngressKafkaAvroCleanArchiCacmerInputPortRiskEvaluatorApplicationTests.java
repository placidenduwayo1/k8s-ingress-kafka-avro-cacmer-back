package fr.placide.cacmerriskevaluator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class K8SIngressKafkaAvroCleanArchiCacmerInputPortRiskEvaluatorApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertNotNull(this.getClass().getSimpleName());
	}

}
