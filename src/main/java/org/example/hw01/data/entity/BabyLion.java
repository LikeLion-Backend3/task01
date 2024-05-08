package org.example.hw01.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class BabyLion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String major;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phonenum;

    @Column(nullable = false, unique = true)
    private String password;

    @Column
    private String profile;

    @Column
    private LocalDateTime createAt;

    @Column
    private LocalDateTime updatedAt;
}
