
package com.example.android.secondpractice.data;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hub")
    @Expose
    private String hub;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("wordmark")
    @Expose
    private String wordmark;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("topUsers")
    @Expose
    private List<Integer> topUsers = new ArrayList<Integer>();
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("flags")
    @Expose
    private List<Object> flags = new ArrayList<Object>();
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("wam_score")
    @Expose
    private String wamScore;
    @SerializedName("original_dimensions")
    @Expose
    private OriginalDimensions originalDimensions;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The hub
     */
    public String getHub() {
        return hub;
    }

    /**
     * 
     * @param hub
     *     The hub
     */
    public void setHub(String hub) {
        this.hub = hub;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 
     * @param topic
     *     The topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * 
     * @return
     *     The domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain
     *     The domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * 
     * @return
     *     The wordmark
     */
    public String getWordmark() {
        return wordmark;
    }

    /**
     * 
     * @param wordmark
     *     The wordmark
     */
    public void setWordmark(String wordmark) {
        this.wordmark = wordmark;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The topUsers
     */
    public List<Integer> getTopUsers() {
        return topUsers;
    }

    /**
     * 
     * @param topUsers
     *     The topUsers
     */
    public void setTopUsers(List<Integer> topUsers) {
        this.topUsers = topUsers;
    }

    /**
     * 
     * @return
     *     The headline
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * 
     * @param headline
     *     The headline
     */
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    /**
     * 
     * @return
     *     The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public List<Object> getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(List<Object> flags) {
        this.flags = flags;
    }

    /**
     * 
     * @return
     *     The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The wamScore
     */
    public String getWamScore() {
        return wamScore;
    }

    /**
     * 
     * @param wamScore
     *     The wam_score
     */
    public void setWamScore(String wamScore) {
        this.wamScore = wamScore;
    }

    /**
     * 
     * @return
     *     The originalDimensions
     */
    public OriginalDimensions getOriginalDimensions() {
        return originalDimensions;
    }

    /**
     * 
     * @param originalDimensions
     *     The original_dimensions
     */
    public void setOriginalDimensions(OriginalDimensions originalDimensions) {
        this.originalDimensions = originalDimensions;
    }

}
