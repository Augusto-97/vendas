package com.vendas.api.repositories;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
 
import com.vendas.api.entities.Vendedor;
 
public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {
 
   	@Transactional(readOnly = true)
   	Vendedor findById(int id);
 
}
