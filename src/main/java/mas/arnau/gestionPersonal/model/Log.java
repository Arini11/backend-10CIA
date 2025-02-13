package mas.arnau.gestionPersonal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("logs")
public class Log {

    @Id
    private String id;
    private String fechaModificacion;
    private String nombre;
}
