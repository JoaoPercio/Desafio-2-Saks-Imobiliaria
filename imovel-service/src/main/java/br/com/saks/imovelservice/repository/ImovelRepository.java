package br.com.saks.imovelservice.repository;

import br.com.saks.imovelservice.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author jrper
 */
public interface ImovelRepository extends JpaRepository<Imovel,Long>{

}
