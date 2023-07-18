package practica.chatbot.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name="mensajes")
public class Mensajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer pages;
    private Double price;
    private LocalDate releasDate;
}
