package vn.sesgroup.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "footerVNPTLogo")
public class FooterVNPTLogo {
    @Id
    private String id;
    private String link;

    public FooterVNPTLogo(){}

    public FooterVNPTLogo(FooterVNPTLogo footerVNPTLogo){
        this.id = footerVNPTLogo.id;
        this.link = footerVNPTLogo.link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
