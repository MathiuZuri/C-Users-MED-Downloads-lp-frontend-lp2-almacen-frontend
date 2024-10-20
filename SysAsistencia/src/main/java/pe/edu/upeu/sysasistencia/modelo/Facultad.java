package pe.edu.upeu.sysasistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "upeu_facultad") //Kevin RP,  Egar David, Mijael, Walter, Juan Diego,
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60, nullable = false)
    private String nombrefac;
    @Column(length = 8,nullable = false)
    private String estado;
    @Column(length = 8, nullable = false)
    private String iniciales;

}
