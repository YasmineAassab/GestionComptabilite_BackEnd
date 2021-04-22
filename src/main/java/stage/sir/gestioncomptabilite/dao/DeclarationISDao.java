package stage.sir.gestioncomptabilite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stage.sir.gestioncomptabilite.bean.DeclarationIS;
import java.util.List;

@Repository
public interface DeclarationISDao extends JpaRepository<DeclarationIS, Long> {
    DeclarationIS findByAnnee(Integer annee);
    int deleteByAnnee(Integer annee);
    List<DeclarationIS> findBySocieteIce(String ice);
    int deleteBySocieteIce(String ice);
    DeclarationIS findByRef(String ref);
    int deleteByRef(String ref);
}