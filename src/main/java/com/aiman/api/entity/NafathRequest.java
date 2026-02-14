package com.aiman.api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "nafath_request")
public class NafathRequest {
    @Id
    @Column(name = "id")
    private UUID id = UUID.randomUUID();

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "random_code")
    private String randomCode;

    @Column(name = "status")
    private String status = "PENDING";
}
