package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbUserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUloginIsNull() {
            addCriterion("ulogin is null");
            return (Criteria) this;
        }

        public Criteria andUloginIsNotNull() {
            addCriterion("ulogin is not null");
            return (Criteria) this;
        }

        public Criteria andUloginEqualTo(String value) {
            addCriterion("ulogin =", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginNotEqualTo(String value) {
            addCriterion("ulogin <>", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginGreaterThan(String value) {
            addCriterion("ulogin >", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginGreaterThanOrEqualTo(String value) {
            addCriterion("ulogin >=", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginLessThan(String value) {
            addCriterion("ulogin <", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginLessThanOrEqualTo(String value) {
            addCriterion("ulogin <=", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginLike(String value) {
            addCriterion("ulogin like", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginNotLike(String value) {
            addCriterion("ulogin not like", value, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginIn(List<String> values) {
            addCriterion("ulogin in", values, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginNotIn(List<String> values) {
            addCriterion("ulogin not in", values, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginBetween(String value1, String value2) {
            addCriterion("ulogin between", value1, value2, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUloginNotBetween(String value1, String value2) {
            addCriterion("ulogin not between", value1, value2, "ulogin");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNull() {
            addCriterion("uaddress is null");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNotNull() {
            addCriterion("uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUaddressEqualTo(String value) {
            addCriterion("uaddress =", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotEqualTo(String value) {
            addCriterion("uaddress <>", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThan(String value) {
            addCriterion("uaddress >", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThanOrEqualTo(String value) {
            addCriterion("uaddress >=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThan(String value) {
            addCriterion("uaddress <", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThanOrEqualTo(String value) {
            addCriterion("uaddress <=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLike(String value) {
            addCriterion("uaddress like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotLike(String value) {
            addCriterion("uaddress not like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressIn(List<String> values) {
            addCriterion("uaddress in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotIn(List<String> values) {
            addCriterion("uaddress not in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressBetween(String value1, String value2) {
            addCriterion("uaddress between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotBetween(String value1, String value2) {
            addCriterion("uaddress not between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUlongitudeIsNull() {
            addCriterion("ulongitude is null");
            return (Criteria) this;
        }

        public Criteria andUlongitudeIsNotNull() {
            addCriterion("ulongitude is not null");
            return (Criteria) this;
        }

        public Criteria andUlongitudeEqualTo(String value) {
            addCriterion("ulongitude =", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeNotEqualTo(String value) {
            addCriterion("ulongitude <>", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeGreaterThan(String value) {
            addCriterion("ulongitude >", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ulongitude >=", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeLessThan(String value) {
            addCriterion("ulongitude <", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeLessThanOrEqualTo(String value) {
            addCriterion("ulongitude <=", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeLike(String value) {
            addCriterion("ulongitude like", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeNotLike(String value) {
            addCriterion("ulongitude not like", value, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeIn(List<String> values) {
            addCriterion("ulongitude in", values, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeNotIn(List<String> values) {
            addCriterion("ulongitude not in", values, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeBetween(String value1, String value2) {
            addCriterion("ulongitude between", value1, value2, "ulongitude");
            return (Criteria) this;
        }

        public Criteria andUlongitudeNotBetween(String value1, String value2) {
            addCriterion("ulongitude not between", value1, value2, "ulongitude");
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

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUprovinceIsNull() {
            addCriterion("uprovince is null");
            return (Criteria) this;
        }

        public Criteria andUprovinceIsNotNull() {
            addCriterion("uprovince is not null");
            return (Criteria) this;
        }

        public Criteria andUprovinceEqualTo(String value) {
            addCriterion("uprovince =", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceNotEqualTo(String value) {
            addCriterion("uprovince <>", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceGreaterThan(String value) {
            addCriterion("uprovince >", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("uprovince >=", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceLessThan(String value) {
            addCriterion("uprovince <", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceLessThanOrEqualTo(String value) {
            addCriterion("uprovince <=", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceLike(String value) {
            addCriterion("uprovince like", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceNotLike(String value) {
            addCriterion("uprovince not like", value, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceIn(List<String> values) {
            addCriterion("uprovince in", values, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceNotIn(List<String> values) {
            addCriterion("uprovince not in", values, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceBetween(String value1, String value2) {
            addCriterion("uprovince between", value1, value2, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUprovinceNotBetween(String value1, String value2) {
            addCriterion("uprovince not between", value1, value2, "uprovince");
            return (Criteria) this;
        }

        public Criteria andUcityIsNull() {
            addCriterion("ucity is null");
            return (Criteria) this;
        }

        public Criteria andUcityIsNotNull() {
            addCriterion("ucity is not null");
            return (Criteria) this;
        }

        public Criteria andUcityEqualTo(String value) {
            addCriterion("ucity =", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityNotEqualTo(String value) {
            addCriterion("ucity <>", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityGreaterThan(String value) {
            addCriterion("ucity >", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityGreaterThanOrEqualTo(String value) {
            addCriterion("ucity >=", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityLessThan(String value) {
            addCriterion("ucity <", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityLessThanOrEqualTo(String value) {
            addCriterion("ucity <=", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityLike(String value) {
            addCriterion("ucity like", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityNotLike(String value) {
            addCriterion("ucity not like", value, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityIn(List<String> values) {
            addCriterion("ucity in", values, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityNotIn(List<String> values) {
            addCriterion("ucity not in", values, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityBetween(String value1, String value2) {
            addCriterion("ucity between", value1, value2, "ucity");
            return (Criteria) this;
        }

        public Criteria andUcityNotBetween(String value1, String value2) {
            addCriterion("ucity not between", value1, value2, "ucity");
            return (Criteria) this;
        }

        public Criteria andUlatitudeIsNull() {
            addCriterion("ulatitude is null");
            return (Criteria) this;
        }

        public Criteria andUlatitudeIsNotNull() {
            addCriterion("ulatitude is not null");
            return (Criteria) this;
        }

        public Criteria andUlatitudeEqualTo(String value) {
            addCriterion("ulatitude =", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeNotEqualTo(String value) {
            addCriterion("ulatitude <>", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeGreaterThan(String value) {
            addCriterion("ulatitude >", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ulatitude >=", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeLessThan(String value) {
            addCriterion("ulatitude <", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeLessThanOrEqualTo(String value) {
            addCriterion("ulatitude <=", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeLike(String value) {
            addCriterion("ulatitude like", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeNotLike(String value) {
            addCriterion("ulatitude not like", value, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeIn(List<String> values) {
            addCriterion("ulatitude in", values, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeNotIn(List<String> values) {
            addCriterion("ulatitude not in", values, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeBetween(String value1, String value2) {
            addCriterion("ulatitude between", value1, value2, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUlatitudeNotBetween(String value1, String value2) {
            addCriterion("ulatitude not between", value1, value2, "ulatitude");
            return (Criteria) this;
        }

        public Criteria andUdateIsNull() {
            addCriterion("udate is null");
            return (Criteria) this;
        }

        public Criteria andUdateIsNotNull() {
            addCriterion("udate is not null");
            return (Criteria) this;
        }

        public Criteria andUdateEqualTo(Date value) {
            addCriterion("udate =", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotEqualTo(Date value) {
            addCriterion("udate <>", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThan(Date value) {
            addCriterion("udate >", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThanOrEqualTo(Date value) {
            addCriterion("udate >=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThan(Date value) {
            addCriterion("udate <", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThanOrEqualTo(Date value) {
            addCriterion("udate <=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateIn(List<Date> values) {
            addCriterion("udate in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotIn(List<Date> values) {
            addCriterion("udate not in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateBetween(Date value1, Date value2) {
            addCriterion("udate between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotBetween(Date value1, Date value2) {
            addCriterion("udate not between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andUlastloginIsNull() {
            addCriterion("ulastlogin is null");
            return (Criteria) this;
        }

        public Criteria andUlastloginIsNotNull() {
            addCriterion("ulastlogin is not null");
            return (Criteria) this;
        }

        public Criteria andUlastloginEqualTo(String value) {
            addCriterion("ulastlogin =", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotEqualTo(String value) {
            addCriterion("ulastlogin <>", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginGreaterThan(String value) {
            addCriterion("ulastlogin >", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginGreaterThanOrEqualTo(String value) {
            addCriterion("ulastlogin >=", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginLessThan(String value) {
            addCriterion("ulastlogin <", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginLessThanOrEqualTo(String value) {
            addCriterion("ulastlogin <=", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginLike(String value) {
            addCriterion("ulastlogin like", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotLike(String value) {
            addCriterion("ulastlogin not like", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginIn(List<String> values) {
            addCriterion("ulastlogin in", values, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotIn(List<String> values) {
            addCriterion("ulastlogin not in", values, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginBetween(String value1, String value2) {
            addCriterion("ulastlogin between", value1, value2, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotBetween(String value1, String value2) {
            addCriterion("ulastlogin not between", value1, value2, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andUimageIsNull() {
            addCriterion("uimage is null");
            return (Criteria) this;
        }

        public Criteria andUimageIsNotNull() {
            addCriterion("uimage is not null");
            return (Criteria) this;
        }

        public Criteria andUimageEqualTo(String value) {
            addCriterion("uimage =", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotEqualTo(String value) {
            addCriterion("uimage <>", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageGreaterThan(String value) {
            addCriterion("uimage >", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageGreaterThanOrEqualTo(String value) {
            addCriterion("uimage >=", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLessThan(String value) {
            addCriterion("uimage <", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLessThanOrEqualTo(String value) {
            addCriterion("uimage <=", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageLike(String value) {
            addCriterion("uimage like", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotLike(String value) {
            addCriterion("uimage not like", value, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageIn(List<String> values) {
            addCriterion("uimage in", values, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotIn(List<String> values) {
            addCriterion("uimage not in", values, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageBetween(String value1, String value2) {
            addCriterion("uimage between", value1, value2, "uimage");
            return (Criteria) this;
        }

        public Criteria andUimageNotBetween(String value1, String value2) {
            addCriterion("uimage not between", value1, value2, "uimage");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("bid like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("bid not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Short value) {
            addCriterion("isonline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Short value) {
            addCriterion("isonline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Short value) {
            addCriterion("isonline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Short value) {
            addCriterion("isonline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Short value) {
            addCriterion("isonline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Short value) {
            addCriterion("isonline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Short> values) {
            addCriterion("isonline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Short> values) {
            addCriterion("isonline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Short value1, Short value2) {
            addCriterion("isonline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Short value1, Short value2) {
            addCriterion("isonline not between", value1, value2, "isonline");
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