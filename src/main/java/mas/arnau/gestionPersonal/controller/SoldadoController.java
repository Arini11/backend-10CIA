package mas.arnau.gestionPersonal.controller;

import jakarta.servlet.http.HttpServletResponse;
import mas.arnau.gestionPersonal.model.Soldado;
import mas.arnau.gestionPersonal.model.permisos.Dias;
import mas.arnau.gestionPersonal.service.DiasService;
import mas.arnau.gestionPersonal.service.SoldadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
