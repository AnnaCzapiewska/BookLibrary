package booklibraryapplication.webapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Library {
    private List<Book> items;

    public List<Book> getItems() {
        return items;
    }

    public void setItems(List<Book> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getItems()+"\n");
        return sb.toString();
    }
}


