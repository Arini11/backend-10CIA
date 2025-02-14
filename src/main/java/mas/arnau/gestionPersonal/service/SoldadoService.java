package mas.arnau.gestionPersonal.service;

import mas.arnau.gestionPersonal.model.Log;
import mas.arnau.gestionPersonal.model.Soldado;
import mas.arnau.gestionPersonal.repository.LogRepository;
import mas.arnau.gestionPersonal.repository.SoldadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SoldadoService {
    private SoldadoRepository soldadoRepository;
    private LogRepository logRepository;

    @Autowired
    public SoldadoService(SoldadoRepository soldadoRepository, LogRepository logRepository) {
        this.soldadoRepository = soldadoRepository;
        this.logRepository = logRepository;
    }


    public List<Soldado> getAll() {
        return soldadoRepository.findAll();
    }
    public Soldado findByDni(String dni) {
        return soldadoRepository.findByDni(dni);
    }

    public Soldado update(Soldado soldadoU) {
        if (soldadoRepository.existsById(soldadoU.getId())) {
            SimpleDateFormat formato = new SimpleDateFormat("yyyyMMddHHmm");
            String fechaFormateada = formato.format(new Date());
            logRepository.save(new Log(
                    UUID.randomUUID().toString(),
                    fechaFormateada,
                    soldadoU.getEmpleoAbreviado() + " " +
                            soldadoU.getNombre() + " " +
                            soldadoU.getApellido1() + " " +
                            soldadoU.getApellido2()
                    )
            );
            return soldadoRepository.save(soldadoU);
        } else {
            // no se puedo actualizar, ya existe
            return null;
        }
    }

    public Soldado create(Soldado soldado) {
        Soldado s = soldadoRepository.findByDni(soldado.getDni());
        if (s == null || !s.getDni().equalsIgnoreCase(soldado.getDni())) {
            if(soldado.getId() == null) soldado.setId(UUID.randomUUID().toString());
            return soldadoRepository.save(soldado);
        } else {
            System.out.println("Soldado ya existe");
            return null;
        }
    }

    public List<Soldado> getDocumentacionFaltante() {
        return soldadoRepository.findByDocumentacionFaltante();
    }
}
