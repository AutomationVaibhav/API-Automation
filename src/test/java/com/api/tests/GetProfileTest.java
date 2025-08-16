package com.api.tests;
import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.utility.Utilities;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileTest {

    @Test(description = "Verify If get profile API is working..")
    public void getProfileTest() {
        Utilities utility = new Utilities();
        String authToken = utility.getLoginAuthToken("Disha007","password");
        UserProfileManagementService userService = new UserProfileManagementService();
        Response response = userService.getProfile(authToken);
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        int responseStatusCode = response.getStatusCode();
        System.out.println(userProfileResponse.getEmail());
        Assert.assertEquals(responseStatusCode, 200);
    }
}
