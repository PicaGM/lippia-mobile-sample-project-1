package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {

    public static void loginClockify() throws Exception {
        MobileActionManager.click(LoginConstants.LOGIN_MANUAL_BUTTON_LOCATOR);
        GenericService.login();
        MobileActionManager.click(LoginConstants.LOGIN_BUTTON_LOCATOR);
    }

    public static void verifyLogin() {
        MobileActionManager.waitPresence(LoginConstants.TIME_TRACKER_TEXT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(LoginConstants.TIME_TRACKER_TEXT_LOCATOR));
    }
}
