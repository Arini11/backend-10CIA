package mas.arnau.gestionPersonal.repository;

import mas.arnau.gestionPersonal.model.permisos.Dias;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DiasRepository extends MongoRepository<Dias, UUID> {

    List<Dias> findByDni(String dni);
}
