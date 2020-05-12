package in.reqres.api.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created By Chaitanya
 */
public class TestBase {
    @BeforeClass
    public static void inIT() {

        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }
}
