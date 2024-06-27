package com.crowdar.examples.services;
import com.crowdar.core.PropertyManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public class ApiHelperService {

    static String key = PropertyManager.getProperty("x-api-key");
    static String baseUrl = PropertyManager.getProperty("base.url");

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
                .get("/workspaces")
                .then()
                .extract()
                .response();
    }

    public static Response sendDeleteRequest() {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .delete();
    }

    public static Response sendDeleteRequestParam(String url, String param, List<String> params) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .queryParams(param, params)
                .delete(url);
    }

    public static void deleteEntry() {
        String endpoint = "/workspaces/6532bafc671f3c6ed91e3332/user/65383a07205d0441c5269f46/time-entries";
        Response entriesList = sendGetRequest(endpoint);
        String responseBody = entriesList.getBody().asString();
        JsonPath entryResponse = new JsonPath(responseBody);
        boolean entriesExists = entryResponse.getBoolean("find { it.description.contains('timeEntry-tpFinal') } != null");

        if (entriesExists) {
            List<String> timeEntryIds = entryResponse.getList("findAll { it.description.contains('timeEntry-tpFinal') }.id");
            System.out.println(timeEntryIds);
            sendDeleteRequestParam(endpoint, "time-entry-ids", timeEntryIds);
        } else {
            System.out.println("No entries found on workspace 6532bafc671f3c6ed91e3332.");
        }
    }
}
