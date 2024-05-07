package modulo1Sena.modulo1.Service.ObjetoT;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modulo1Sena.modulo1.IRepository.ObjetoT.IObjetoTRepository;
import modulo1Sena.modulo1.IService.ObjetoT.IObjetoTService;
import modulo1Sena.modulo1.Utils.GlobalConstants;



@Service
public abstract class objetoTService<T> implements IObjetoTService<T>{
	@Autowired 
	private IObjetoTRepository<T,Long> repository;

	@Override
	public List<T> all() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<T> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public T save(T objeto) {
		// TODO Auto-generated method stub
		return repository.save(objeto);
	}

	@Override
	public void update(Long id, T objeto) throws Exception {
		// TODO Auto-generated method stub
		Optional<T> optionalObjeto = this.repository.findById(id);

        if (optionalObjeto.isEmpty()) {
            throw new Exception("Ha ocurrido un error");
        }

        T objetoToUpdate = optionalObjeto.get();
        BeanUtils.copyProperties(objeto, objetoToUpdate, GlobalConstants.EXCLUDED_FIELDS.toArray(new String[0]));

        this.repository.save(objetoToUpdate);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<T> findByEstadoTrue() {
		
		// TODO Auto-generated method stub
		return repository.findByStateTrue();
	}

}
