package com.llm.codedesigntutorials;

import com.llm.codedesign_3.Impl.Calculation;
import com.llm.codedesign_3.Impl.CalculationExt;
import com.llm.codedesigntotrials_2.IVideoService;
import com.llm.codedesigntotrials_2.Impl.GuestVIdeoService;
import com.llm.codedesigntotrials_2.Impl.OrdinaryVideoService;
import com.llm.codedesigntotrials_2.Impl.VipVideoService;
import com.llm.codedesigntutorials.service.VideoUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeDesignTutorialsApplicationTests {

	@Test
	public void TestUserGrade() {
		VideoUserService videoUserService = new VideoUserService();
		videoUserService.serviceGrade("VIP");
	}

	/**
	 * 接口
	 * */
	@Test
	public void TestUserImpl(){

		//这里也是多态了
		IVideoService guest = new GuestVIdeoService();
		IVideoService vip = new VipVideoService();
		IVideoService ord = new OrdinaryVideoService();

		guest.definition();
		guest.advertisement();

		vip.advertisement();
		vip.definition();

		ord.advertisement();
		ord.definition();
	}

	@Test
	public void TestCalculation(){
		CalculationExt calExt = new CalculationExt();
		System.out.println(calExt.circular(2));
	}

	@Test
	public void TestCalculation2(){
		Calculation cal = new Calculation();
		System.out.println(cal.circular(2));
	}
}
