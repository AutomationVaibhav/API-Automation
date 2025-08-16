package com.api.utility;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;

public class Utilities {

    public String getLoginAuthToken(String username,String password ){
        AuthService authService =new AuthService();
        Response authResponse = authService.login(new LoginRequest(username,password));
        LoginResponse authData = authResponse.as(LoginResponse.class);
        return authData.getToken();

    }


}
