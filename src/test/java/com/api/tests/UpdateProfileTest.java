package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.ProfileRequest;
import com.api.models.response.UserProfileResponse;
import com.api.utility.Utilities;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test(description = "Verify If update profile API is working..")
    public void updateProfileTest() {
        String newEmail="disha00112@gmail.com";
        UserProfileManagementService userService = new UserProfileManagementService();
        ProfileRequest profileRequest = new ProfileRequest.Builder().firstName("Disha")
                .lastName("Patani").mobileNumber("1234567890").email(newEmail).build();
        Utilities utility = new Utilities();
        String authToken = utility.getLoginAuthToken("Disha007","password");
       Response response =  userService.updateProfile(authToken,profileRequest);
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        System.out.println(response.asPrettyString());
        String updatedEmail = userProfileResponse.getEmail();

        Assert.assertEquals(updatedEmail,newEmail);



    }

}
