package com.vendas.api.repositories;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
 
import com.vendas.api.entities.Vendas;
 
@Transactional(readOnly = true)
public interface VendasRepository extends JpaRepository<Vendas, Integer> {
 
   	@Query("SELECT vd FROM Vendas vd WHERE vd.vendedor.id = :vendedorId")
   	List<Vendas> findByVendedorId(@Param("vededorId") int vendedorId);
 
}
