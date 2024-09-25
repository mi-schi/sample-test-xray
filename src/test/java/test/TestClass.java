package test;

import app.getxray.xray.junit.customjunitxml.annotations.Requirement;
import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.junit5.context.BundleContextExtension;

@ExtendWith(BundleContextExtension.class)
class TestClass {
	@Test
	// comment the following two annotations and the test will run
	@Requirement("JIRA-987")
	@XrayTest(key = "JIRA-123")
	void test() {
		Assertions.assertEquals(1, 1);
	}
}
