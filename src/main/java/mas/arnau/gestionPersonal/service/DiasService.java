package mas.arnau.gestionPersonal.service;

import mas.arnau.gestionPersonal.model.permisos.Dias;
import mas.arnau.gestionPersonal.repository.DiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiasService {
    private DiasRepository diasRepository;

    @Autowired
    public DiasService(DiasRepository diasRepository) {
        this.diasRepository = diasRepository;
    }

    public List<Dias> getAll() {
        return diasRepository.findAll();
    }
}
