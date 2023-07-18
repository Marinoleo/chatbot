package practica.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practica.chatbot.entities.Mensajes;

@Repository
public interface MensajesRepository extends JpaRepository<Mensajes,Long> {
}
