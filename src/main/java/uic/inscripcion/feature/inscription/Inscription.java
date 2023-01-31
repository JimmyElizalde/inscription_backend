package uic.inscripcion.feature.inscription;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table("inscripcion")
public class Inscription {
    @Id
    @Column("id")
    private long Id;
    private String tipo_solicitud;
    private String estado; 
}
