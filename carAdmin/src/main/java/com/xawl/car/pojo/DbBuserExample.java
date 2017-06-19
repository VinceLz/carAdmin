package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbBuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbBuserExample() {
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

        public Criteria andBuidIsNull() {
            addCriterion("buid is null");
            return (Criteria) this;
        }

        public Criteria andBuidIsNotNull() {
            addCriterion("buid is not null");
            return (Criteria) this;
        }

        public Criteria andBuidEqualTo(Integer value) {
            addCriterion("buid =", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidNotEqualTo(Integer value) {
            addCriterion("buid <>", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidGreaterThan(Integer value) {
            addCriterion("buid >", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buid >=", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidLessThan(Integer value) {
            addCriterion("buid <", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidLessThanOrEqualTo(Integer value) {
            addCriterion("buid <=", value, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidIn(List<Integer> values) {
            addCriterion("buid in", values, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidNotIn(List<Integer> values) {
            addCriterion("buid not in", values, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidBetween(Integer value1, Integer value2) {
            addCriterion("buid between", value1, value2, "buid");
            return (Criteria) this;
        }

        public Criteria andBuidNotBetween(Integer value1, Integer value2) {
            addCriterion("buid not between", value1, value2, "buid");
            return (Criteria) this;
        }

        public Criteria andBuserIsNull() {
            addCriterion("buser is null");
            return (Criteria) this;
        }

        public Criteria andBuserIsNotNull() {
            addCriterion("buser is not null");
            return (Criteria) this;
        }

        public Criteria andBuserEqualTo(String value) {
            addCriterion("buser =", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserNotEqualTo(String value) {
            addCriterion("buser <>", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserGreaterThan(String value) {
            addCriterion("buser >", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserGreaterThanOrEqualTo(String value) {
            addCriterion("buser >=", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserLessThan(String value) {
            addCriterion("buser <", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserLessThanOrEqualTo(String value) {
            addCriterion("buser <=", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserLike(String value) {
            addCriterion("buser like", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserNotLike(String value) {
            addCriterion("buser not like", value, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserIn(List<String> values) {
            addCriterion("buser in", values, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserNotIn(List<String> values) {
            addCriterion("buser not in", values, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserBetween(String value1, String value2) {
            addCriterion("buser between", value1, value2, "buser");
            return (Criteria) this;
        }

        public Criteria andBuserNotBetween(String value1, String value2) {
            addCriterion("buser not between", value1, value2, "buser");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNull() {
            addCriterion("bpassword is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNotNull() {
            addCriterion("bpassword is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordEqualTo(String value) {
            addCriterion("bpassword =", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotEqualTo(String value) {
            addCriterion("bpassword <>", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThan(String value) {
            addCriterion("bpassword >", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("bpassword >=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThan(String value) {
            addCriterion("bpassword <", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThanOrEqualTo(String value) {
            addCriterion("bpassword <=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLike(String value) {
            addCriterion("bpassword like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotLike(String value) {
            addCriterion("bpassword not like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordIn(List<String> values) {
            addCriterion("bpassword in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotIn(List<String> values) {
            addCriterion("bpassword not in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordBetween(String value1, String value2) {
            addCriterion("bpassword between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotBetween(String value1, String value2) {
            addCriterion("bpassword not between", value1, value2, "bpassword");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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