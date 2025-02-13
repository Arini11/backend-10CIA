package mas.arnau.gestionPersonal.model.permisos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Permiso {

    private String fechaSolicitud;
    private String tipo;
    private String fechaInicio;
    private String fechaFin;
    private String total;
    private String observaciones;
}
