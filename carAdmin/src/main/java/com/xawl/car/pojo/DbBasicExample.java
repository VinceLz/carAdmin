package com.xawl.car.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DbBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbBasicExample() {
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

        public Criteria andBasicidIsNull() {
            addCriterion("basicId is null");
            return (Criteria) this;
        }

        public Criteria andBasicidIsNotNull() {
            addCriterion("basicId is not null");
            return (Criteria) this;
        }

        public Criteria andBasicidEqualTo(Integer value) {
            addCriterion("basicId =", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotEqualTo(Integer value) {
            addCriterion("basicId <>", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThan(Integer value) {
            addCriterion("basicId >", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basicId >=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThan(Integer value) {
            addCriterion("basicId <", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThanOrEqualTo(Integer value) {
            addCriterion("basicId <=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidIn(List<Integer> values) {
            addCriterion("basicId in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotIn(List<Integer> values) {
            addCriterion("basicId not in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidBetween(Integer value1, Integer value2) {
            addCriterion("basicId between", value1, value2, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotBetween(Integer value1, Integer value2) {
            addCriterion("basicId not between", value1, value2, "basicid");
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

        public Criteria andSubsidyIsNull() {
            addCriterion("subsidy is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyIsNotNull() {
            addCriterion("subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyEqualTo(BigDecimal value) {
            addCriterion("subsidy =", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotEqualTo(BigDecimal value) {
            addCriterion("subsidy <>", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThan(BigDecimal value) {
            addCriterion("subsidy >", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidy >=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThan(BigDecimal value) {
            addCriterion("subsidy <", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidy <=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyIn(List<BigDecimal> values) {
            addCriterion("subsidy in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotIn(List<BigDecimal> values) {
            addCriterion("subsidy not in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidy between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidy not between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIsNull() {
            addCriterion("guidegPrice is null");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIsNotNull() {
            addCriterion("guidegPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceEqualTo(BigDecimal value) {
            addCriterion("guidegPrice =", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotEqualTo(BigDecimal value) {
            addCriterion("guidegPrice <>", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceGreaterThan(BigDecimal value) {
            addCriterion("guidegPrice >", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guidegPrice >=", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceLessThan(BigDecimal value) {
            addCriterion("guidegPrice <", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guidegPrice <=", value, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceIn(List<BigDecimal> values) {
            addCriterion("guidegPrice in", values, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotIn(List<BigDecimal> values) {
            addCriterion("guidegPrice not in", values, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guidegPrice between", value1, value2, "guidegprice");
            return (Criteria) this;
        }

        public Criteria andGuidegpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guidegPrice not between", value1, value2, "guidegprice");
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

        public Criteria andMotorIsNull() {
            addCriterion("motor is null");
            return (Criteria) this;
        }

        public Criteria andMotorIsNotNull() {
            addCriterion("motor is not null");
            return (Criteria) this;
        }

        public Criteria andMotorEqualTo(String value) {
            addCriterion("motor =", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotEqualTo(String value) {
            addCriterion("motor <>", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorGreaterThan(String value) {
            addCriterion("motor >", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorGreaterThanOrEqualTo(String value) {
            addCriterion("motor >=", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLessThan(String value) {
            addCriterion("motor <", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLessThanOrEqualTo(String value) {
            addCriterion("motor <=", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLike(String value) {
            addCriterion("motor like", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotLike(String value) {
            addCriterion("motor not like", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorIn(List<String> values) {
            addCriterion("motor in", values, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotIn(List<String> values) {
            addCriterion("motor not in", values, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorBetween(String value1, String value2) {
            addCriterion("motor between", value1, value2, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotBetween(String value1, String value2) {
            addCriterion("motor not between", value1, value2, "motor");
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

        public Criteria andLWHIsNull() {
            addCriterion("l-w-h is null");
            return (Criteria) this;
        }

        public Criteria andLWHIsNotNull() {
            addCriterion("l-w-h is not null");
            return (Criteria) this;
        }

        public Criteria andLWHEqualTo(String value) {
            addCriterion("l-w-h =", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHNotEqualTo(String value) {
            addCriterion("l-w-h <>", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHGreaterThan(String value) {
            addCriterion("l-w-h >", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHGreaterThanOrEqualTo(String value) {
            addCriterion("l-w-h >=", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHLessThan(String value) {
            addCriterion("l-w-h <", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHLessThanOrEqualTo(String value) {
            addCriterion("l-w-h <=", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHLike(String value) {
            addCriterion("l-w-h like", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHNotLike(String value) {
            addCriterion("l-w-h not like", value, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHIn(List<String> values) {
            addCriterion("l-w-h in", values, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHNotIn(List<String> values) {
            addCriterion("l-w-h not in", values, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHBetween(String value1, String value2) {
            addCriterion("l-w-h between", value1, value2, "lWH");
            return (Criteria) this;
        }

        public Criteria andLWHNotBetween(String value1, String value2) {
            addCriterion("l-w-h not between", value1, value2, "lWH");
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

        public Criteria andMaxspeedIsNull() {
            addCriterion("maxSpeed is null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNotNull() {
            addCriterion("maxSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedEqualTo(String value) {
            addCriterion("maxSpeed =", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotEqualTo(String value) {
            addCriterion("maxSpeed <>", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThan(String value) {
            addCriterion("maxSpeed >", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThanOrEqualTo(String value) {
            addCriterion("maxSpeed >=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThan(String value) {
            addCriterion("maxSpeed <", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThanOrEqualTo(String value) {
            addCriterion("maxSpeed <=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLike(String value) {
            addCriterion("maxSpeed like", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotLike(String value) {
            addCriterion("maxSpeed not like", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIn(List<String> values) {
            addCriterion("maxSpeed in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotIn(List<String> values) {
            addCriterion("maxSpeed not in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedBetween(String value1, String value2) {
            addCriterion("maxSpeed between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotBetween(String value1, String value2) {
            addCriterion("maxSpeed not between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andOfficial0IsNull() {
            addCriterion("official0 is null");
            return (Criteria) this;
        }

        public Criteria andOfficial0IsNotNull() {
            addCriterion("official0 is not null");
            return (Criteria) this;
        }

        public Criteria andOfficial0EqualTo(String value) {
            addCriterion("official0 =", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0NotEqualTo(String value) {
            addCriterion("official0 <>", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0GreaterThan(String value) {
            addCriterion("official0 >", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0GreaterThanOrEqualTo(String value) {
            addCriterion("official0 >=", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0LessThan(String value) {
            addCriterion("official0 <", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0LessThanOrEqualTo(String value) {
            addCriterion("official0 <=", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0Like(String value) {
            addCriterion("official0 like", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0NotLike(String value) {
            addCriterion("official0 not like", value, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0In(List<String> values) {
            addCriterion("official0 in", values, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0NotIn(List<String> values) {
            addCriterion("official0 not in", values, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0Between(String value1, String value2) {
            addCriterion("official0 between", value1, value2, "official0");
            return (Criteria) this;
        }

        public Criteria andOfficial0NotBetween(String value1, String value2) {
            addCriterion("official0 not between", value1, value2, "official0");
            return (Criteria) this;
        }

        public Criteria andReality100IsNull() {
            addCriterion("reality100 is null");
            return (Criteria) this;
        }

        public Criteria andReality100IsNotNull() {
            addCriterion("reality100 is not null");
            return (Criteria) this;
        }

        public Criteria andReality100EqualTo(String value) {
            addCriterion("reality100 =", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100NotEqualTo(String value) {
            addCriterion("reality100 <>", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100GreaterThan(String value) {
            addCriterion("reality100 >", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100GreaterThanOrEqualTo(String value) {
            addCriterion("reality100 >=", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100LessThan(String value) {
            addCriterion("reality100 <", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100LessThanOrEqualTo(String value) {
            addCriterion("reality100 <=", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100Like(String value) {
            addCriterion("reality100 like", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100NotLike(String value) {
            addCriterion("reality100 not like", value, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100In(List<String> values) {
            addCriterion("reality100 in", values, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100NotIn(List<String> values) {
            addCriterion("reality100 not in", values, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100Between(String value1, String value2) {
            addCriterion("reality100 between", value1, value2, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality100NotBetween(String value1, String value2) {
            addCriterion("reality100 not between", value1, value2, "reality100");
            return (Criteria) this;
        }

        public Criteria andReality0IsNull() {
            addCriterion("reality0 is null");
            return (Criteria) this;
        }

        public Criteria andReality0IsNotNull() {
            addCriterion("reality0 is not null");
            return (Criteria) this;
        }

        public Criteria andReality0EqualTo(String value) {
            addCriterion("reality0 =", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0NotEqualTo(String value) {
            addCriterion("reality0 <>", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0GreaterThan(String value) {
            addCriterion("reality0 >", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0GreaterThanOrEqualTo(String value) {
            addCriterion("reality0 >=", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0LessThan(String value) {
            addCriterion("reality0 <", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0LessThanOrEqualTo(String value) {
            addCriterion("reality0 <=", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0Like(String value) {
            addCriterion("reality0 like", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0NotLike(String value) {
            addCriterion("reality0 not like", value, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0In(List<String> values) {
            addCriterion("reality0 in", values, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0NotIn(List<String> values) {
            addCriterion("reality0 not in", values, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0Between(String value1, String value2) {
            addCriterion("reality0 between", value1, value2, "reality0");
            return (Criteria) this;
        }

        public Criteria andReality0NotBetween(String value1, String value2) {
            addCriterion("reality0 not between", value1, value2, "reality0");
            return (Criteria) this;
        }

        public Criteria andOilwearIsNull() {
            addCriterion("oilWear is null");
            return (Criteria) this;
        }

        public Criteria andOilwearIsNotNull() {
            addCriterion("oilWear is not null");
            return (Criteria) this;
        }

        public Criteria andOilwearEqualTo(String value) {
            addCriterion("oilWear =", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearNotEqualTo(String value) {
            addCriterion("oilWear <>", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearGreaterThan(String value) {
            addCriterion("oilWear >", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearGreaterThanOrEqualTo(String value) {
            addCriterion("oilWear >=", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearLessThan(String value) {
            addCriterion("oilWear <", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearLessThanOrEqualTo(String value) {
            addCriterion("oilWear <=", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearLike(String value) {
            addCriterion("oilWear like", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearNotLike(String value) {
            addCriterion("oilWear not like", value, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearIn(List<String> values) {
            addCriterion("oilWear in", values, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearNotIn(List<String> values) {
            addCriterion("oilWear not in", values, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearBetween(String value1, String value2) {
            addCriterion("oilWear between", value1, value2, "oilwear");
            return (Criteria) this;
        }

        public Criteria andOilwearNotBetween(String value1, String value2) {
            addCriterion("oilWear not between", value1, value2, "oilwear");
            return (Criteria) this;
        }

        public Criteria andColligateoilIsNull() {
            addCriterion("colligateOil is null");
            return (Criteria) this;
        }

        public Criteria andColligateoilIsNotNull() {
            addCriterion("colligateOil is not null");
            return (Criteria) this;
        }

        public Criteria andColligateoilEqualTo(String value) {
            addCriterion("colligateOil =", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilNotEqualTo(String value) {
            addCriterion("colligateOil <>", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilGreaterThan(String value) {
            addCriterion("colligateOil >", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilGreaterThanOrEqualTo(String value) {
            addCriterion("colligateOil >=", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilLessThan(String value) {
            addCriterion("colligateOil <", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilLessThanOrEqualTo(String value) {
            addCriterion("colligateOil <=", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilLike(String value) {
            addCriterion("colligateOil like", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilNotLike(String value) {
            addCriterion("colligateOil not like", value, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilIn(List<String> values) {
            addCriterion("colligateOil in", values, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilNotIn(List<String> values) {
            addCriterion("colligateOil not in", values, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilBetween(String value1, String value2) {
            addCriterion("colligateOil between", value1, value2, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andColligateoilNotBetween(String value1, String value2) {
            addCriterion("colligateOil not between", value1, value2, "colligateoil");
            return (Criteria) this;
        }

        public Criteria andRealitygapIsNull() {
            addCriterion("realityGap is null");
            return (Criteria) this;
        }

        public Criteria andRealitygapIsNotNull() {
            addCriterion("realityGap is not null");
            return (Criteria) this;
        }

        public Criteria andRealitygapEqualTo(String value) {
            addCriterion("realityGap =", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapNotEqualTo(String value) {
            addCriterion("realityGap <>", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapGreaterThan(String value) {
            addCriterion("realityGap >", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapGreaterThanOrEqualTo(String value) {
            addCriterion("realityGap >=", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapLessThan(String value) {
            addCriterion("realityGap <", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapLessThanOrEqualTo(String value) {
            addCriterion("realityGap <=", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapLike(String value) {
            addCriterion("realityGap like", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapNotLike(String value) {
            addCriterion("realityGap not like", value, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapIn(List<String> values) {
            addCriterion("realityGap in", values, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapNotIn(List<String> values) {
            addCriterion("realityGap not in", values, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapBetween(String value1, String value2) {
            addCriterion("realityGap between", value1, value2, "realitygap");
            return (Criteria) this;
        }

        public Criteria andRealitygapNotBetween(String value1, String value2) {
            addCriterion("realityGap not between", value1, value2, "realitygap");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNull() {
            addCriterion("warranty is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNotNull() {
            addCriterion("warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(String value) {
            addCriterion("warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(String value) {
            addCriterion("warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(String value) {
            addCriterion("warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(String value) {
            addCriterion("warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(String value) {
            addCriterion("warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(String value) {
            addCriterion("warranty <=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLike(String value) {
            addCriterion("warranty like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotLike(String value) {
            addCriterion("warranty not like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyIn(List<String> values) {
            addCriterion("warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<String> values) {
            addCriterion("warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(String value1, String value2) {
            addCriterion("warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(String value1, String value2) {
            addCriterion("warranty not between", value1, value2, "warranty");
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