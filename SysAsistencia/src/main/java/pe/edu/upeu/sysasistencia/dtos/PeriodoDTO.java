package pe.edu.upeu.sysasistencia.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PeriodoDTO{
    private Long id;

    @NotNull
    @Size(min = 6, max = 8, message = "{name.size}")
    private String nombre;
    @NotNull
    @Size(min = 6, max = 9,message = "{state.size}")
    private String estado;
}
