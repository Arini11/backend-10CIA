package mas.arnau.gestionPersonal.repository;

import mas.arnau.gestionPersonal.model.Soldado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SoldadoRepository extends MongoRepository<Soldado, String> {

    Soldado findByDni(String dni);

    @Query(
        "{ '$or': [ " +
                "{ 'dni': null }, { 'dni': '' }, " +
                "{ 'fechaCaducidadDni': null }, { 'fechaCaducidadDni': '' }, " +
                "{ 'tmi': null }, { 'tmi': '' }, " +
                "{ 'fechaCaducidadTmi': null }, { 'fechaCaducidadTmi': '' }, " +
                "{ 'pasaporte': null }, { 'pasaporte': '' }, " +
                "{ 'fechaCaducidadPasaporte': null }, { 'fechaCaducidadPasaporte': '' }, " +
                "{ 'chapaIdentificativa': null }, { 'chapaIdentificativa': '' }, " +
                "{ 'cartillaVacunacion': null }, { 'cartillaVacunacion': '' }, " +
                "{ 'fechaCaducidadTarjetaSanitariaEuropea': null }, { 'fechaCaducidadTarjetaSanitariaEuropea': '' }, " +
                "{ 'fechaCaducidadDni': null }, { 'fechaCaducidadDni': '' }, " +
                "{ 'tmi': null }, { 'tmi': '' }" +
                "] }"
    )
    List<Soldado> findByDocumentacionFaltante();
}
