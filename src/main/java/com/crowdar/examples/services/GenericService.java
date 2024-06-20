package com.crowdar.examples.services;
import com.crowdar.examples.constants.LoginConstants;


import java.io.InputStream;
import java.util.Properties;

import static com.crowdar.core.actions.ActionManager.setInput;

public class GenericService {
    public static void login() throws Exception{
        Properties config = new Properties();
        InputStream input = null;

        try {
            input = GenericService.class.getClassLoader().getResourceAsStream("config.properties");

            config.load(input);

            String mail = config.getProperty("clocky.mail");
            String pass = config.getProperty("clocky.password");

            setInput(LoginConstants.MAIL_INPUT_LOCATOR, mail);
            setInput(LoginConstants.PASS_INPUT_LOCATOR, pass);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
