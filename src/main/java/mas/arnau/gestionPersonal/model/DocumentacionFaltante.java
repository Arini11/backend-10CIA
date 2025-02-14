package mas.arnau.gestionPersonal.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DocumentacionFaltante {
    private String dni;
    private String empleo;
    private String nombre;
    private List<String> listaDocumentacionFaltante;
}
