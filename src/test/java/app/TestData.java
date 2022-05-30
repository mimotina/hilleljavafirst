package app;

import app.dto.Support;
import app.dto.User;

public interface TestData {
    Integer id = 2;
    String jobTitle = "leader";
    String userName = "Janet";
    String userLastName = "Weaver";
    String email = "janet.weaver@reqres.in";


    User user = new User(id, userName, userLastName, email);
    Support support = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
}
