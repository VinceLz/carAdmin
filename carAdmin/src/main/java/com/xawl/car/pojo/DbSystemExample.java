package com.xawl.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbSystemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNull() {
            addCriterion("title2 is null");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNotNull() {
            addCriterion("title2 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle2EqualTo(String value) {
            addCriterion("title2 =", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotEqualTo(String value) {
            addCriterion("title2 <>", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThan(String value) {
            addCriterion("title2 >", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThanOrEqualTo(String value) {
            addCriterion("title2 >=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThan(String value) {
            addCriterion("title2 <", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThanOrEqualTo(String value) {
            addCriterion("title2 <=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Like(String value) {
            addCriterion("title2 like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotLike(String value) {
            addCriterion("title2 not like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2In(List<String> values) {
            addCriterion("title2 in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotIn(List<String> values) {
            addCriterion("title2 not in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Between(String value1, String value2) {
            addCriterion("title2 between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotBetween(String value1, String value2) {
            addCriterion("title2 not between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andStages12IsNull() {
            addCriterion("stages12 is null");
            return (Criteria) this;
        }

        public Criteria andStages12IsNotNull() {
            addCriterion("stages12 is not null");
            return (Criteria) this;
        }

        public Criteria andStages12EqualTo(String value) {
            addCriterion("stages12 =", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12NotEqualTo(String value) {
            addCriterion("stages12 <>", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12GreaterThan(String value) {
            addCriterion("stages12 >", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12GreaterThanOrEqualTo(String value) {
            addCriterion("stages12 >=", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12LessThan(String value) {
            addCriterion("stages12 <", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12LessThanOrEqualTo(String value) {
            addCriterion("stages12 <=", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12Like(String value) {
            addCriterion("stages12 like", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12NotLike(String value) {
            addCriterion("stages12 not like", value, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12In(List<String> values) {
            addCriterion("stages12 in", values, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12NotIn(List<String> values) {
            addCriterion("stages12 not in", values, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12Between(String value1, String value2) {
            addCriterion("stages12 between", value1, value2, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages12NotBetween(String value1, String value2) {
            addCriterion("stages12 not between", value1, value2, "stages12");
            return (Criteria) this;
        }

        public Criteria andStages24IsNull() {
            addCriterion("stages24 is null");
            return (Criteria) this;
        }

        public Criteria andStages24IsNotNull() {
            addCriterion("stages24 is not null");
            return (Criteria) this;
        }

        public Criteria andStages24EqualTo(String value) {
            addCriterion("stages24 =", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24NotEqualTo(String value) {
            addCriterion("stages24 <>", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24GreaterThan(String value) {
            addCriterion("stages24 >", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24GreaterThanOrEqualTo(String value) {
            addCriterion("stages24 >=", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24LessThan(String value) {
            addCriterion("stages24 <", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24LessThanOrEqualTo(String value) {
            addCriterion("stages24 <=", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24Like(String value) {
            addCriterion("stages24 like", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24NotLike(String value) {
            addCriterion("stages24 not like", value, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24In(List<String> values) {
            addCriterion("stages24 in", values, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24NotIn(List<String> values) {
            addCriterion("stages24 not in", values, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24Between(String value1, String value2) {
            addCriterion("stages24 between", value1, value2, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages24NotBetween(String value1, String value2) {
            addCriterion("stages24 not between", value1, value2, "stages24");
            return (Criteria) this;
        }

        public Criteria andStages36IsNull() {
            addCriterion("stages36 is null");
            return (Criteria) this;
        }

        public Criteria andStages36IsNotNull() {
            addCriterion("stages36 is not null");
            return (Criteria) this;
        }

        public Criteria andStages36EqualTo(String value) {
            addCriterion("stages36 =", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36NotEqualTo(String value) {
            addCriterion("stages36 <>", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36GreaterThan(String value) {
            addCriterion("stages36 >", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36GreaterThanOrEqualTo(String value) {
            addCriterion("stages36 >=", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36LessThan(String value) {
            addCriterion("stages36 <", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36LessThanOrEqualTo(String value) {
            addCriterion("stages36 <=", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36Like(String value) {
            addCriterion("stages36 like", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36NotLike(String value) {
            addCriterion("stages36 not like", value, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36In(List<String> values) {
            addCriterion("stages36 in", values, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36NotIn(List<String> values) {
            addCriterion("stages36 not in", values, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36Between(String value1, String value2) {
            addCriterion("stages36 between", value1, value2, "stages36");
            return (Criteria) this;
        }

        public Criteria andStages36NotBetween(String value1, String value2) {
            addCriterion("stages36 not between", value1, value2, "stages36");
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