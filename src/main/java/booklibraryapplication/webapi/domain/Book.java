package booklibraryapplication.webapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    private VolumeInfo volumeInfo;

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("************** Book Details **************" + "\n" + "<br/>");
        sb.append(getVolumeInfo()+"\n" + "<br/>");
        return sb.toString();
    }

    public Book() {
    }
}
