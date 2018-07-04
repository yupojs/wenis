package com.demo.entity;

public class RsCategoryMultiWithBLOBs extends RsCategoryMulti {
    private String metaDescription;

    private String catDesc;

    private String attrValuesPart;

    private String attributeTitle;

    private String leftDescription;

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    public String getAttrValuesPart() {
        return attrValuesPart;
    }

    public void setAttrValuesPart(String attrValuesPart) {
        this.attrValuesPart = attrValuesPart == null ? null : attrValuesPart.trim();
    }

    public String getAttributeTitle() {
        return attributeTitle;
    }

    public void setAttributeTitle(String attributeTitle) {
        this.attributeTitle = attributeTitle == null ? null : attributeTitle.trim();
    }

    public String getLeftDescription() {
        return leftDescription;
    }

    public void setLeftDescription(String leftDescription) {
        this.leftDescription = leftDescription == null ? null : leftDescription.trim();
    }
}