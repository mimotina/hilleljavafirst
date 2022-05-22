package productTests;

import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private int price;
    private LocalDate dueDate;

    public boolean isFresh() {
        return dueDate.isAfter(LocalDate.now());
    }
}
