package com.api.tests;
import com.api.base.AuthService;
import com.api.models.request.SignUPRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SignUpAPITest {

    @Test(description = "Verify If Signup API is working..")
    public void signUpTest() {
        SignUPRequest signUpRequest = new SignUPRequest.Builder().userName("Disha007").
                email("disha007@gmail.com").firstName("Disha")
                .lastName("Patani").password("password")
                .mobileNumber("1234567890").build();
        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);
        System.out.println(response.asPrettyString());




    }
}

