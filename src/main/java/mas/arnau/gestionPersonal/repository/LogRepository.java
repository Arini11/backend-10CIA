package mas.arnau.gestionPersonal.repository;

import mas.arnau.gestionPersonal.model.Log;
import mas.arnau.gestionPersonal.model.Soldado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends MongoRepository<Log, String> {

}
