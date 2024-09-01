package com.llm.codedesigntutorials;

import com.llm.codedesigntutorials.service.VideoUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeDesignTutorialsApplicationTests {

	VideoUserService videoUserService = new VideoUserService();
	@Test
	public void TestUserGrade() {
		videoUserService.serviceGrade("VIP");
	}

}
