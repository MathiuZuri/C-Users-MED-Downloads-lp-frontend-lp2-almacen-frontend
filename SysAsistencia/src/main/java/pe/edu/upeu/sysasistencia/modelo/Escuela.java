package pe.edu.upeu.sysasistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_escuela")
public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombreeap", nullable = false)
    private String nombreeap;
    @Column(name = "estado", nullable = false, length = 8)
    private String estado;
    @Column(name = "inicialeseap", nullable = false, length = 8)
    private String inicialeseap;
    @JoinColumn(name = "facultad_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Facultad facultadId;
}
