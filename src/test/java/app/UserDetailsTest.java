package app;
import app.config.UserHttpRequest;
import app.dto.Person;
import app.dto.PersonUpdate;
import app.dto.UserDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
    private static UserHttpRequest usersHttpRequest;

    @BeforeAll
    public static void setUsersHttpRequest(){
        usersHttpRequest = new UserHttpRequest();
    }

    @Test
    public void  testGetUserDetail(){
        UserDetail expectedDetail = new UserDetail(TestData.user, TestData.support);
    UserDetail actual = usersHttpRequest.getUsers(Integer.toString(TestData.id))
            .then()
            .extract()
            .as(UserDetail.class);
        Assertions.assertEquals(expectedDetail, actual);
    }

    @Test
    public void createUser(){
        Person expected = new Person(TestData.userName, TestData.jobTitle,"618" ,"2022-05-28T21:05:59.564Z");
       Person actual =  usersHttpRequest.createUser(expected)
               .then().extract()
               .as(Person.class);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void updateUser(){
        PersonUpdate expected = new PersonUpdate(TestData.userName, TestData.jobTitle,  "2022-05-30T20:11:45.035Z" );
        PersonUpdate actual = usersHttpRequest.updateUser(expected)
                .then().extract().as(PersonUpdate.class);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void update2User(){
        PersonUpdate expected = new PersonUpdate(TestData.userName, TestData.jobTitle,  "2022-05-30T20:11:45.035Z" );
        PersonUpdate actual = usersHttpRequest.update2User(expected)
                .then().extract().as(PersonUpdate.class);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteUser(){
        Person expected = new Person(TestData.userName, TestData.jobTitle, "136", "2022-05-30T20:11:45.035Z" );
       usersHttpRequest.deleteUser(expected)
                .then().statusCode(204);

    }



}
