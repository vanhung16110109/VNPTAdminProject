package vn.sesgroup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.servlet.http.PushBuilder;

@Document(collection = "NavbarInternetTV")
public class NavbarInternetTV {

    @Id
    private String id;
    private String title;

    public NavbarInternetTV(){}

    public NavbarInternetTV(NavbarInternetTV navbarInternetTV){
        this.id = navbarInternetTV.id;
        this.title = navbarInternetTV.title;
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
