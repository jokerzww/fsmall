package com.fsteam.fsmall.admin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.NoArgsConstructor
@lombok.Data
public class ExampleTest {

    /**
     * id : 1
     */

    @JsonProperty("id")
    private String id;
}
