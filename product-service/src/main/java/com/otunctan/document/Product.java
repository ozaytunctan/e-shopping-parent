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
@Document(collection = "product")
public class Product {


    @Id
    @Field(name = "_id")
    private String id;

    @Field(name = "code",order = 1)
    private String code;

    private String name;

    private String description;

    private BigDecimal price;


}
