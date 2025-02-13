package mas.arnau.gestionPersonal.model.permisos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adicional {
    private String fechaGenerado;
    private String fechaConsumido;
    private String motivo;
}
