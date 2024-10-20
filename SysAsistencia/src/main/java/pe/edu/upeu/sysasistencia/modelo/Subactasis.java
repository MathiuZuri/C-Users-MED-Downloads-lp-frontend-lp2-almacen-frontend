package pe.edu.upeu.sysasistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "upeu_subactasis")
public class Subactasis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private LocalTime horasi;
    @Column(nullable = false)
    private LocalTime minToler;
    @Column(nullable = false, length = 8)
    private String estado;
    @Column(nullable = false, length = 2)
    private String offlinex;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_id", referencedColumnName = "id", nullable
            = false, foreignKey = @ForeignKey(name = "FK_SUBACTASIS_EVENTO"))
    private Evento eventoId;
}