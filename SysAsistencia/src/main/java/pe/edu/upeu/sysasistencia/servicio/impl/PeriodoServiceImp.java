package pe.edu.upeu.sysasistencia.servicio.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.repositorio.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repositorio.PeriodoRepository;
import pe.edu.upeu.sysasistencia.servicio.PeriodoService;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class PeriodoServiceImp extends CrudGenericoServiceImp<Periodo,Long> implements PeriodoService {

    private final PeriodoRepository repo;

    @Override
    protected CrudGenericoRepository<Periodo, Long> getRepo() {
        return repo;
    }



/*
    @Override
    public List<Periodo> obtenerPeriodos() {
        return periodoRepository.findAll();
    }

    @Override
    public Periodo obtenerPeriodo(Long id) {
        return periodoRepository.findById(id).orElse(new Periodo());
    }

    @Override
    public void guardarPeriodo(Periodo periodo) {
        periodoRepository.save(periodo);
    }

    @Override
    public void eliminarPeriodo(Long id) {
        periodoRepository.deleteById(id);
    }

    @Override
    public void actualizarPeriodo(Periodo periodo, Long id) {
        periodoRepository.save(periodo);
    }*/
}
