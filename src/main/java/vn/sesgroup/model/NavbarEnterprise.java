package vn.sesgroup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NavbarEnterprise")
public class NavbarEnterprise {

    @Id
    private String id;
    private String title;

    public NavbarEnterprise(){}

    public NavbarEnterprise(NavbarEnterprise NavbarEnterprise){
        this.id = NavbarEnterprise.id;
        this.title = NavbarEnterprise.title;
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
