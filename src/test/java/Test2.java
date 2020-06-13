import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test2 {
    @Test
    public void test1() {
        given().get("http://127.0.0.1:27017").then().log().body().log().status();
    }

    @Test
    public void test2() {
        given()
                .get("http://www.mocky.io/v2/5ecba3b93000002b00ddd790")
                .then()
                .body("user.gender", equalTo("male"));
    }



}
