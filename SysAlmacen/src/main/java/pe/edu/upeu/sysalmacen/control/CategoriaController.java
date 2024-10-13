package pe.edu.upeu.sysalmacen.control;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.mappers.CategoriaMapper;
import pe.edu.upeu.sysalmacen.mappers.MarcaMapper;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.ICategoriaService;
import pe.edu.upeu.sysalmacen.servicio.IMarcaService;

import java.net.URI;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

    private final ICategoriaService categoriaService;
    private final CategoriaMapper categoriaMapper;


    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<CategoriaDTO> list = categoriaMapper.toDTOs(categoriaService.findAll());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> findById(@PathVariable("id") Long id) {
        Categoria obj = categoriaService.findById(id);
        return ResponseEntity.ok(categoriaMapper.toDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody CategoriaDTO dto) {
        Categoria obj = categoriaService.save(categoriaMapper.toEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCategoria()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaDTO> update(@Valid @PathVariable("id") Long id, @RequestBody CategoriaDTO dto) {
        dto.setIdCategoria(id);
        Categoria obj = categoriaService.update(id, categoriaMapper.toEntity(dto));
        return ResponseEntity.ok(categoriaMapper.toDTO(obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        categoriaService.delete(id);
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
