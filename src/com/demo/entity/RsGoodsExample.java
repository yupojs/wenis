package com.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RsGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsGoodsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdIsNull() {
            addCriterion("url_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdIsNotNull() {
            addCriterion("url_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdEqualTo(Integer value) {
            addCriterion("url_goods_id =", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdNotEqualTo(Integer value) {
            addCriterion("url_goods_id <>", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdGreaterThan(Integer value) {
            addCriterion("url_goods_id >", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_goods_id >=", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdLessThan(Integer value) {
            addCriterion("url_goods_id <", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("url_goods_id <=", value, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdIn(List<Integer> values) {
            addCriterion("url_goods_id in", values, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdNotIn(List<Integer> values) {
            addCriterion("url_goods_id not in", values, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("url_goods_id between", value1, value2, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andUrlGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("url_goods_id not between", value1, value2, "urlGoodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameIsNull() {
            addCriterion("goods_url_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameIsNotNull() {
            addCriterion("goods_url_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameEqualTo(String value) {
            addCriterion("goods_url_name =", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameNotEqualTo(String value) {
            addCriterion("goods_url_name <>", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameGreaterThan(String value) {
            addCriterion("goods_url_name >", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_url_name >=", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameLessThan(String value) {
            addCriterion("goods_url_name <", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameLessThanOrEqualTo(String value) {
            addCriterion("goods_url_name <=", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameLike(String value) {
            addCriterion("goods_url_name like", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameNotLike(String value) {
            addCriterion("goods_url_name not like", value, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameIn(List<String> values) {
            addCriterion("goods_url_name in", values, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameNotIn(List<String> values) {
            addCriterion("goods_url_name not in", values, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameBetween(String value1, String value2) {
            addCriterion("goods_url_name between", value1, value2, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNameNotBetween(String value1, String value2) {
            addCriterion("goods_url_name not between", value1, value2, "goodsUrlName");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andSaleCntIsNull() {
            addCriterion("sale_cnt is null");
            return (Criteria) this;
        }

        public Criteria andSaleCntIsNotNull() {
            addCriterion("sale_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCntEqualTo(Integer value) {
            addCriterion("sale_cnt =", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntNotEqualTo(Integer value) {
            addCriterion("sale_cnt <>", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntGreaterThan(Integer value) {
            addCriterion("sale_cnt >", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_cnt >=", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntLessThan(Integer value) {
            addCriterion("sale_cnt <", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntLessThanOrEqualTo(Integer value) {
            addCriterion("sale_cnt <=", value, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntIn(List<Integer> values) {
            addCriterion("sale_cnt in", values, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntNotIn(List<Integer> values) {
            addCriterion("sale_cnt not in", values, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntBetween(Integer value1, Integer value2) {
            addCriterion("sale_cnt between", value1, value2, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andSaleCntNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_cnt not between", value1, value2, "saleCnt");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(BigDecimal value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(BigDecimal value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(BigDecimal value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(BigDecimal value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<BigDecimal> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<BigDecimal> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIsNull() {
            addCriterion("special_price is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIsNotNull() {
            addCriterion("special_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEqualTo(BigDecimal value) {
            addCriterion("special_price =", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotEqualTo(BigDecimal value) {
            addCriterion("special_price <>", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceGreaterThan(BigDecimal value) {
            addCriterion("special_price >", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("special_price >=", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceLessThan(BigDecimal value) {
            addCriterion("special_price <", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("special_price <=", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIn(List<BigDecimal> values) {
            addCriterion("special_price in", values, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotIn(List<BigDecimal> values) {
            addCriterion("special_price not in", values, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("special_price between", value1, value2, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("special_price not between", value1, value2, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartIsNull() {
            addCriterion("special_price_start is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartIsNotNull() {
            addCriterion("special_price_start is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_start =", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_start <>", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartGreaterThan(Date value) {
            addCriterionForJDBCDate("special_price_start >", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_start >=", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartLessThan(Date value) {
            addCriterionForJDBCDate("special_price_start <", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_start <=", value, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartIn(List<Date> values) {
            addCriterionForJDBCDate("special_price_start in", values, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("special_price_start not in", values, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("special_price_start between", value1, value2, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("special_price_start not between", value1, value2, "specialPriceStart");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndIsNull() {
            addCriterion("special_price_end is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndIsNotNull() {
            addCriterion("special_price_end is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_end =", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_end <>", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndGreaterThan(Date value) {
            addCriterionForJDBCDate("special_price_end >", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_end >=", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndLessThan(Date value) {
            addCriterionForJDBCDate("special_price_end <", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("special_price_end <=", value, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndIn(List<Date> values) {
            addCriterionForJDBCDate("special_price_end in", values, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("special_price_end not in", values, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("special_price_end between", value1, value2, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("special_price_end not between", value1, value2, "specialPriceEnd");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIsNull() {
            addCriterion("goods_thumb is null");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIsNotNull() {
            addCriterion("goods_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbEqualTo(String value) {
            addCriterion("goods_thumb =", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotEqualTo(String value) {
            addCriterion("goods_thumb <>", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbGreaterThan(String value) {
            addCriterion("goods_thumb >", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbGreaterThanOrEqualTo(String value) {
            addCriterion("goods_thumb >=", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLessThan(String value) {
            addCriterion("goods_thumb <", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLessThanOrEqualTo(String value) {
            addCriterion("goods_thumb <=", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbLike(String value) {
            addCriterion("goods_thumb like", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotLike(String value) {
            addCriterion("goods_thumb not like", value, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbIn(List<String> values) {
            addCriterion("goods_thumb in", values, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotIn(List<String> values) {
            addCriterion("goods_thumb not in", values, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbBetween(String value1, String value2) {
            addCriterion("goods_thumb between", value1, value2, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsThumbNotBetween(String value1, String value2) {
            addCriterion("goods_thumb not between", value1, value2, "goodsThumb");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIsNull() {
            addCriterion("original_img is null");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIsNotNull() {
            addCriterion("original_img is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalImgEqualTo(String value) {
            addCriterion("original_img =", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotEqualTo(String value) {
            addCriterion("original_img <>", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgGreaterThan(String value) {
            addCriterion("original_img >", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgGreaterThanOrEqualTo(String value) {
            addCriterion("original_img >=", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLessThan(String value) {
            addCriterion("original_img <", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLessThanOrEqualTo(String value) {
            addCriterion("original_img <=", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgLike(String value) {
            addCriterion("original_img like", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotLike(String value) {
            addCriterion("original_img not like", value, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgIn(List<String> values) {
            addCriterion("original_img in", values, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotIn(List<String> values) {
            addCriterion("original_img not in", values, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgBetween(String value1, String value2) {
            addCriterion("original_img between", value1, value2, "originalImg");
            return (Criteria) this;
        }

        public Criteria andOriginalImgNotBetween(String value1, String value2) {
            addCriterion("original_img not between", value1, value2, "originalImg");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNull() {
            addCriterion("is_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("is_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(Boolean value) {
            addCriterion("is_on_sale =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(Boolean value) {
            addCriterion("is_on_sale <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(Boolean value) {
            addCriterion("is_on_sale >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(Boolean value) {
            addCriterion("is_on_sale <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<Boolean> values) {
            addCriterion("is_on_sale in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<Boolean> values) {
            addCriterion("is_on_sale not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale not between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealIsNull() {
            addCriterion("add_time_real is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealIsNotNull() {
            addCriterion("add_time_real is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealEqualTo(Integer value) {
            addCriterion("add_time_real =", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealNotEqualTo(Integer value) {
            addCriterion("add_time_real <>", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealGreaterThan(Integer value) {
            addCriterion("add_time_real >", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time_real >=", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealLessThan(Integer value) {
            addCriterion("add_time_real <", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealLessThanOrEqualTo(Integer value) {
            addCriterion("add_time_real <=", value, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealIn(List<Integer> values) {
            addCriterion("add_time_real in", values, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealNotIn(List<Integer> values) {
            addCriterion("add_time_real not in", values, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealBetween(Integer value1, Integer value2) {
            addCriterion("add_time_real between", value1, value2, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andAddTimeRealNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time_real not between", value1, value2, "addTimeReal");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeIsNull() {
            addCriterion("first_sale_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeIsNotNull() {
            addCriterion("first_sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeEqualTo(Integer value) {
            addCriterion("first_sale_time =", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeNotEqualTo(Integer value) {
            addCriterion("first_sale_time <>", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeGreaterThan(Integer value) {
            addCriterion("first_sale_time >", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_sale_time >=", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeLessThan(Integer value) {
            addCriterion("first_sale_time <", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("first_sale_time <=", value, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeIn(List<Integer> values) {
            addCriterion("first_sale_time in", values, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeNotIn(List<Integer> values) {
            addCriterion("first_sale_time not in", values, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeBetween(Integer value1, Integer value2) {
            addCriterion("first_sale_time between", value1, value2, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andFirstSaleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("first_sale_time not between", value1, value2, "firstSaleTime");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Integer value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Integer value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Integer value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Integer value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Integer value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Integer> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Integer> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Integer value1, Integer value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Integer value1, Integer value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Integer value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Integer value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Integer value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Integer value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Integer value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Integer> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Integer> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Integer value1, Integer value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(Integer value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(Integer value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(Integer value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(Integer value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(Integer value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<Integer> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<Integer> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(Integer value1, Integer value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Boolean value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Boolean value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Boolean value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Boolean value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Boolean> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Boolean> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughIsNull() {
            addCriterion("is_stock_enough is null");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughIsNotNull() {
            addCriterion("is_stock_enough is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughEqualTo(Boolean value) {
            addCriterion("is_stock_enough =", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughNotEqualTo(Boolean value) {
            addCriterion("is_stock_enough <>", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughGreaterThan(Boolean value) {
            addCriterion("is_stock_enough >", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_stock_enough >=", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughLessThan(Boolean value) {
            addCriterion("is_stock_enough <", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughLessThanOrEqualTo(Boolean value) {
            addCriterion("is_stock_enough <=", value, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughIn(List<Boolean> values) {
            addCriterion("is_stock_enough in", values, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughNotIn(List<Boolean> values) {
            addCriterion("is_stock_enough not in", values, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stock_enough between", value1, value2, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andIsStockEnoughNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stock_enough not between", value1, value2, "isStockEnough");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(String value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(String value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(String value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(String value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(String value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(String value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLike(String value) {
            addCriterion("cost like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotLike(String value) {
            addCriterion("cost not like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<String> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<String> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(String value1, String value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(String value1, String value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIsNull() {
            addCriterion("taobao_url is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIsNotNull() {
            addCriterion("taobao_url is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlEqualTo(String value) {
            addCriterion("taobao_url =", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotEqualTo(String value) {
            addCriterion("taobao_url <>", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlGreaterThan(String value) {
            addCriterion("taobao_url >", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_url >=", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLessThan(String value) {
            addCriterion("taobao_url <", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLessThanOrEqualTo(String value) {
            addCriterion("taobao_url <=", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlLike(String value) {
            addCriterion("taobao_url like", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotLike(String value) {
            addCriterion("taobao_url not like", value, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlIn(List<String> values) {
            addCriterion("taobao_url in", values, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotIn(List<String> values) {
            addCriterion("taobao_url not in", values, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlBetween(String value1, String value2) {
            addCriterion("taobao_url between", value1, value2, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoUrlNotBetween(String value1, String value2) {
            addCriterion("taobao_url not between", value1, value2, "taobaoUrl");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdIsNull() {
            addCriterion("taobao_id is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdIsNotNull() {
            addCriterion("taobao_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdEqualTo(String value) {
            addCriterion("taobao_id =", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdNotEqualTo(String value) {
            addCriterion("taobao_id <>", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdGreaterThan(String value) {
            addCriterion("taobao_id >", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_id >=", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdLessThan(String value) {
            addCriterion("taobao_id <", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdLessThanOrEqualTo(String value) {
            addCriterion("taobao_id <=", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdLike(String value) {
            addCriterion("taobao_id like", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdNotLike(String value) {
            addCriterion("taobao_id not like", value, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdIn(List<String> values) {
            addCriterion("taobao_id in", values, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdNotIn(List<String> values) {
            addCriterion("taobao_id not in", values, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdBetween(String value1, String value2) {
            addCriterion("taobao_id between", value1, value2, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andTaobaoIdNotBetween(String value1, String value2) {
            addCriterion("taobao_id not between", value1, value2, "taobaoId");
            return (Criteria) this;
        }

        public Criteria andIsDoneIsNull() {
            addCriterion("is_done is null");
            return (Criteria) this;
        }

        public Criteria andIsDoneIsNotNull() {
            addCriterion("is_done is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoneEqualTo(Byte value) {
            addCriterion("is_done =", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotEqualTo(Byte value) {
            addCriterion("is_done <>", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneGreaterThan(Byte value) {
            addCriterion("is_done >", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_done >=", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneLessThan(Byte value) {
            addCriterion("is_done <", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneLessThanOrEqualTo(Byte value) {
            addCriterion("is_done <=", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneIn(List<Byte> values) {
            addCriterion("is_done in", values, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotIn(List<Byte> values) {
            addCriterion("is_done not in", values, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneBetween(Byte value1, Byte value2) {
            addCriterion("is_done between", value1, value2, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotBetween(Byte value1, Byte value2) {
            addCriterion("is_done not between", value1, value2, "isDone");
            return (Criteria) this;
        }

        public Criteria andStockbackIsNull() {
            addCriterion("stockback is null");
            return (Criteria) this;
        }

        public Criteria andStockbackIsNotNull() {
            addCriterion("stockback is not null");
            return (Criteria) this;
        }

        public Criteria andStockbackEqualTo(Byte value) {
            addCriterion("stockback =", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackNotEqualTo(Byte value) {
            addCriterion("stockback <>", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackGreaterThan(Byte value) {
            addCriterion("stockback >", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackGreaterThanOrEqualTo(Byte value) {
            addCriterion("stockback >=", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackLessThan(Byte value) {
            addCriterion("stockback <", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackLessThanOrEqualTo(Byte value) {
            addCriterion("stockback <=", value, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackIn(List<Byte> values) {
            addCriterion("stockback in", values, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackNotIn(List<Byte> values) {
            addCriterion("stockback not in", values, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackBetween(Byte value1, Byte value2) {
            addCriterion("stockback between", value1, value2, "stockback");
            return (Criteria) this;
        }

        public Criteria andStockbackNotBetween(Byte value1, Byte value2) {
            addCriterion("stockback not between", value1, value2, "stockback");
            return (Criteria) this;
        }

        public Criteria andIsQueryIsNull() {
            addCriterion("is_query is null");
            return (Criteria) this;
        }

        public Criteria andIsQueryIsNotNull() {
            addCriterion("is_query is not null");
            return (Criteria) this;
        }

        public Criteria andIsQueryEqualTo(Boolean value) {
            addCriterion("is_query =", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryNotEqualTo(Boolean value) {
            addCriterion("is_query <>", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryGreaterThan(Boolean value) {
            addCriterion("is_query >", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_query >=", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryLessThan(Boolean value) {
            addCriterion("is_query <", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryLessThanOrEqualTo(Boolean value) {
            addCriterion("is_query <=", value, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryIn(List<Boolean> values) {
            addCriterion("is_query in", values, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryNotIn(List<Boolean> values) {
            addCriterion("is_query not in", values, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryBetween(Boolean value1, Boolean value2) {
            addCriterion("is_query between", value1, value2, "isQuery");
            return (Criteria) this;
        }

        public Criteria andIsQueryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_query not between", value1, value2, "isQuery");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIsNull() {
            addCriterion("supplier_linkman is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIsNotNull() {
            addCriterion("supplier_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanEqualTo(String value) {
            addCriterion("supplier_linkman =", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotEqualTo(String value) {
            addCriterion("supplier_linkman <>", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanGreaterThan(String value) {
            addCriterion("supplier_linkman >", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_linkman >=", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLessThan(String value) {
            addCriterion("supplier_linkman <", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLessThanOrEqualTo(String value) {
            addCriterion("supplier_linkman <=", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLike(String value) {
            addCriterion("supplier_linkman like", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotLike(String value) {
            addCriterion("supplier_linkman not like", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIn(List<String> values) {
            addCriterion("supplier_linkman in", values, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotIn(List<String> values) {
            addCriterion("supplier_linkman not in", values, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanBetween(String value1, String value2) {
            addCriterion("supplier_linkman between", value1, value2, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotBetween(String value1, String value2) {
            addCriterion("supplier_linkman not between", value1, value2, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckIsNull() {
            addCriterion("isneedcheck is null");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckIsNotNull() {
            addCriterion("isneedcheck is not null");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckEqualTo(Byte value) {
            addCriterion("isneedcheck =", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckNotEqualTo(Byte value) {
            addCriterion("isneedcheck <>", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckGreaterThan(Byte value) {
            addCriterion("isneedcheck >", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("isneedcheck >=", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckLessThan(Byte value) {
            addCriterion("isneedcheck <", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckLessThanOrEqualTo(Byte value) {
            addCriterion("isneedcheck <=", value, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckIn(List<Byte> values) {
            addCriterion("isneedcheck in", values, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckNotIn(List<Byte> values) {
            addCriterion("isneedcheck not in", values, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckBetween(Byte value1, Byte value2) {
            addCriterion("isneedcheck between", value1, value2, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andIsneedcheckNotBetween(Byte value1, Byte value2) {
            addCriterion("isneedcheck not between", value1, value2, "isneedcheck");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkIsNull() {
            addCriterion("goods_mark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkIsNotNull() {
            addCriterion("goods_mark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkEqualTo(Integer value) {
            addCriterion("goods_mark =", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkNotEqualTo(Integer value) {
            addCriterion("goods_mark <>", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkGreaterThan(Integer value) {
            addCriterion("goods_mark >", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_mark >=", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkLessThan(Integer value) {
            addCriterion("goods_mark <", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkLessThanOrEqualTo(Integer value) {
            addCriterion("goods_mark <=", value, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkIn(List<Integer> values) {
            addCriterion("goods_mark in", values, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkNotIn(List<Integer> values) {
            addCriterion("goods_mark not in", values, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkBetween(Integer value1, Integer value2) {
            addCriterion("goods_mark between", value1, value2, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_mark not between", value1, value2, "goodsMark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkIsNull() {
            addCriterion("goods_clickmark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkIsNotNull() {
            addCriterion("goods_clickmark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkEqualTo(Integer value) {
            addCriterion("goods_clickmark =", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkNotEqualTo(Integer value) {
            addCriterion("goods_clickmark <>", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkGreaterThan(Integer value) {
            addCriterion("goods_clickmark >", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_clickmark >=", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkLessThan(Integer value) {
            addCriterion("goods_clickmark <", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkLessThanOrEqualTo(Integer value) {
            addCriterion("goods_clickmark <=", value, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkIn(List<Integer> values) {
            addCriterion("goods_clickmark in", values, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkNotIn(List<Integer> values) {
            addCriterion("goods_clickmark not in", values, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkBetween(Integer value1, Integer value2) {
            addCriterion("goods_clickmark between", value1, value2, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsClickmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_clickmark not between", value1, value2, "goodsClickmark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkIsNull() {
            addCriterion("goods_salemark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkIsNotNull() {
            addCriterion("goods_salemark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkEqualTo(Integer value) {
            addCriterion("goods_salemark =", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkNotEqualTo(Integer value) {
            addCriterion("goods_salemark <>", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkGreaterThan(Integer value) {
            addCriterion("goods_salemark >", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_salemark >=", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkLessThan(Integer value) {
            addCriterion("goods_salemark <", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkLessThanOrEqualTo(Integer value) {
            addCriterion("goods_salemark <=", value, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkIn(List<Integer> values) {
            addCriterion("goods_salemark in", values, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkNotIn(List<Integer> values) {
            addCriterion("goods_salemark not in", values, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkBetween(Integer value1, Integer value2) {
            addCriterion("goods_salemark between", value1, value2, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSalemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_salemark not between", value1, value2, "goodsSalemark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkIsNull() {
            addCriterion("goods_addmark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkIsNotNull() {
            addCriterion("goods_addmark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkEqualTo(Integer value) {
            addCriterion("goods_addmark =", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkNotEqualTo(Integer value) {
            addCriterion("goods_addmark <>", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkGreaterThan(Integer value) {
            addCriterion("goods_addmark >", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_addmark >=", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkLessThan(Integer value) {
            addCriterion("goods_addmark <", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkLessThanOrEqualTo(Integer value) {
            addCriterion("goods_addmark <=", value, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkIn(List<Integer> values) {
            addCriterion("goods_addmark in", values, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkNotIn(List<Integer> values) {
            addCriterion("goods_addmark not in", values, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkBetween(Integer value1, Integer value2) {
            addCriterion("goods_addmark between", value1, value2, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andGoodsAddmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_addmark not between", value1, value2, "goodsAddmark");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankIsNull() {
            addCriterion("is_refreshrank is null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankIsNotNull() {
            addCriterion("is_refreshrank is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankEqualTo(Integer value) {
            addCriterion("is_refreshrank =", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankNotEqualTo(Integer value) {
            addCriterion("is_refreshrank <>", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankGreaterThan(Integer value) {
            addCriterion("is_refreshrank >", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_refreshrank >=", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankLessThan(Integer value) {
            addCriterion("is_refreshrank <", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankLessThanOrEqualTo(Integer value) {
            addCriterion("is_refreshrank <=", value, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankIn(List<Integer> values) {
            addCriterion("is_refreshrank in", values, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankNotIn(List<Integer> values) {
            addCriterion("is_refreshrank not in", values, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankBetween(Integer value1, Integer value2) {
            addCriterion("is_refreshrank between", value1, value2, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andIsRefreshrankNotBetween(Integer value1, Integer value2) {
            addCriterion("is_refreshrank not between", value1, value2, "isRefreshrank");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Integer value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Integer value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Integer value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Integer value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Integer value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Integer> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Integer> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Integer value1, Integer value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andIsDesignIsNull() {
            addCriterion("is_design is null");
            return (Criteria) this;
        }

        public Criteria andIsDesignIsNotNull() {
            addCriterion("is_design is not null");
            return (Criteria) this;
        }

        public Criteria andIsDesignEqualTo(Boolean value) {
            addCriterion("is_design =", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotEqualTo(Boolean value) {
            addCriterion("is_design <>", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignGreaterThan(Boolean value) {
            addCriterion("is_design >", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_design >=", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignLessThan(Boolean value) {
            addCriterion("is_design <", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignLessThanOrEqualTo(Boolean value) {
            addCriterion("is_design <=", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignIn(List<Boolean> values) {
            addCriterion("is_design in", values, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotIn(List<Boolean> values) {
            addCriterion("is_design not in", values, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignBetween(Boolean value1, Boolean value2) {
            addCriterion("is_design between", value1, value2, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_design not between", value1, value2, "isDesign");
            return (Criteria) this;
        }

        public Criteria andGoodsRankIsNull() {
            addCriterion("goods_rank is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRankIsNotNull() {
            addCriterion("goods_rank is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRankEqualTo(BigDecimal value) {
            addCriterion("goods_rank =", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankNotEqualTo(BigDecimal value) {
            addCriterion("goods_rank <>", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankGreaterThan(BigDecimal value) {
            addCriterion("goods_rank >", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_rank >=", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankLessThan(BigDecimal value) {
            addCriterion("goods_rank <", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_rank <=", value, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankIn(List<BigDecimal> values) {
            addCriterion("goods_rank in", values, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankNotIn(List<BigDecimal> values) {
            addCriterion("goods_rank not in", values, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_rank between", value1, value2, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andGoodsRankNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_rank not between", value1, value2, "goodsRank");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerIsNull() {
            addCriterion("maintain_buyer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerIsNotNull() {
            addCriterion("maintain_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerEqualTo(String value) {
            addCriterion("maintain_buyer =", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerNotEqualTo(String value) {
            addCriterion("maintain_buyer <>", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerGreaterThan(String value) {
            addCriterion("maintain_buyer >", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_buyer >=", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerLessThan(String value) {
            addCriterion("maintain_buyer <", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerLessThanOrEqualTo(String value) {
            addCriterion("maintain_buyer <=", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerLike(String value) {
            addCriterion("maintain_buyer like", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerNotLike(String value) {
            addCriterion("maintain_buyer not like", value, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerIn(List<String> values) {
            addCriterion("maintain_buyer in", values, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerNotIn(List<String> values) {
            addCriterion("maintain_buyer not in", values, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerBetween(String value1, String value2) {
            addCriterion("maintain_buyer between", value1, value2, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andMaintainBuyerNotBetween(String value1, String value2) {
            addCriterion("maintain_buyer not between", value1, value2, "maintainBuyer");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIsNull() {
            addCriterion("sku_supplier is null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIsNotNull() {
            addCriterion("sku_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierEqualTo(String value) {
            addCriterion("sku_supplier =", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNotEqualTo(String value) {
            addCriterion("sku_supplier <>", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierGreaterThan(String value) {
            addCriterion("sku_supplier >", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("sku_supplier >=", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierLessThan(String value) {
            addCriterion("sku_supplier <", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierLessThanOrEqualTo(String value) {
            addCriterion("sku_supplier <=", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierLike(String value) {
            addCriterion("sku_supplier like", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNotLike(String value) {
            addCriterion("sku_supplier not like", value, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIn(List<String> values) {
            addCriterion("sku_supplier in", values, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNotIn(List<String> values) {
            addCriterion("sku_supplier not in", values, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierBetween(String value1, String value2) {
            addCriterion("sku_supplier between", value1, value2, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNotBetween(String value1, String value2) {
            addCriterion("sku_supplier not between", value1, value2, "skuSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressIsNull() {
            addCriterion("goods_id_aliexpress is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressIsNotNull() {
            addCriterion("goods_id_aliexpress is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressEqualTo(Long value) {
            addCriterion("goods_id_aliexpress =", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressNotEqualTo(Long value) {
            addCriterion("goods_id_aliexpress <>", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressGreaterThan(Long value) {
            addCriterion("goods_id_aliexpress >", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id_aliexpress >=", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressLessThan(Long value) {
            addCriterion("goods_id_aliexpress <", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressLessThanOrEqualTo(Long value) {
            addCriterion("goods_id_aliexpress <=", value, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressIn(List<Long> values) {
            addCriterion("goods_id_aliexpress in", values, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressNotIn(List<Long> values) {
            addCriterion("goods_id_aliexpress not in", values, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressBetween(Long value1, Long value2) {
            addCriterion("goods_id_aliexpress between", value1, value2, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsIdAliexpressNotBetween(Long value1, Long value2) {
            addCriterion("goods_id_aliexpress not between", value1, value2, "goodsIdAliexpress");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdIsNull() {
            addCriterion("goods_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdIsNotNull() {
            addCriterion("goods_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdEqualTo(String value) {
            addCriterion("goods_relation_id =", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotEqualTo(String value) {
            addCriterion("goods_relation_id <>", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdGreaterThan(String value) {
            addCriterion("goods_relation_id >", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_relation_id >=", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdLessThan(String value) {
            addCriterion("goods_relation_id <", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdLessThanOrEqualTo(String value) {
            addCriterion("goods_relation_id <=", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdLike(String value) {
            addCriterion("goods_relation_id like", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotLike(String value) {
            addCriterion("goods_relation_id not like", value, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdIn(List<String> values) {
            addCriterion("goods_relation_id in", values, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotIn(List<String> values) {
            addCriterion("goods_relation_id not in", values, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdBetween(String value1, String value2) {
            addCriterion("goods_relation_id between", value1, value2, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andGoodsRelationIdNotBetween(String value1, String value2) {
            addCriterion("goods_relation_id not between", value1, value2, "goodsRelationId");
            return (Criteria) this;
        }

        public Criteria andUsInStockIsNull() {
            addCriterion("us_in_stock is null");
            return (Criteria) this;
        }

        public Criteria andUsInStockIsNotNull() {
            addCriterion("us_in_stock is not null");
            return (Criteria) this;
        }

        public Criteria andUsInStockEqualTo(Boolean value) {
            addCriterion("us_in_stock =", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockNotEqualTo(Boolean value) {
            addCriterion("us_in_stock <>", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockGreaterThan(Boolean value) {
            addCriterion("us_in_stock >", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("us_in_stock >=", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockLessThan(Boolean value) {
            addCriterion("us_in_stock <", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockLessThanOrEqualTo(Boolean value) {
            addCriterion("us_in_stock <=", value, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockIn(List<Boolean> values) {
            addCriterion("us_in_stock in", values, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockNotIn(List<Boolean> values) {
            addCriterion("us_in_stock not in", values, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockBetween(Boolean value1, Boolean value2) {
            addCriterion("us_in_stock between", value1, value2, "usInStock");
            return (Criteria) this;
        }

        public Criteria andUsInStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("us_in_stock not between", value1, value2, "usInStock");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageIsNull() {
            addCriterion("goods_color_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageIsNotNull() {
            addCriterion("goods_color_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageEqualTo(String value) {
            addCriterion("goods_color_image =", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageNotEqualTo(String value) {
            addCriterion("goods_color_image <>", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageGreaterThan(String value) {
            addCriterion("goods_color_image >", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_color_image >=", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageLessThan(String value) {
            addCriterion("goods_color_image <", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageLessThanOrEqualTo(String value) {
            addCriterion("goods_color_image <=", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageLike(String value) {
            addCriterion("goods_color_image like", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageNotLike(String value) {
            addCriterion("goods_color_image not like", value, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageIn(List<String> values) {
            addCriterion("goods_color_image in", values, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageNotIn(List<String> values) {
            addCriterion("goods_color_image not in", values, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageBetween(String value1, String value2) {
            addCriterion("goods_color_image between", value1, value2, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andGoodsColorImageNotBetween(String value1, String value2) {
            addCriterion("goods_color_image not between", value1, value2, "goodsColorImage");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockIsNull() {
            addCriterion("is_virtual_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockIsNotNull() {
            addCriterion("is_virtual_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockEqualTo(Boolean value) {
            addCriterion("is_virtual_stock =", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockNotEqualTo(Boolean value) {
            addCriterion("is_virtual_stock <>", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockGreaterThan(Boolean value) {
            addCriterion("is_virtual_stock >", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual_stock >=", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockLessThan(Boolean value) {
            addCriterion("is_virtual_stock <", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual_stock <=", value, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockIn(List<Boolean> values) {
            addCriterion("is_virtual_stock in", values, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockNotIn(List<Boolean> values) {
            addCriterion("is_virtual_stock not in", values, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual_stock between", value1, value2, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andIsVirtualStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual_stock not between", value1, value2, "isVirtualStock");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIsNull() {
            addCriterion("on_sale_status is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIsNotNull() {
            addCriterion("on_sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusEqualTo(Boolean value) {
            addCriterion("on_sale_status =", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotEqualTo(Boolean value) {
            addCriterion("on_sale_status <>", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusGreaterThan(Boolean value) {
            addCriterion("on_sale_status >", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("on_sale_status >=", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusLessThan(Boolean value) {
            addCriterion("on_sale_status <", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("on_sale_status <=", value, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusIn(List<Boolean> values) {
            addCriterion("on_sale_status in", values, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotIn(List<Boolean> values) {
            addCriterion("on_sale_status not in", values, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("on_sale_status between", value1, value2, "onSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOnSaleStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_sale_status not between", value1, value2, "onSaleStatus");
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