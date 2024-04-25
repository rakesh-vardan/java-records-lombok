package io.learning.models.using_lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
