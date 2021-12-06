package vn.sesgroup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NavbarSolutions")
public class NavbarSolutions {

    @Id
    private String id;
    private String title;

    public NavbarSolutions(){}

    public NavbarSolutions(NavbarSolutions navbarSolutions){
        this.id = navbarSolutions.id;
        this.title = navbarSolutions.title;
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
