package in.Simplilearn.RestAssuredDemo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

       public class DeleteDemo {
    	   @Test
           public void deleteResource() {
    		   RestAssured.baseURI = "https://reqres.in/";
               RestAssured.basePath = "/api/users/694";
               RestAssured
               .when()
               .delete()
               .then()
               .statusCode(204);
       }
}