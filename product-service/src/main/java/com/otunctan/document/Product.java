package com.otunctan.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@Document(value = "product")
public class Product {

    @Id
    @Field(name = "id", order = 0)
    private String id;

    @Field(name = "name", order = 1)
    private String name;

    @Field(name = "description", order = 2)
    private String description;

    @Field(name = "price", order = 3)
    private BigDecimal price;


}
