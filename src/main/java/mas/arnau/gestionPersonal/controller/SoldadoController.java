package mas.arnau.gestionPersonal.controller;

import jakarta.servlet.http.HttpServletResponse;
import mas.arnau.gestionPersonal.model.DocumentacionFaltante;
import mas.arnau.gestionPersonal.model.Soldado;
import mas.arnau.gestionPersonal.model.permisos.Dias;
import mas.arnau.gestionPersonal.service.DiasService;
import mas.arnau.gestionPersonal.service.SoldadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/soldado")
public class SoldadoController {

    private final SoldadoService soldadoService;

    @Autowired
    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Soldado> getAll(HttpServletResponse response) {
        return soldadoService.getAll();
    }

    @GetMapping("/{dni}")
    public Soldado findByDni(@PathVariable(name = "dni") String dni) {
        return soldadoService.findByDni(dni);
    }

    @PutMapping("/")
    public ResponseEntity<Soldado> updateSoldado(@RequestBody Soldado soldado) {
        Soldado updatedUser = soldadoService.update(soldado);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();  // Return 404 if user not found
        }
    }

    @PostMapping("/")
    public ResponseEntity<Soldado> createSoldado(@RequestBody Soldado soldado) {
        Soldado createdUser = soldadoService.create(soldado);
        if (createdUser != null) {
            return ResponseEntity.ok(createdUser);
        } else {
            return ResponseEntity.notFound().build();  // Return 404 if user not found
        }
    }

    @GetMapping("/documentacionFaltante")
    public List<Soldado> getDocumentacionFaltante() {
        return soldadoService.getDocumentacionFaltante();
    }

    @GetMapping("/documentacionFaltanteV2")
    public List<DocumentacionFaltante> getDocumentacionFaltanteV2() {
        List<DocumentacionFaltante> listaDocFaltante = new ArrayList<>();
        List<Soldado> listaSoldados = soldadoService.getDocumentacionFaltante();
        for (Soldado s : listaSoldados){
            List<String> listaFalta = new ArrayList<>();
            if(s.getDni() == null || s.getDni().isBlank()) listaFalta.add("dni");
            if(s.getFechaCaducidadDni() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadDni");
            if(s.getTmi() == null || s.getDni().isBlank()) listaFalta.add("tmi");
            if(s.getFechaCaducidadTmi() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadTmi");
            if(s.getPasaporte() == null || s.getDni().isBlank()) listaFalta.add("pasaporte");
            if(s.getFechaCaducidadPasaporte() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadPasaporte");
            if(s.getChapaIdentificativa() == null || s.getDni().isBlank()) listaFalta.add("chapaIdentificativa");
            if(s.getCartillaVacunacion() == null || s.getDni().isBlank()) listaFalta.add("cartillaVacunacion");
            if(s.getFechaCaducidadTarjetaSanitariaEuropea() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadTarjetaSanitariaEuropea");
            if(s.getFechaCaducidadPermisoConducirCivil() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadPermisoConducirCivil");
            if(s.getFechaCaducidadPermisoMilitarConducir() == null || s.getDni().isBlank()) listaFalta.add("fechaCaducidadPermisoMilitarConducir");
            if(s.getDocumentacionEnTramite() == null || s.getDni().isBlank()) listaFalta.add("documentacionEnTramite");
            listaDocFaltante.add(new DocumentacionFaltante(
                    s.getDni(),
                    s.getEmpleoAbreviado(),
                    s.getNombreCompleto(),
                    listaFalta
            ));
        }
        return listaDocFaltante;
    }

}
