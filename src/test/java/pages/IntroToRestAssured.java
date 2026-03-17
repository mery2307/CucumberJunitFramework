package pages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class IntroToRestAssured {

    public static void main(String[] args) {
        // this represents request body
        // this represents request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "dr.chen@mediflow.com");
        requestBody.put("password", "Test@1234");

        RequestSpecification request = RestAssured.given()
                .baseUri("https://jvjdarxnrsqkkhkeotkc.supabase.co/functions/v1")
                .contentType(ContentType.JSON)
                .body(requestBody.toString());

        Response response = request.post("/api-auth/login");

        System.out.println("STATUS CODE: " + response.statusCode());
        System.out.println("RESPONSE BODY" + response.asPrettyString());
    }
}