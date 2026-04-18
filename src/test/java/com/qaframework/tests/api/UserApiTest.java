package com.qaframework.tests.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://demoqa.com";
    }

    @Test
    public void testGetUserById() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("/User/1")
                .then()
                .extract().response();

        Assert.assertTrue(response.getStatusCode() == 200 ||
                response.getStatusCode() == 401);
    }

    @Test
    public void testCreateUser() {
        String requestBody = "{\n" +
                "  \"userName\":