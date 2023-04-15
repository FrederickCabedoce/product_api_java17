package cabedoce.cloud.solutions.productjava17.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Product {

    @Id
    private int id;

    private String name;

    private String brand;

    private String title;

    private BigDecimal unitCost;


}
