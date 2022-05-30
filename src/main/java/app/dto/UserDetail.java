package app.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)


public class UserDetail {
    private User data;
    private Support support;

    public User getData() {return  data;}
    public void setData(User data) { this.data = data;}


}
