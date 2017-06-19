package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbBusinessExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNull() {
            addCriterion("baddress is null");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNotNull() {
            addCriterion("baddress is not null");
            return (Criteria) this;
        }

        public Criteria andBaddressEqualTo(String value) {
            addCriterion("baddress =", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotEqualTo(String value) {
            addCriterion("baddress <>", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThan(String value) {
            addCriterion("baddress >", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThanOrEqualTo(String value) {
            addCriterion("baddress >=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThan(String value) {
            addCriterion("baddress <", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThanOrEqualTo(String value) {
            addCriterion("baddress <=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLike(String value) {
            addCriterion("baddress like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotLike(String value) {
            addCriterion("baddress not like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressIn(List<String> values) {
            addCriterion("baddress in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotIn(List<String> values) {
            addCriterion("baddress not in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressBetween(String value1, String value2) {
            addCriterion("baddress between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotBetween(String value1, String value2) {
            addCriterion("baddress not between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterion("bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterion("bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterion("bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterion("bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterion("bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterion("bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterion("bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterion("bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterion("bdate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNull() {
            addCriterion("bphone is null");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNotNull() {
            addCriterion("bphone is not null");
            return (Criteria) this;
        }

        public Criteria andBphoneEqualTo(String value) {
            addCriterion("bphone =", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotEqualTo(String value) {
            addCriterion("bphone <>", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThan(String value) {
            addCriterion("bphone >", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThanOrEqualTo(String value) {
            addCriterion("bphone >=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThan(String value) {
            addCriterion("bphone <", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThanOrEqualTo(String value) {
            addCriterion("bphone <=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLike(String value) {
            addCriterion("bphone like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotLike(String value) {
            addCriterion("bphone not like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneIn(List<String> values) {
            addCriterion("bphone in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotIn(List<String> values) {
            addCriterion("bphone not in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneBetween(String value1, String value2) {
            addCriterion("bphone between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotBetween(String value1, String value2) {
            addCriterion("bphone not between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("isHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("isHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Boolean value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Boolean value) {
            addCriterion("isHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Boolean value) {
            addCriterion("isHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Boolean value) {
            addCriterion("isHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Boolean value) {
            addCriterion("isHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Boolean> values) {
            addCriterion("isHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Boolean> values) {
            addCriterion("isHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Boolean value1, Boolean value2) {
            addCriterion("isHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andMyphoneIsNull() {
            addCriterion("myphone is null");
            return (Criteria) this;
        }

        public Criteria andMyphoneIsNotNull() {
            addCriterion("myphone is not null");
            return (Criteria) this;
        }

        public Criteria andMyphoneEqualTo(String value) {
            addCriterion("myphone =", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotEqualTo(String value) {
            addCriterion("myphone <>", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneGreaterThan(String value) {
            addCriterion("myphone >", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("myphone >=", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLessThan(String value) {
            addCriterion("myphone <", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLessThanOrEqualTo(String value) {
            addCriterion("myphone <=", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLike(String value) {
            addCriterion("myphone like", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotLike(String value) {
            addCriterion("myphone not like", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneIn(List<String> values) {
            addCriterion("myphone in", values, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotIn(List<String> values) {
            addCriterion("myphone not in", values, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneBetween(String value1, String value2) {
            addCriterion("myphone between", value1, value2, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotBetween(String value1, String value2) {
            addCriterion("myphone not between", value1, value2, "myphone");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessIsNull() {
            addCriterion("majorbusiness is null");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessIsNotNull() {
            addCriterion("majorbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessEqualTo(String value) {
            addCriterion("majorbusiness =", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessNotEqualTo(String value) {
            addCriterion("majorbusiness <>", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessGreaterThan(String value) {
            addCriterion("majorbusiness >", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("majorbusiness >=", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessLessThan(String value) {
            addCriterion("majorbusiness <", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessLessThanOrEqualTo(String value) {
            addCriterion("majorbusiness <=", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessLike(String value) {
            addCriterion("majorbusiness like", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessNotLike(String value) {
            addCriterion("majorbusiness not like", value, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessIn(List<String> values) {
            addCriterion("majorbusiness in", values, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessNotIn(List<String> values) {
            addCriterion("majorbusiness not in", values, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessBetween(String value1, String value2) {
            addCriterion("majorbusiness between", value1, value2, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andMajorbusinessNotBetween(String value1, String value2) {
            addCriterion("majorbusiness not between", value1, value2, "majorbusiness");
            return (Criteria) this;
        }

        public Criteria andTitle1IsNull() {
            addCriterion("title1 is null");
            return (Criteria) this;
        }

        public Criteria andTitle1IsNotNull() {
            addCriterion("title1 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle1EqualTo(String value) {
            addCriterion("title1 =", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotEqualTo(String value) {
            addCriterion("title1 <>", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThan(String value) {
            addCriterion("title1 >", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThanOrEqualTo(String value) {
            addCriterion("title1 >=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThan(String value) {
            addCriterion("title1 <", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThanOrEqualTo(String value) {
            addCriterion("title1 <=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1Like(String value) {
            addCriterion("title1 like", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotLike(String value) {
            addCriterion("title1 not like", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1In(List<String> values) {
            addCriterion("title1 in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotIn(List<String> values) {
            addCriterion("title1 not in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1Between(String value1, String value2) {
            addCriterion("title1 between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotBetween(String value1, String value2) {
            addCriterion("title1 not between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andBshowimageIsNull() {
            addCriterion("bshowImage is null");
            return (Criteria) this;
        }

        public Criteria andBshowimageIsNotNull() {
            addCriterion("bshowImage is not null");
            return (Criteria) this;
        }

        public Criteria andBshowimageEqualTo(String value) {
            addCriterion("bshowImage =", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotEqualTo(String value) {
            addCriterion("bshowImage <>", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageGreaterThan(String value) {
            addCriterion("bshowImage >", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageGreaterThanOrEqualTo(String value) {
            addCriterion("bshowImage >=", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLessThan(String value) {
            addCriterion("bshowImage <", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLessThanOrEqualTo(String value) {
            addCriterion("bshowImage <=", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLike(String value) {
            addCriterion("bshowImage like", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotLike(String value) {
            addCriterion("bshowImage not like", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageIn(List<String> values) {
            addCriterion("bshowImage in", values, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotIn(List<String> values) {
            addCriterion("bshowImage not in", values, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageBetween(String value1, String value2) {
            addCriterion("bshowImage between", value1, value2, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotBetween(String value1, String value2) {
            addCriterion("bshowImage not between", value1, value2, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andIsactivityIsNull() {
            addCriterion("isActivity is null");
            return (Criteria) this;
        }

        public Criteria andIsactivityIsNotNull() {
            addCriterion("isActivity is not null");
            return (Criteria) this;
        }

        public Criteria andIsactivityEqualTo(Boolean value) {
            addCriterion("isActivity =", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotEqualTo(Boolean value) {
            addCriterion("isActivity <>", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityGreaterThan(Boolean value) {
            addCriterion("isActivity >", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isActivity >=", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityLessThan(Boolean value) {
            addCriterion("isActivity <", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityLessThanOrEqualTo(Boolean value) {
            addCriterion("isActivity <=", value, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityIn(List<Boolean> values) {
            addCriterion("isActivity in", values, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotIn(List<Boolean> values) {
            addCriterion("isActivity not in", values, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityBetween(Boolean value1, Boolean value2) {
            addCriterion("isActivity between", value1, value2, "isactivity");
            return (Criteria) this;
        }

        public Criteria andIsactivityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isActivity not between", value1, value2, "isactivity");
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