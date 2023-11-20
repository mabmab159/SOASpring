package mijael.soa.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private boolean estado;
}
