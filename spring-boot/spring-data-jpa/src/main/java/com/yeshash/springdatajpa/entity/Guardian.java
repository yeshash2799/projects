package com.yeshash.springdatajpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "guardian_name")),
        @AttributeOverride(name = "emailId", column = @Column(name = "guardian_email_id")),
        @AttributeOverride(name = "mobileNumber", column = @Column(name = "guardian_mobile_number"))
})
public class Guardian {
    private String name;
    private String emailId;
    private String mobileNumber;
}
