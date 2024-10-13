package pe.edu.upeu.sysalmacen.control;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.mappers.CategoriaMapper;
import pe.edu.upeu.sysalmacen.mappers.UnidadMedidaMapper;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;
import pe.edu.upeu.sysalmacen.servicio.ICategoriaService;
import pe.edu.upeu.sysalmacen.servicio.IUnidadMedidaService;

import java.net.URI;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/unidadMedida")
@CrossOrigin("*")
public class UnidadMedidaController {

    private final IUnidadMedidaService unidadMedidaService;
    private final UnidadMedidaMapper unidadMedidaMapper;


    @GetMapping
    public ResponseEntity<List<UnidadMedidaDTO>> findAll() {
        List<UnidadMedidaDTO> list = unidadMedidaMapper.toDTOs(unidadMedidaService.findAll());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnidadMedidaDTO> findById(@PathVariable("id") Long id) {
        UnidadMedida obj = unidadMedidaService.findById(id);
        return ResponseEntity.ok(unidadMedidaMapper.toDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody UnidadMedidaDTO dto) {
        UnidadMedida obj = unidadMedidaService.save(unidadMedidaMapper.toEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdUnidad()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UnidadMedidaDTO> update(@Valid @PathVariable("id") Long id, @RequestBody UnidadMedidaDTO dto) {
        dto.setIdUnidad(id);
        UnidadMedida obj = unidadMedidaService.update(id, unidadMedidaMapper.toEntity(dto));
        return ResponseEntity.ok(unidadMedidaMapper.toDTO(obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        unidadMedidaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    /*@GetMapping("/hateoas/{id}")
    public EntityModel<MarcaDTO> findByIdHateoas(@PathVariable("id") Long id) {
        EntityModel<MarcaDTO> resource = EntityModel.of(mapperUtil.map(service.findById(id), PatientDTO.class));

        //generar link informativo
        WebMvcLinkBuilder link1 = linkTo(methodOn(this.getClass()).findById(id));
        WebMvcLinkBuilder link2 = linkTo(methodOn(MedicController.class).findAll());

        resource.add(link1.withRel("patient-self-info"));
        resource.add(link2.withRel("all-medic-info"));

        return resource;
    }*/
}
