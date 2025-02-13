package mas.arnau.gestionPersonal.model.permisos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("dias")
public class Dias {

    @Id
    private String id;    // MongoDB generará automáticamente el ObjectId
    private String dni;
    private List<Permiso> listaPermisos;
    private List<Adicional> listaAdicionales;
    private List<DPP> listaDPP;
}
