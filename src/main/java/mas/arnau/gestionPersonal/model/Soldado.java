package mas.arnau.gestionPersonal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("soldados")
public class Soldado {

    @Id
    private String id;
    // Datos militares
    private String empleoOtan;
    private String empleoAbreviado;
    private String subunidad;
    private String escalafon;
    private String codigoCip;
    private String usuarioDicodef;
    // Datos personales
    private String apellido1;
    private String apellido2;
    private String nombre;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String residenciaHabitual;
    private String parentescoFamiliarContacto;
    private String nombreFamiliarContacto;
    private String telefonoFamiliarContacto;
    private String fechaNacimiento;
    private String grupoSanguineo;
    private String estudiosAcademicos;
    private String perfilIdiomas;
    // Documentación
    private String dni;
    private String fechaCaducidadDni;
    private String tmi;
    private String fechaCaducidadTmi;
    private String pasaporte;
    private String fechaCaducidadPasaporte;
    private String chapaIdentificativa;
    private String cartillaVacunacion;
    private String fechaCaducidadTarjetaSanitariaEuropea;
    private String fechaCaducidadPermisoConducirCivil;
    private String fechaCaducidadPermisoMilitarConducir;
    private String documentacionEnTramite;
    // Carnets
    private List<Carnet> listaCarnets;
    // Recos, TGCF...
    private String tgcf;
    private String puntosTgcf;
    private String recoMedico;
    private String psicotecnico;
    private String psicologico;
    private String odontologico;
    private String testOrina;
    // Cursos
    private String cursoBasicoParaca;
    private String cursoMandoParaca;
    private String cursoAperturaManual;
    private String cursoInstructorTiro;
    private String cursoEscoltaAutoridades;
    private String certificacionSpike;
    private String fset3;
    private String cursoAcuracyBarret;
    private String cursoFortificacion;
    private String cursoFosoTiro;
    private String cursoTiradorSelecto;
    private String cursoTccc;
    private String jornadas4x4;
    private String cursoPilotoDrones;
    private String cursoTransporteSanitario;
    private String cursoManipuladorAlimentos;
    private String cursoSocorrismo;
    private String cursoPlegador;
    private String cursoMonitorEducacionFisica;
    private String cursoRecuperacionAmbiente;
    private String cursoCombateCuerpoCuerpo;
    private String cursoInstructorParacaidista;
    private String cursoCargasLigerasPesadas;
    private String nc1;
    // Saltos
    private String fechaUltimoSalto;
    private String numSaltos;
    private String fechaUltimaCipae;
    private String fechaUltimoSaltoNocturno;
    private String fechaUltimoSaltoExterior;
    private String fechaUltimoSaltoL8;
    private String fechaUltimoSaltoNuevoParacaidas;
    // Otros
    private String HpsNacional;
    private String HpsOtan;
    private String fisan;
    private String padet;

}
