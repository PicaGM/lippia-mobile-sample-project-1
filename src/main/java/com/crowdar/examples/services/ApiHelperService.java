package com.crowdar.examples.services;
import com.crowdar.core.PropertyManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelperService {

    static String key = PropertyManager.getProperty("x-api-key");

    public static Response sendPostRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .body(body)
                .post(url);
    }

    public static Response sendPutRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .body(body)
                .put(url);
    }

    public static Response sendGetRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .get(url);
    }

    public static Response sendDeleteRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .delete(url);
    }
}
