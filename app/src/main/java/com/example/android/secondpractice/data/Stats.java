
package com.example.android.secondpractice.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("edits")
    @Expose
    private Integer edits;
    @SerializedName("articles")
    @Expose
    private Integer articles;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("users")
    @Expose
    private Integer users;
    @SerializedName("activeUsers")
    @Expose
    private Integer activeUsers;
    @SerializedName("images")
    @Expose
    private Integer images;
    @SerializedName("videos")
    @Expose
    private Integer videos;
    @SerializedName("admins")
    @Expose
    private Integer admins;

    /**
     * 
     * @return
     *     The edits
     */
    public Integer getEdits() {
        return edits;
    }

    /**
     * 
     * @param edits
     *     The edits
     */
    public void setEdits(Integer edits) {
        this.edits = edits;
    }

    /**
     * 
     * @return
     *     The articles
     */
    public Integer getArticles() {
        return articles;
    }

    /**
     * 
     * @param articles
     *     The articles
     */
    public void setArticles(Integer articles) {
        this.articles = articles;
    }

    /**
     * 
     * @return
     *     The pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return
     *     The users
     */
    public Integer getUsers() {
        return users;
    }

    /**
     * 
     * @param users
     *     The users
     */
    public void setUsers(Integer users) {
        this.users = users;
    }

    /**
     * 
     * @return
     *     The activeUsers
     */
    public Integer getActiveUsers() {
        return activeUsers;
    }

    /**
     * 
     * @param activeUsers
     *     The activeUsers
     */
    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Integer getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Integer images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The videos
     */
    public Integer getVideos() {
        return videos;
    }

    /**
     * 
     * @param videos
     *     The videos
     */
    public void setVideos(Integer videos) {
        this.videos = videos;
    }

    /**
     * 
     * @return
     *     The admins
     */
    public Integer getAdmins() {
        return admins;
    }

    /**
     * 
     * @param admins
     *     The admins
     */
    public void setAdmins(Integer admins) {
        this.admins = admins;
    }

}
