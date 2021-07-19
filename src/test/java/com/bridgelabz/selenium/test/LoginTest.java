package com.bridgelabz.selenium.test;

import com.bridgelabz.keyword.engine.KeywordEngine;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    public KeywordEngine keywordEngine;

    @Test
    public void loginTest() {
       keywordEngine =new KeywordEngine();
       keywordEngine.startExecution("Sheet1");

    }
}