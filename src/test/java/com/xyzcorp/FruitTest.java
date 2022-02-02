package com.xyzcorp;

import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FruitTest {

    @Test
    public void testFruit() {
        given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .when()
                .get("https://staging.tiered-planet.net/mild-temper/fruits")
                .then()
                .assertThat()
                .body("[0].description", equalTo("Winter fruit"));

    }
    @Test
    public void testLegumes() {
        given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .when()
                .get("https://staging.tiered-planet.net/mild-temper/legumes")
                .then()
                .assertThat()
                .body("[1].name",equalTo("Zucchini"));

    }
}
