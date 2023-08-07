package com.alpercaktug.automation;

import com.alpercaktug.automation.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
//@Profile("qa")
class DemoApplicationTests {

	@Autowired
	private MainPage mainPage;
	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	void performLoginTest() {
		//mainPage.navigate();
		mainPage.performLogin();
	}
}
