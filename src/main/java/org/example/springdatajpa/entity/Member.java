package org.example.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@NoArgsConstructor
@Getter
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false ,unique = true)
    private String username;
    @Column(nullable = false )
    private String password;

    private Integer age;
}
