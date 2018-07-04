package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class RsCategoryMultiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsCategoryMultiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMultiIdIsNull() {
            addCriterion("multi_id is null");
            return (Criteria) this;
        }

        public Criteria andMultiIdIsNotNull() {
            addCriterion("multi_id is not null");
            return (Criteria) this;
        }

        public Criteria andMultiIdEqualTo(Integer value) {
            addCriterion("multi_id =", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdNotEqualTo(Integer value) {
            addCriterion("multi_id <>", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdGreaterThan(Integer value) {
            addCriterion("multi_id >", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("multi_id >=", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdLessThan(Integer value) {
            addCriterion("multi_id <", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdLessThanOrEqualTo(Integer value) {
            addCriterion("multi_id <=", value, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdIn(List<Integer> values) {
            addCriterion("multi_id in", values, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdNotIn(List<Integer> values) {
            addCriterion("multi_id not in", values, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdBetween(Integer value1, Integer value2) {
            addCriterion("multi_id between", value1, value2, "multiId");
            return (Criteria) this;
        }

        public Criteria andMultiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("multi_id not between", value1, value2, "multiId");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNull() {
            addCriterion("meta_title is null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNotNull() {
            addCriterion("meta_title is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleEqualTo(String value) {
            addCriterion("meta_title =", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotEqualTo(String value) {
            addCriterion("meta_title <>", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThan(String value) {
            addCriterion("meta_title >", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("meta_title >=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThan(String value) {
            addCriterion("meta_title <", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThanOrEqualTo(String value) {
            addCriterion("meta_title <=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLike(String value) {
            addCriterion("meta_title like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotLike(String value) {
            addCriterion("meta_title not like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIn(List<String> values) {
            addCriterion("meta_title in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotIn(List<String> values) {
            addCriterion("meta_title not in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleBetween(String value1, String value2) {
            addCriterion("meta_title between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotBetween(String value1, String value2) {
            addCriterion("meta_title not between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNull() {
            addCriterion("meta_keywords is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNotNull() {
            addCriterion("meta_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsEqualTo(String value) {
            addCriterion("meta_keywords =", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotEqualTo(String value) {
            addCriterion("meta_keywords <>", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThan(String value) {
            addCriterion("meta_keywords >", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("meta_keywords >=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThan(String value) {
            addCriterion("meta_keywords <", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
            addCriterion("meta_keywords <=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLike(String value) {
            addCriterion("meta_keywords like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotLike(String value) {
            addCriterion("meta_keywords not like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIn(List<String> values) {
            addCriterion("meta_keywords in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotIn(List<String> values) {
            addCriterion("meta_keywords not in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsBetween(String value1, String value2) {
            addCriterion("meta_keywords between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
            addCriterion("meta_keywords not between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagIsNull() {
            addCriterion("language_flag is null");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagIsNotNull() {
            addCriterion("language_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagEqualTo(String value) {
            addCriterion("language_flag =", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagNotEqualTo(String value) {
            addCriterion("language_flag <>", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagGreaterThan(String value) {
            addCriterion("language_flag >", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagGreaterThanOrEqualTo(String value) {
            addCriterion("language_flag >=", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagLessThan(String value) {
            addCriterion("language_flag <", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagLessThanOrEqualTo(String value) {
            addCriterion("language_flag <=", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagLike(String value) {
            addCriterion("language_flag like", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagNotLike(String value) {
            addCriterion("language_flag not like", value, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagIn(List<String> values) {
            addCriterion("language_flag in", values, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagNotIn(List<String> values) {
            addCriterion("language_flag not in", values, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagBetween(String value1, String value2) {
            addCriterion("language_flag between", value1, value2, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andLanguageFlagNotBetween(String value1, String value2) {
            addCriterion("language_flag not between", value1, value2, "languageFlag");
            return (Criteria) this;
        }

        public Criteria andAllCatNameIsNull() {
            addCriterion("all_cat_name is null");
            return (Criteria) this;
        }

        public Criteria andAllCatNameIsNotNull() {
            addCriterion("all_cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllCatNameEqualTo(String value) {
            addCriterion("all_cat_name =", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameNotEqualTo(String value) {
            addCriterion("all_cat_name <>", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameGreaterThan(String value) {
            addCriterion("all_cat_name >", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("all_cat_name >=", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameLessThan(String value) {
            addCriterion("all_cat_name <", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameLessThanOrEqualTo(String value) {
            addCriterion("all_cat_name <=", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameLike(String value) {
            addCriterion("all_cat_name like", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameNotLike(String value) {
            addCriterion("all_cat_name not like", value, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameIn(List<String> values) {
            addCriterion("all_cat_name in", values, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameNotIn(List<String> values) {
            addCriterion("all_cat_name not in", values, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameBetween(String value1, String value2) {
            addCriterion("all_cat_name between", value1, value2, "allCatName");
            return (Criteria) this;
        }

        public Criteria andAllCatNameNotBetween(String value1, String value2) {
            addCriterion("all_cat_name not between", value1, value2, "allCatName");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoIsNull() {
            addCriterion("category_description_seo is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoIsNotNull() {
            addCriterion("category_description_seo is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoEqualTo(String value) {
            addCriterion("category_description_seo =", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoNotEqualTo(String value) {
            addCriterion("category_description_seo <>", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoGreaterThan(String value) {
            addCriterion("category_description_seo >", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoGreaterThanOrEqualTo(String value) {
            addCriterion("category_description_seo >=", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoLessThan(String value) {
            addCriterion("category_description_seo <", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoLessThanOrEqualTo(String value) {
            addCriterion("category_description_seo <=", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoLike(String value) {
            addCriterion("category_description_seo like", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoNotLike(String value) {
            addCriterion("category_description_seo not like", value, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoIn(List<String> values) {
            addCriterion("category_description_seo in", values, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoNotIn(List<String> values) {
            addCriterion("category_description_seo not in", values, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoBetween(String value1, String value2) {
            addCriterion("category_description_seo between", value1, value2, "categoryDescriptionSeo");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionSeoNotBetween(String value1, String value2) {
            addCriterion("category_description_seo not between", value1, value2, "categoryDescriptionSeo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}