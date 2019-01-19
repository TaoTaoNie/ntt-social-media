package com.ntt.nttsocialmedia.beans;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author leetHuam
 * @version 1.0
 */
@Data
@Document(collection = "employees")
public class Employee {
    @Id private String id;
    private String firstName;
    private String lastName;
    private String role;
}
