package kh.edu.bbu.firststartspringboot.models;

import jakarta.persistence.*;
import kh.edu.bbu.firststartspringboot.models.request.KeyValueItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "article")
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Category category;
    private String title;
    private String description;
    private String imageUrl;
    private String status;
    @Transient
    private List<Category> categoryList;
    @Transient
    private List<KeyValueItem> statusList;

}
