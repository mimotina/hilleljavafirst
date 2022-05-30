package app.config;

import app.dto.Person;
import app.dto.PersonUpdate;
import io.restassured.response.Response;

public class UserHttpRequest extends BaseHttpRequest {
    private static final String userUrl = "api/users";

    public Response getUsers(String id){
        return getRequestSpecification().when().get(userUrl+ "/" + id);
    }

    public  Response createUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .post(userUrl);
    }
    public  Response updateUser(PersonUpdate person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .put(userUrl);
    }

    public  Response update2User(PersonUpdate person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .patch(userUrl);
    }
    public  Response deleteUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .delete(userUrl);
    }
}
