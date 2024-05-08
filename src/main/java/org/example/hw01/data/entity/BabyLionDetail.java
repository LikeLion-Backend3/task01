package org.example.hw01.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "babylion_detail")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class BabyLionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "babylion_id")
    private BabyLion babylion;
}
