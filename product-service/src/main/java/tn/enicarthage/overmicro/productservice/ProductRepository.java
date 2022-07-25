package tn.enicarthage.overmicro.productservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product , Integer> {

    @Query("select p from Product p where p.name like :name")
    public Page<Product> productByName(@Param("name") String mc
            , Pageable pageable);
}