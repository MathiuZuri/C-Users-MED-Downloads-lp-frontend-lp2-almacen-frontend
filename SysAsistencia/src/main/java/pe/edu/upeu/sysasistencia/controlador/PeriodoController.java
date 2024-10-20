package pe.edu.upeu.sysasistencia.controlador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.dtos.PeriodoDTO;
import pe.edu.upeu.sysasistencia.mappers.PeriodoMapper;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.servicio.PeriodoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    //@Autowired
    private final PeriodoService periodoService;

    private final PeriodoMapper periodoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<PeriodoDTO>> findAll() {
        List<PeriodoDTO> p=periodoMapper.toDTOs(periodoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PeriodoDTO> findByPeriodo(@PathVariable Long id) {
        PeriodoDTO p=periodoMapper.toDTO(periodoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PeriodoDTO periodo) {
        periodoService.save(periodoMapper.toEntity(periodo));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        periodoService.delete(id);
    }


}
