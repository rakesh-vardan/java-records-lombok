package io.learning.models.using_lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Company {

    private String name;
    private String catchPhrase;
    private String bs;
}
