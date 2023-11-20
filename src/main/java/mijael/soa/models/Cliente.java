package mijael.soa.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String email;
}
