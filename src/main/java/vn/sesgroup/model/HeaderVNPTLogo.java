package vn.sesgroup.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "headerVNPTLogo")
public class HeaderVNPTLogo {
    @Id
    private String id;
    private String link;

    public HeaderVNPTLogo(){}

    public HeaderVNPTLogo(HeaderVNPTLogo headerVNPTLogo){
        this.id = headerVNPTLogo.id;
        this.link = headerVNPTLogo.link;
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
