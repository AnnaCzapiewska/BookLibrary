package booklibraryapplication.webapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageLinks {
    private String thumbnail;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("THUMBNAIL_URL = " + getThumbnail()+"\n" + "<br/>");
        return sb.toString();
    }

}
