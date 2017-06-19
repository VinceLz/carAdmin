package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbMaintainbusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbMaintainbusinessExample() {
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

        public Criteria andMbidIsNull() {
            addCriterion("mbid is null");
            return (Criteria) this;
        }

        public Criteria andMbidIsNotNull() {
            addCriterion("mbid is not null");
            return (Criteria) this;
        }

        public Criteria andMbidEqualTo(Integer value) {
            addCriterion("mbid =", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidNotEqualTo(Integer value) {
            addCriterion("mbid <>", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidGreaterThan(Integer value) {
            addCriterion("mbid >", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mbid >=", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidLessThan(Integer value) {
            addCriterion("mbid <", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidLessThanOrEqualTo(Integer value) {
            addCriterion("mbid <=", value, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidIn(List<Integer> values) {
            addCriterion("mbid in", values, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidNotIn(List<Integer> values) {
            addCriterion("mbid not in", values, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidBetween(Integer value1, Integer value2) {
            addCriterion("mbid between", value1, value2, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbidNotBetween(Integer value1, Integer value2) {
            addCriterion("mbid not between", value1, value2, "mbid");
            return (Criteria) this;
        }

        public Criteria andMbnameIsNull() {
            addCriterion("mbname is null");
            return (Criteria) this;
        }

        public Criteria andMbnameIsNotNull() {
            addCriterion("mbname is not null");
            return (Criteria) this;
        }

        public Criteria andMbnameEqualTo(String value) {
            addCriterion("mbname =", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotEqualTo(String value) {
            addCriterion("mbname <>", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameGreaterThan(String value) {
            addCriterion("mbname >", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameGreaterThanOrEqualTo(String value) {
            addCriterion("mbname >=", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLessThan(String value) {
            addCriterion("mbname <", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLessThanOrEqualTo(String value) {
            addCriterion("mbname <=", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLike(String value) {
            addCriterion("mbname like", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotLike(String value) {
            addCriterion("mbname not like", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameIn(List<String> values) {
            addCriterion("mbname in", values, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotIn(List<String> values) {
            addCriterion("mbname not in", values, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameBetween(String value1, String value2) {
            addCriterion("mbname between", value1, value2, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotBetween(String value1, String value2) {
            addCriterion("mbname not between", value1, value2, "mbname");
            return (Criteria) this;
        }

        public Criteria andBshowimageIsNull() {
            addCriterion("bshowimage is null");
            return (Criteria) this;
        }

        public Criteria andBshowimageIsNotNull() {
            addCriterion("bshowimage is not null");
            return (Criteria) this;
        }

        public Criteria andBshowimageEqualTo(String value) {
            addCriterion("bshowimage =", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotEqualTo(String value) {
            addCriterion("bshowimage <>", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageGreaterThan(String value) {
            addCriterion("bshowimage >", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageGreaterThanOrEqualTo(String value) {
            addCriterion("bshowimage >=", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLessThan(String value) {
            addCriterion("bshowimage <", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLessThanOrEqualTo(String value) {
            addCriterion("bshowimage <=", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageLike(String value) {
            addCriterion("bshowimage like", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotLike(String value) {
            addCriterion("bshowimage not like", value, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageIn(List<String> values) {
            addCriterion("bshowimage in", values, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotIn(List<String> values) {
            addCriterion("bshowimage not in", values, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageBetween(String value1, String value2) {
            addCriterion("bshowimage between", value1, value2, "bshowimage");
            return (Criteria) this;
        }

        public Criteria andBshowimageNotBetween(String value1, String value2) {
            addCriterion("bshowimage not between", value1, value2, "bshowimage");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNull() {
            addCriterion("purchase is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNotNull() {
            addCriterion("purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseEqualTo(Integer value) {
            addCriterion("purchase =", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotEqualTo(Integer value) {
            addCriterion("purchase <>", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThan(Integer value) {
            addCriterion("purchase >", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase >=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThan(Integer value) {
            addCriterion("purchase <", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("purchase <=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIn(List<Integer> values) {
            addCriterion("purchase in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotIn(List<Integer> values) {
            addCriterion("purchase not in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseBetween(Integer value1, Integer value2) {
            addCriterion("purchase between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase not between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentcount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentcount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentcount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentcount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentcount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentcount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentcount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentcount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentcount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentcount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentcount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentcount not between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNull() {
            addCriterion("mpassword is null");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNotNull() {
            addCriterion("mpassword is not null");
            return (Criteria) this;
        }

        public Criteria andMpasswordEqualTo(String value) {
            addCriterion("mpassword =", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotEqualTo(String value) {
            addCriterion("mpassword <>", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThan(String value) {
            addCriterion("mpassword >", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mpassword >=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThan(String value) {
            addCriterion("mpassword <", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThanOrEqualTo(String value) {
            addCriterion("mpassword <=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLike(String value) {
            addCriterion("mpassword like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotLike(String value) {
            addCriterion("mpassword not like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordIn(List<String> values) {
            addCriterion("mpassword in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotIn(List<String> values) {
            addCriterion("mpassword not in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordBetween(String value1, String value2) {
            addCriterion("mpassword between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotBetween(String value1, String value2) {
            addCriterion("mpassword not between", value1, value2, "mpassword");
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