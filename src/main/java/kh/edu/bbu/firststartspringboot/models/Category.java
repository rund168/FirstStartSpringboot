package kh.edu.bbu.firststartspringboot.models;

import jakarta.persistence.*;
import kh.edu.bbu.firststartspringboot.models.request.KeyValueItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;
    @Transient
    List<KeyValueItem> statusList;

}
