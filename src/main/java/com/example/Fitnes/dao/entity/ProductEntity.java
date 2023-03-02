package com.example.Fitnes.dao.entity;

import com.example.Fitnes.core.dto.products.ProductDTO;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(schema = "app", name = "products")

public class ProductEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "dt_create")
    private LocalDateTime dtCreate;
    @Column(name = "dt_update")
    @Version
    private LocalDateTime dtUpdate;

    @Column(name = "title")
    private String title;

    @Column(name = "weight")
    private int weight;
    @Column(name = "calories")
    private int calories;
    @Column(name = "proteins")
    private double proteins;
    @Column(name = "fats")
    private double fats;
    @Column(name = "carbohydrates")
    private double carbohydrates;

    public ProductEntity(){

    }


    public ProductEntity(ProductDTO productDTO) {
        this.uuid = UUID.randomUUID();
        this.dtCreate = LocalDateTime.now();
        this.dtUpdate = LocalDateTime.now();
        this.title = productDTO.getTitle();
        this.weight = productDTO.getWeight();
        this.calories = productDTO.getCalories();
        this.proteins = productDTO.getProteins();
        this.fats = productDTO.getFats();
        this.carbohydrates = productDTO.getCarbohydrates();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return weight == that.weight && calories == that.calories && Double.compare(that.proteins, proteins) == 0 && Double.compare(that.fats, fats) == 0 && Double.compare(that.carbohydrates, carbohydrates) == 0 && Objects.equals(uuid, that.uuid) && Objects.equals(dtCreate, that.dtCreate) && Objects.equals(dtUpdate, that.dtUpdate) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, dtCreate, dtUpdate, title, weight, calories, proteins, fats, carbohydrates);
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "uuid=" + uuid +
                ", dtCreate=" + dtCreate +
                ", dtUpdate=" + dtUpdate +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                '}';
    }
}
