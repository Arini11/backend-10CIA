package mas.arnau.gestionPersonal.controller;

import jakarta.servlet.http.HttpServletResponse;
import mas.arnau.gestionPersonal.model.permisos.Dias;
import mas.arnau.gestionPersonal.service.DiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/dias")
public class DiasController {

    private final DiasService diasService;

    @Autowired
    public DiasController(DiasService diasService) {
        this.diasService = diasService;
    }

    @GetMapping(path = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dias> getAllDias(HttpServletResponse response) {
        return diasService.getAll();
    }
}
