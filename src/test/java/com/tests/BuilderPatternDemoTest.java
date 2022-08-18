package com.tests;

import com.pom.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Sreej
 */
public class BuilderPatternDemoTest {


    @Test
    public void postJsonUsingBuilderTest(){

//        Registration registration=new Registration("Doctor","Body",101);

        Registration registration = new RegistrationBuilder().setTitle("Police").setBody("SampleBody").setUserId(2011).build();

        Response response= RestAssured.given().baseUri("https://jsonplaceholder.typicode.com")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .body(registration)
                .post("/posts");
        System.out.println("\n Response:"+response.getBody().prettyPrint());
        Assert.assertEquals(response.getStatusCode(),201);
    }

    @Test
    public void postJsonUsingStaticInnerClassBuilderTest(){


       NewProduct newProduct=NewProduct.builder().setCategory("Home").setPrice(199)
                .setDescription("Home Decorations").setManufacturer("PepperFry").setName("Glass").build();

        Response response= RestAssured.given().baseUri("https://mystoreapi.com")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .body(newProduct)
                .post("/Catalog/Product");
        System.out.println("\n Response:"+response.getBody().prettyPrint());
        Assert.assertEquals(response.getStatusCode(),201);
    }

    @Test
    public void postJsonUsingLombakTest(){


        NewOrder newOrder = NewOrder.builder().setCustomer("Ronaldo").setAddress("First cross street").build();


        Response response= RestAssured.given().baseUri("https://mystoreapi.com")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .body(newOrder)
                .post("/Order/new");
        System.out.println("\n Response:"+response.getBody().prettyPrint());
        Assert.assertEquals(response.getStatusCode(),201);
    }
}
