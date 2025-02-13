package mas.arnau.gestionPersonal;

import mas.arnau.gestionPersonal.model.Soldado;
import mas.arnau.gestionPersonal.model.permisos.Dias;
import mas.arnau.gestionPersonal.model.permisos.Permiso;
import mas.arnau.gestionPersonal.repository.DiasRepository;
import mas.arnau.gestionPersonal.repository.SoldadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataLoader {
    @Bean
    CommandLineRunner initDatabase(SoldadoRepository soldadoRepository) {
        return args -> {

            /*
            Dias dias = new Dias();
            dias.setDni("39933791H");
            dias.setListaPermisos(new ArrayList<>(
                Arrays.asList(
                    new Permiso(
                            "07/02/2025",
                            "P",
                            "10/02/2025",
                            "10/02/2025",
                            "1",
                            ""
                    )
                )
            ));


            Soldado s = new Soldado();
            s.setDni("39933791H");
            s.setApellido1("Mas");
            s.setApellido2("Hernández");
            s.setEmpleoAbreviado("SDO");
            // Guardar en la base de datos
            soldadoRepository.save(s);
*/
        };
    }
}
