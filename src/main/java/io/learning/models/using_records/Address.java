package io.learning.models.using_records;

public record Address(String street, String suite, String city, String zipcode, Geo geo) {
}
