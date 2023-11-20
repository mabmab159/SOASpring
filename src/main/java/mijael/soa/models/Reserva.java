package mijael.soa.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Auto auto;
    private Date fecha_inicio;
    private Date fecha_fin;
    private boolean estado;
}
