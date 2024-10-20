package pe.edu.upeu.sysasistencia.servicio.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.modelo.Acceso;
import pe.edu.upeu.sysasistencia.repositorio.AccesoRepository;
import pe.edu.upeu.sysasistencia.repositorio.CrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repositorio.PeriodoRepository;
import pe.edu.upeu.sysasistencia.servicio.AccesoService;

@Service
@RequiredArgsConstructor
public class AccesoServiceImp extends CrudGenericoServiceImp<Acceso, Long> implements AccesoService {

    private final AccesoRepository repo;

    @Override
    protected CrudGenericoRepository<Acceso, Long> getRepo() {
        return repo;
    }
}

