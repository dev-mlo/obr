package de.mlo.dev.thymeleafformdataparser;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class Address {
    private String street;
    private String zip;
    private String town;
}
