package vn.sesgroup.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.FooterVNPTLogo;

@Repository
public interface FooterVNPTLogoRepository extends MongoRepository<FooterVNPTLogo, String> {
}
