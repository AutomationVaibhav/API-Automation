package com.api.tests;
import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {

    @Test(description = "Verify If Login API is working..")
    public void loginTest() {
        LoginRequest loginRequest = new LoginRequest("qusay1234","password");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
       LoginResponse loginResponse =  response.as(LoginResponse.class);
        int responseStatusCode = response.getStatusCode();
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getEmail());

        Assert.assertEquals(responseStatusCode, 200);
    }
}


//qusay1234
//password