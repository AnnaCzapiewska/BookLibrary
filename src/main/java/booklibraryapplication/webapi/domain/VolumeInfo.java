package booklibraryapplication.webapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VolumeInfo {




    private List<IndustryIdentifiers> industryIdentifiers;
    private String title;
    private String subtitle;
    private String publisher;
    private String publishedDate;
    private String description;
    private ImageLinks imageLinks;
    private int pageCount;
    private String language;
    private String previewLink;
    private double averageRating;
    private List<String> authors;
    private List<String> categories;


    public List<IndustryIdentifiers> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifiers> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ISBN = " + getIndustryIdentifiers() +"\n" );
        sb.append("TITLE = " + getTitle()+"\n" + "<br/>");
        sb.append("SUBTITLE = " + getSubtitle()+"\n" + "<br/>");
        sb.append("PUBLISHER = " + getPublisher()+"\n" + "<br/>");
        sb.append("PUBLISHED_DATE = " + getPublishedDate() + "\n" +"<br/>");
        sb.append("DESCRIPTION = " + getDescription()+"\n" + "<br/>");
        sb.append("PAGE_COUNT = " + getPageCount()+"\n" + "<br/>");
        sb.append( getImageLinks()+"\n" );
        sb.append("LANGUAGE = " + getLanguage() + "\n" + "<br/>");
        sb.append("PREVIEW_LINK = " + getPreviewLink()+ "\n" + "<br/>");
        sb.append("AVERANGE_RATING = " + getAverageRating() + "\n" + "<br/>");
        sb.append("AUTHORS = " + getAuthors() + "\n" + "<br/>");
        sb.append("CATEGORIES = " + getCategories() + "\n" + "<br/>");
        return sb.toString();

    }





}
