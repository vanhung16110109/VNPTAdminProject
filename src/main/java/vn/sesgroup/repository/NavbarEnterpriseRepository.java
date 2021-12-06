package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.NavbarEnterprise;

@Repository
public interface NavbarEnterpriseRepository extends MongoRepository<NavbarEnterprise, String> {
}
