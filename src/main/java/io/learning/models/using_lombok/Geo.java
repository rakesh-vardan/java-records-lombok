package io.learning.models.using_lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Geo {

    private String lat;
    private String lng;
}
