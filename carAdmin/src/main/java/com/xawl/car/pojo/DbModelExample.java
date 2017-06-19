package com.xawl.car.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DbModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbModelExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andOutputIsNull() {
            addCriterion("output is null");
            return (Criteria) this;
        }

        public Criteria andOutputIsNotNull() {
            addCriterion("output is not null");
            return (Criteria) this;
        }

        public Criteria andOutputEqualTo(String value) {
            addCriterion("output =", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotEqualTo(String value) {
            addCriterion("output <>", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThan(String value) {
            addCriterion("output >", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThanOrEqualTo(String value) {
            addCriterion("output >=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThan(String value) {
            addCriterion("output <", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThanOrEqualTo(String value) {
            addCriterion("output <=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLike(String value) {
            addCriterion("output like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotLike(String value) {
            addCriterion("output not like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputIn(List<String> values) {
            addCriterion("output in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotIn(List<String> values) {
            addCriterion("output not in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputBetween(String value1, String value2) {
            addCriterion("output between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotBetween(String value1, String value2) {
            addCriterion("output not between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andDriveIsNull() {
            addCriterion("drive is null");
            return (Criteria) this;
        }

        public Criteria andDriveIsNotNull() {
            addCriterion("drive is not null");
            return (Criteria) this;
        }

        public Criteria andDriveEqualTo(String value) {
            addCriterion("drive =", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveNotEqualTo(String value) {
            addCriterion("drive <>", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveGreaterThan(String value) {
            addCriterion("drive >", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveGreaterThanOrEqualTo(String value) {
            addCriterion("drive >=", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveLessThan(String value) {
            addCriterion("drive <", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveLessThanOrEqualTo(String value) {
            addCriterion("drive <=", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveLike(String value) {
            addCriterion("drive like", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveNotLike(String value) {
            addCriterion("drive not like", value, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveIn(List<String> values) {
            addCriterion("drive in", values, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveNotIn(List<String> values) {
            addCriterion("drive not in", values, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveBetween(String value1, String value2) {
            addCriterion("drive between", value1, value2, "drive");
            return (Criteria) this;
        }

        public Criteria andDriveNotBetween(String value1, String value2) {
            addCriterion("drive not between", value1, value2, "drive");
            return (Criteria) this;
        }

        public Criteria andFuelIsNull() {
            addCriterion("fuel is null");
            return (Criteria) this;
        }

        public Criteria andFuelIsNotNull() {
            addCriterion("fuel is not null");
            return (Criteria) this;
        }

        public Criteria andFuelEqualTo(String value) {
            addCriterion("fuel =", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotEqualTo(String value) {
            addCriterion("fuel <>", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThan(String value) {
            addCriterion("fuel >", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel >=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThan(String value) {
            addCriterion("fuel <", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThanOrEqualTo(String value) {
            addCriterion("fuel <=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLike(String value) {
            addCriterion("fuel like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotLike(String value) {
            addCriterion("fuel not like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelIn(List<String> values) {
            addCriterion("fuel in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotIn(List<String> values) {
            addCriterion("fuel not in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelBetween(String value1, String value2) {
            addCriterion("fuel between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotBetween(String value1, String value2) {
            addCriterion("fuel not between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andTransmissionIsNull() {
            addCriterion("transmission is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionIsNotNull() {
            addCriterion("transmission is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionEqualTo(String value) {
            addCriterion("transmission =", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotEqualTo(String value) {
            addCriterion("transmission <>", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionGreaterThan(String value) {
            addCriterion("transmission >", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionGreaterThanOrEqualTo(String value) {
            addCriterion("transmission >=", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLessThan(String value) {
            addCriterion("transmission <", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLessThanOrEqualTo(String value) {
            addCriterion("transmission <=", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLike(String value) {
            addCriterion("transmission like", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotLike(String value) {
            addCriterion("transmission not like", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionIn(List<String> values) {
            addCriterion("transmission in", values, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotIn(List<String> values) {
            addCriterion("transmission not in", values, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionBetween(String value1, String value2) {
            addCriterion("transmission between", value1, value2, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotBetween(String value1, String value2) {
            addCriterion("transmission not between", value1, value2, "transmission");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProduceIsNull() {
            addCriterion("produce is null");
            return (Criteria) this;
        }

        public Criteria andProduceIsNotNull() {
            addCriterion("produce is not null");
            return (Criteria) this;
        }

        public Criteria andProduceEqualTo(String value) {
            addCriterion("produce =", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceNotEqualTo(String value) {
            addCriterion("produce <>", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceGreaterThan(String value) {
            addCriterion("produce >", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceGreaterThanOrEqualTo(String value) {
            addCriterion("produce >=", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceLessThan(String value) {
            addCriterion("produce <", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceLessThanOrEqualTo(String value) {
            addCriterion("produce <=", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceLike(String value) {
            addCriterion("produce like", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceNotLike(String value) {
            addCriterion("produce not like", value, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceIn(List<String> values) {
            addCriterion("produce in", values, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceNotIn(List<String> values) {
            addCriterion("produce not in", values, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceBetween(String value1, String value2) {
            addCriterion("produce between", value1, value2, "produce");
            return (Criteria) this;
        }

        public Criteria andProduceNotBetween(String value1, String value2) {
            addCriterion("produce not between", value1, value2, "produce");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("structure is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("structure is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("structure =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("structure <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("structure >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("structure >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("structure <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("structure <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("structure like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("structure not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("structure in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("structure not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("structure between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("structure not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
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

        public Criteria andIshotEqualTo(Integer value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Integer value) {
            addCriterion("isHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Integer value) {
            addCriterion("isHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Integer value) {
            addCriterion("isHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Integer value) {
            addCriterion("isHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Integer> values) {
            addCriterion("isHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Integer> values) {
            addCriterion("isHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Integer value1, Integer value2) {
            addCriterion("isHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Integer value1, Integer value2) {
            addCriterion("isHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIsNull() {
            addCriterion("guidegprice is null");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIsNotNull() {
            addCriterion("guidegprice is not null");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceEqualTo(BigDecimal value) {
            addCriterion("guidegprice =", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotEqualTo(BigDecimal value) {
            addCriterion("guidegprice <>", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceGreaterThan(BigDecimal value) {
            addCriterion("guidegprice >", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guidegprice >=", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceLessThan(BigDecimal value) {
            addCriterion("guidegprice <", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guidegprice <=", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIn(List<BigDecimal> values) {
            addCriterion("guidegprice in", values, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotIn(List<BigDecimal> values) {
            addCriterion("guidegprice not in", values, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guidegprice between", value1, value2, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guidegprice not between", value1, value2, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(BigDecimal value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(BigDecimal value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(BigDecimal value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(BigDecimal value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<BigDecimal> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<BigDecimal> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andMshowimageIsNull() {
            addCriterion("mshowImage is null");
            return (Criteria) this;
        }

        public Criteria andMshowimageIsNotNull() {
            addCriterion("mshowImage is not null");
            return (Criteria) this;
        }

        public Criteria andMshowimageEqualTo(String value) {
            addCriterion("mshowImage =", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageNotEqualTo(String value) {
            addCriterion("mshowImage <>", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageGreaterThan(String value) {
            addCriterion("mshowImage >", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageGreaterThanOrEqualTo(String value) {
            addCriterion("mshowImage >=", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageLessThan(String value) {
            addCriterion("mshowImage <", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageLessThanOrEqualTo(String value) {
            addCriterion("mshowImage <=", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageLike(String value) {
            addCriterion("mshowImage like", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageNotLike(String value) {
            addCriterion("mshowImage not like", value, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageIn(List<String> values) {
            addCriterion("mshowImage in", values, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageNotIn(List<String> values) {
            addCriterion("mshowImage not in", values, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageBetween(String value1, String value2) {
            addCriterion("mshowImage between", value1, value2, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMshowimageNotBetween(String value1, String value2) {
            addCriterion("mshowImage not between", value1, value2, "mshowimage");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNull() {
            addCriterion("mtitle is null");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNotNull() {
            addCriterion("mtitle is not null");
            return (Criteria) this;
        }

        public Criteria andMtitleEqualTo(String value) {
            addCriterion("mtitle =", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotEqualTo(String value) {
            addCriterion("mtitle <>", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThan(String value) {
            addCriterion("mtitle >", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThanOrEqualTo(String value) {
            addCriterion("mtitle >=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThan(String value) {
            addCriterion("mtitle <", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThanOrEqualTo(String value) {
            addCriterion("mtitle <=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLike(String value) {
            addCriterion("mtitle like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotLike(String value) {
            addCriterion("mtitle not like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleIn(List<String> values) {
            addCriterion("mtitle in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotIn(List<String> values) {
            addCriterion("mtitle not in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleBetween(String value1, String value2) {
            addCriterion("mtitle between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotBetween(String value1, String value2) {
            addCriterion("mtitle not between", value1, value2, "mtitle");
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