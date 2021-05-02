package com.roofstacks.apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

public class apiTest {

    @BeforeClass
    public void beforeclass() {
        RestAssured.baseURI = "https://generator.swagger.io/api";
    }

    @Test
    public void test1() {

        Response response = when().get(baseURI+"/gen/clients/android");
        //verify status code
        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test
    public void test2() {

        String JSONBody = "{\n" +
                "        \"spec\": {},\n" +
                "        \"options\": {\n" +
                "        \"additionalProp1\": \"string\",\n" +
                "                \"additionalProp2\": \"string\",\n" +
                "                \"additionalProp3\": \"string\"\n" +
                "    },\n" +
                "        \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
                "            \"authorizationValue\": {\n" +
                "        \"value\": \"string\",\n" +
                "                \"type\": \"string\",\n" +
                "                \"keyName\": \"string\"\n" +
                "    },\n" +
                "        \"securityDefinition\": {\n" +
                "        \"type\": \"string\",\n" +
                "                \"description\": \"string\"\n" +
                "    }\n" +
                "    }";

        Response response = given().log().all()
                .accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body(JSONBody)
                .when()
                .post("/gen/clients/android");

        Assert.assertEquals(response.statusCode(), 200);

    }
}
