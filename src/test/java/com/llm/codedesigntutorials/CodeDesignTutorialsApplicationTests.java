package com.llm.codedesigntutorials;

import com.llm.codedesigntotrials_2.IVideoService;
import com.llm.codedesigntotrials_2.Impl.GuestVIdeoService;
import com.llm.codedesigntotrials_2.Impl.OrdinaryVideoService;
import com.llm.codedesigntotrials_2.Impl.VipVideoService;
import com.llm.codedesigntutorials.service.VideoUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeDesignTutorialsApplicationTests {

	VideoUserService videoUserService = new VideoUserService();

	//这里也是多态了
	IVideoService guest = new GuestVIdeoService();
	IVideoService vip = new VipVideoService();
	IVideoService ord = new OrdinaryVideoService();
	@Test
	public void TestUserGrade() {
		videoUserService.serviceGrade("VIP");
	}

	/**
	 * 接口
	 * */
	@Test
	public void TestUserImpl(){
		guest.definition();
		guest.advertisement();

		vip.advertisement();
		vip.definition();

		ord.advertisement();
		ord.definition();
	}
}
