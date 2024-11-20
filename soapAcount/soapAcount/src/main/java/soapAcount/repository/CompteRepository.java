package soapAcount.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soapAcount.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
