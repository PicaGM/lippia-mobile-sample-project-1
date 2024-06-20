package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ConfigConstants;
import com.crowdar.examples.constants.LogoutConstants;
import org.testng.Assert;

public class ConfigService {
    public static void settings() {
        MobileActionManager.click(LogoutConstants.SIDEBAR_BUTTON_LOCATOR);
        MobileActionManager.click(ConfigConstants.SETTINGS_BUTTON_LOCATOR);
    }

    public static void selectTheme() {
        MobileActionManager.click(ConfigConstants.THEME_BUTTON_LOCATOR);
        MobileActionManager.click(ConfigConstants.DARK_BUTTON_LOCATOR);
        MobileActionManager.click(ConfigConstants.OK_BUTTON_LOCATOR);
    }

    public static void themeConfirm() {
        MobileActionManager.waitPresence(ConfigConstants.DARK_TEXT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(ConfigConstants.DARK_TEXT_LOCATOR));
    }
}
