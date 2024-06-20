package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LogoutConstants;
import org.testng.Assert;

public class LogoutService {
    public static void logoutProcess() {
        MobileActionManager.click(LogoutConstants.SIDEBAR_BUTTON_LOCATOR);
        MobileActionManager.click(LogoutConstants.LOGOUT_BUTTON_LOCATOR);
    }

    public static void logoutConfirm() {
        MobileActionManager.click(LogoutConstants.CONFIRM_BUTTON_LOCATOR);
    }

    public static void logoutAssert() {
        MobileActionManager.waitPresence(LogoutConstants.LOGIN_TEXT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(LogoutConstants.LOGIN_TEXT_LOCATOR));
    }
}
