package com.example.flowpractice.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "organizations")
@SQLDelete(sql = "UPDATE organizations SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class OrganizationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String image;

    private String address;

    private int phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String welcomeText;

    private String aboutUsText;

    private boolean deleted = Boolean.FALSE;

    // TODO: Timestamps
}
