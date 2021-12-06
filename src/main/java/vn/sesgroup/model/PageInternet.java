package vn.sesgroup.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PageInternet")
public class PageInternet {

    @Id
    private String id;
    private String nameData;
    private String data;
    private String internetVoice1;
    private String internetVoice2;
    private String internationalMessages;
    private String price;

    public PageInternet(){

    }

    public PageInternet(PageInternet pageInternet){
        this.id = pageInternet.id;
        this.nameData = pageInternet.data;
        this.data = pageInternet.data;
        this.internetVoice1 = pageInternet.internetVoice1;
        this.internetVoice2 = pageInternet.internetVoice2;
        this.internationalMessages = pageInternet.internationalMessages;
        this.price = pageInternet.price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameData() {
        return nameData;
    }

    public void setNameData(String nameData) {
        this.nameData = nameData;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getInternetVoice1() {
        return internetVoice1;
    }

    public void setInternetVoice1(String internetVoice1) {
        this.internetVoice1 = internetVoice1;
    }

    public String getInternetVoice2() {
        return internetVoice2;
    }

    public void setInternetVoice2(String internetVoice2) {
        this.internetVoice2 = internetVoice2;
    }

    public String getInternationalMessages() {
        return internationalMessages;
    }

    public void setInternationalMessages(String internationalMessages) {
        this.internationalMessages = internationalMessages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
