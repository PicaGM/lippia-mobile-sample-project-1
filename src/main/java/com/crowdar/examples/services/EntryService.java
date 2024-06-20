package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.EntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.By;
import org.testng.Assert;

public class EntryService {
    public static void createProject() {
        MobileActionManager.click(EntryConstants.NEW_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.MANUAL_ENTRY_BUTTON_LOCATOR);
    }
    public static void setProjectValues(String horario, String descripcion) {
        MobileActionManager.setInput(EntryConstants.FIRST_TIME_INPUT_LOCATOR, horario);
        MobileActionManager.click(EntryConstants.OK_TIME_BUTTON_LOCATOR);
        MobileActionManager.setInput(EntryConstants.PROJECT_DESCRIPTION_INPUT_LOCATOR, descripcion);
        MobileActionManager.click(EntryConstants.PROJECT_SELECT_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.PROJECT_SELECTOR_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.TASK_SELECT_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.TASK_SELECTOR_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.BACK_BUTTON_LOCATOR);
    }

    public static void saveEntry() {
        MobileActionManager.click(EntryConstants.SAVE_PROJECT_BUTTON_LOCATOR);
    }

    public static void verifyProject() {
        MobileActionManager.waitPresence(EntryConstants.ENTRY_VERIFY_TEXT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(EntryConstants.ENTRY_VERIFY_TEXT_LOCATOR));
    }

    public static void cancelEntry() {
        MobileActionManager.click(EntryConstants.BACK_BUTTON_LOCATOR);
        MobileActionManager.click(EntryConstants.DISCARD_BUTTON_LOCATOR);
    }

    public static void verifyBack() {
        MobileActionManager.waitPresence(LoginConstants.TIME_TRACKER_TEXT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(LoginConstants.TIME_TRACKER_TEXT_LOCATOR));
    }

    public static void selectDate(int date) {
        MobileActionManager.click(EntryConstants.DATE_BUTTON_LOCATOR);
        String fecha = EntryConstants.DATE_SELECTOR_LOCATOR + "[" + date + "]";
        DriverManager.getDriverInstance().findElement(By.xpath(fecha)).click();
        MobileActionManager.click(EntryConstants.OK_DATE_BUTTON_LOCATOR);
    }
}
