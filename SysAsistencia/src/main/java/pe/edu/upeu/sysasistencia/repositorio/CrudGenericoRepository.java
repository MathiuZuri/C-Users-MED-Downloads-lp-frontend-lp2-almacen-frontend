package pe.edu.upeu.sysasistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudGenericoRepository<T,ID> extends JpaRepository<T,ID> {

}
