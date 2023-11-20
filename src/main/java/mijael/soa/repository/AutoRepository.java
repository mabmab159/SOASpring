package mijael.soa.repository;

import mijael.soa.models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {
}
