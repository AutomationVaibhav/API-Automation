package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignUPRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

    @Test(description = "Verify If fogot password API is working..")
    public void forgotPasswordTest() {
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("disha007@gmail.com");
        System.out.println(response.asPrettyString());




    }
}
