package mas.arnau.gestionPersonal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mas.arnau.gestionPersonal.model.enums.EstadoCarnet;
import mas.arnau.gestionPersonal.model.enums.TipoCarnet;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Carnet {
    private TipoCarnet tipoCarnet;
    private String fechaCaducidadCarnet;
    private EstadoCarnet estadoCarnet;
}
