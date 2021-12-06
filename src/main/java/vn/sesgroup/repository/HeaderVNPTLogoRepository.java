package vn.sesgroup.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.FooterVNPTLogo;
import vn.sesgroup.model.HeaderVNPTLogo;

@Repository
public interface HeaderVNPTLogoRepository extends MongoRepository<HeaderVNPTLogo, String> {
}
