package booklibraryapplication.webapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndustryIdentifiers {
    private String type;

    private String identifier;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIdentifier()+"\n" + "<br/>");
        return sb.toString();
    }

}
