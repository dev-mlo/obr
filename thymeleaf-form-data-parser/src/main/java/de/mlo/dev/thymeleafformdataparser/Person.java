package de.mlo.dev.thymeleafformdataparser;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Accessors(chain = true)
@Data
public class Person {
    private String firstName;

    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    private List<Address> addressList;
}
