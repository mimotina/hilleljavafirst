package demo;

import lombok.*;

import java.util.Objects;
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private int price;


}
