package com.worxfr.pojo;

public class BookInfo {
    private String id;

    private String url;

    private String name;

    private String author;

    private Integer typeId;

    private String lastchapter;

    private Integer chaptercount;

    private String chapterlisturl;

    private Integer wordcount;

    private String keywords;

    private Long createtime;

    private Long updatetime;

    private String state;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getLastchapter() {
        return lastchapter;
    }

    public void setLastchapter(String lastchapter) {
        this.lastchapter = lastchapter == null ? null : lastchapter.trim();
    }

    public Integer getChaptercount() {
        return chaptercount;
    }

    public void setChaptercount(Integer chaptercount) {
        this.chaptercount = chaptercount;
    }

    public String getChapterlisturl() {
        return chapterlisturl;
    }

    public void setChapterlisturl(String chapterlisturl) {
        this.chapterlisturl = chapterlisturl == null ? null : chapterlisturl.trim();
    }

    public Integer getWordcount() {
        return wordcount;
    }

    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}