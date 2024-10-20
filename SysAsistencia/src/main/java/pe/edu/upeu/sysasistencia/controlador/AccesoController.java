package pe.edu.upeu.sysasistencia.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.modelo.Acceso;
import pe.edu.upeu.sysasistencia.servicio.AccesoService;


import java.util.List;

@RestController
@RequestMapping("/acceso")
public class AccesoController {

    @Autowired
    private AccesoService accesoService;

    @GetMapping("/list")
    public ResponseEntity<List<Acceso>> findAll() {
        List<Acceso> p=accesoService.findAll();
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Acceso> findByAcceso(@PathVariable Long id) {
        Acceso p=accesoService.findById(id);
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Acceso Acceso) {
        accesoService.save(Acceso);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        accesoService.delete(id);
    }
}
