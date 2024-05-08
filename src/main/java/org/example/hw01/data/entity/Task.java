package org.example.hw01.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "lion_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "task_id")
    private List<BabyLion> members = new ArrayList<>();

}
