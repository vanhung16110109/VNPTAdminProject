package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.NavbarVNPTIDC;

@Repository
public interface NavbarVNPTIDCRepository extends MongoRepository<NavbarVNPTIDC, String> {
}
