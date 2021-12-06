package vn.sesgroup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NavbarVNPTIDC")
public class NavbarVNPTIDC {

    @Id
    private String id;
    private String title;

    public NavbarVNPTIDC(){}

    public NavbarVNPTIDC(NavbarVNPTIDC navbarVNPTIDC){
        this.id = navbarVNPTIDC.id;
        this.title = navbarVNPTIDC.title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
