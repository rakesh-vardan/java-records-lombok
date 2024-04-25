package io.learning;

import io.learning.models.using_native.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class APITest {

    RequestSpecification spec;

    @BeforeClass
    public void setUp() {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .build();
    }

    @Test
    public void testWithNativePOJO() {
        User user = given().spec(spec).when().
                get("/users/1").as(User.class);

        assertThat(user.getName(), is("Leanne Graham"));
        assertThat(user.getAddress().getCity(), is("Gwenborough"));
        assertThat(user.getAddress().getGeo().getLng(), is("81.1496"));
        assertThat(user.getCompany().getName(), is("Romaguera-Crona"));
    }

    @Test
    public void testWithLombok() {
        io.learning.models.using_lombok.User user = given().spec(spec).when().
                get("/users/1").as(io.learning.models.using_lombok.User.class);

        assertThat(user.getName(), is("Leanne Graham"));
        assertThat(user.getAddress().getCity(), is("Gwenborough"));
        assertThat(user.getAddress().getGeo().getLng(), is("81.1496"));
        assertThat(user.getCompany().getName(), is("Romaguera-Crona"));
    }

    @Test
    public void testWithRecords() {
        io.learning.models.using_records.User user = given().spec(spec).when().
                get("/users/1").as(io.learning.models.using_records.User.class);
        assertThat(user.name(), is("Leanne Graham"));
        assertThat(user.address().city(), is("Gwenborough"));
        assertThat(user.address().geo().lng(), is("81.1496"));
        assertThat(user.company().name(), is("Romaguera-Crona"));
    }
}
