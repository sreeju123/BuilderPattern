package com.pom;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Sreej
 */

@Getter
@ToString
@Builder(setterPrefix = "set")
public class NewOrder {

    private String customer;
    private String address;

}
