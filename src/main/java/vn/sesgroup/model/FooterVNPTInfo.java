package vn.sesgroup.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "footerVNPTInfo")
public class FooterVNPTInfo {
    @Id
    private String id;
    private String title;

    public FooterVNPTInfo(){}

    public FooterVNPTInfo(FooterVNPTInfo footerVNPTInfo){
        this.id = footerVNPTInfo.id;
        this.title = footerVNPTInfo.title;
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
