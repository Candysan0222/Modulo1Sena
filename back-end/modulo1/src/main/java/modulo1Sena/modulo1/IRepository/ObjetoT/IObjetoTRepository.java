package modulo1Sena.modulo1.IRepository.ObjetoT;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IObjetoTRepository <T,ID> extends JpaRepository<T,ID> {

	List<T> findByStateTrue();
	
}
