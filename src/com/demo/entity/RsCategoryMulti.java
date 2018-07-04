package com.demo.entity;

public class RsCategoryMulti {
    private Integer multiId;

    private Integer catId;

    private String catName;

    private String metaTitle;

    private String metaKeywords;

    private String languageFlag;

    private String allCatName;

    private String categoryDescriptionSeo;

    public Integer getMultiId() {
        return multiId;
    }

    public void setMultiId(Integer multiId) {
        this.multiId = multiId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public String getLanguageFlag() {
        return languageFlag;
    }

    public void setLanguageFlag(String languageFlag) {
        this.languageFlag = languageFlag == null ? null : languageFlag.trim();
    }

    public String getAllCatName() {
        return allCatName;
    }

    public void setAllCatName(String allCatName) {
        this.allCatName = allCatName == null ? null : allCatName.trim();
    }

    public String getCategoryDescriptionSeo() {
        return categoryDescriptionSeo;
    }

    public void setCategoryDescriptionSeo(String categoryDescriptionSeo) {
        this.categoryDescriptionSeo = categoryDescriptionSeo == null ? null : categoryDescriptionSeo.trim();
    }
}