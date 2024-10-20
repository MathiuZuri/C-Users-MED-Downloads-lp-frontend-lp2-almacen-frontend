package pe.edu.upeu.sysasistencia.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.repositorio.CrudGenericoRepository;

import java.time.LocalDate;
import java.util.List;

public interface PeriodoService extends CrudGenericoService<Periodo,Long> {
    /*public List<Periodo> obtenerPeriodos();
    public Periodo obtenerPeriodo(Long id);
    public void guardarPeriodo(Periodo periodo);
    public void eliminarPeriodo(Long id);
    public void actualizarPeriodo(Periodo periodo, Long id);*/
}
