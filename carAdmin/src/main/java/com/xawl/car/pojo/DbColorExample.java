package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbColorExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("colorId is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorId is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("colorId =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("colorId <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("colorId >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("colorId >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("colorId <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("colorId <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("colorId in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("colorId not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("colorId between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("colorId not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("colorName is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("colorName is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("colorName =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("colorName <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("colorName >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("colorName >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("colorName <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("colorName <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("colorName like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("colorName not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("colorName in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("colorName not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("colorName between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("colorName not between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColorkeyIsNull() {
            addCriterion("colorKey is null");
            return (Criteria) this;
        }

        public Criteria andColorkeyIsNotNull() {
            addCriterion("colorKey is not null");
            return (Criteria) this;
        }

        public Criteria andColorkeyEqualTo(String value) {
            addCriterion("colorKey =", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyNotEqualTo(String value) {
            addCriterion("colorKey <>", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyGreaterThan(String value) {
            addCriterion("colorKey >", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyGreaterThanOrEqualTo(String value) {
            addCriterion("colorKey >=", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyLessThan(String value) {
            addCriterion("colorKey <", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyLessThanOrEqualTo(String value) {
            addCriterion("colorKey <=", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyLike(String value) {
            addCriterion("colorKey like", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyNotLike(String value) {
            addCriterion("colorKey not like", value, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyIn(List<String> values) {
            addCriterion("colorKey in", values, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyNotIn(List<String> values) {
            addCriterion("colorKey not in", values, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyBetween(String value1, String value2) {
            addCriterion("colorKey between", value1, value2, "colorkey");
            return (Criteria) this;
        }

        public Criteria andColorkeyNotBetween(String value1, String value2) {
            addCriterion("colorKey not between", value1, value2, "colorkey");
            return (Criteria) this;
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