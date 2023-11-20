package mijael.soa.repository;

import mijael.soa.models.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturacionRepository extends JpaRepository<Facturacion, Integer> {
}
