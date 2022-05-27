package demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String SSID;
    private Gender gender;
}
