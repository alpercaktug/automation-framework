package com.alpercaktug.automation;

import com.alpercaktug.automation.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Test
	void performLoginTest() {
		mainPage.navigate();
		mainPage.performLogin();
	}
}
