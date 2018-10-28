package com.cw.authoritymng.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmUiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmUiExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andUiCodeIsNull() {
            addCriterion("ui_code is null");
            return (Criteria) this;
        }

        public Criteria andUiCodeIsNotNull() {
            addCriterion("ui_code is not null");
            return (Criteria) this;
        }

        public Criteria andUiCodeEqualTo(String value) {
            addCriterion("ui_code =", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeNotEqualTo(String value) {
            addCriterion("ui_code <>", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeGreaterThan(String value) {
            addCriterion("ui_code >", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ui_code >=", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeLessThan(String value) {
            addCriterion("ui_code <", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeLessThanOrEqualTo(String value) {
            addCriterion("ui_code <=", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeLike(String value) {
            addCriterion("ui_code like", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeNotLike(String value) {
            addCriterion("ui_code not like", value, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeIn(List<String> values) {
            addCriterion("ui_code in", values, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeNotIn(List<String> values) {
            addCriterion("ui_code not in", values, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeBetween(String value1, String value2) {
            addCriterion("ui_code between", value1, value2, "uiCode");
            return (Criteria) this;
        }

        public Criteria andUiCodeNotBetween(String value1, String value2) {
            addCriterion("ui_code not between", value1, value2, "uiCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andUiNameIsNull() {
            addCriterion("ui_name is null");
            return (Criteria) this;
        }

        public Criteria andUiNameIsNotNull() {
            addCriterion("ui_name is not null");
            return (Criteria) this;
        }

        public Criteria andUiNameEqualTo(String value) {
            addCriterion("ui_name =", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotEqualTo(String value) {
            addCriterion("ui_name <>", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameGreaterThan(String value) {
            addCriterion("ui_name >", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ui_name >=", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLessThan(String value) {
            addCriterion("ui_name <", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLessThanOrEqualTo(String value) {
            addCriterion("ui_name <=", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLike(String value) {
            addCriterion("ui_name like", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotLike(String value) {
            addCriterion("ui_name not like", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameIn(List<String> values) {
            addCriterion("ui_name in", values, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotIn(List<String> values) {
            addCriterion("ui_name not in", values, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameBetween(String value1, String value2) {
            addCriterion("ui_name between", value1, value2, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotBetween(String value1, String value2) {
            addCriterion("ui_name not between", value1, value2, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiKeyIsNull() {
            addCriterion("ui_key is null");
            return (Criteria) this;
        }

        public Criteria andUiKeyIsNotNull() {
            addCriterion("ui_key is not null");
            return (Criteria) this;
        }

        public Criteria andUiKeyEqualTo(String value) {
            addCriterion("ui_key =", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyNotEqualTo(String value) {
            addCriterion("ui_key <>", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyGreaterThan(String value) {
            addCriterion("ui_key >", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ui_key >=", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyLessThan(String value) {
            addCriterion("ui_key <", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyLessThanOrEqualTo(String value) {
            addCriterion("ui_key <=", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyLike(String value) {
            addCriterion("ui_key like", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyNotLike(String value) {
            addCriterion("ui_key not like", value, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyIn(List<String> values) {
            addCriterion("ui_key in", values, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyNotIn(List<String> values) {
            addCriterion("ui_key not in", values, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyBetween(String value1, String value2) {
            addCriterion("ui_key between", value1, value2, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiKeyNotBetween(String value1, String value2) {
            addCriterion("ui_key not between", value1, value2, "uiKey");
            return (Criteria) this;
        }

        public Criteria andUiTypeIsNull() {
            addCriterion("ui_type is null");
            return (Criteria) this;
        }

        public Criteria andUiTypeIsNotNull() {
            addCriterion("ui_type is not null");
            return (Criteria) this;
        }

        public Criteria andUiTypeEqualTo(Integer value) {
            addCriterion("ui_type =", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeNotEqualTo(Integer value) {
            addCriterion("ui_type <>", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeGreaterThan(Integer value) {
            addCriterion("ui_type >", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ui_type >=", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeLessThan(Integer value) {
            addCriterion("ui_type <", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ui_type <=", value, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeIn(List<Integer> values) {
            addCriterion("ui_type in", values, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeNotIn(List<Integer> values) {
            addCriterion("ui_type not in", values, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeBetween(Integer value1, Integer value2) {
            addCriterion("ui_type between", value1, value2, "uiType");
            return (Criteria) this;
        }

        public Criteria andUiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ui_type not between", value1, value2, "uiType");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUiDescIsNull() {
            addCriterion("ui_desc is null");
            return (Criteria) this;
        }

        public Criteria andUiDescIsNotNull() {
            addCriterion("ui_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUiDescEqualTo(String value) {
            addCriterion("ui_desc =", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotEqualTo(String value) {
            addCriterion("ui_desc <>", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescGreaterThan(String value) {
            addCriterion("ui_desc >", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescGreaterThanOrEqualTo(String value) {
            addCriterion("ui_desc >=", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLessThan(String value) {
            addCriterion("ui_desc <", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLessThanOrEqualTo(String value) {
            addCriterion("ui_desc <=", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLike(String value) {
            addCriterion("ui_desc like", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotLike(String value) {
            addCriterion("ui_desc not like", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescIn(List<String> values) {
            addCriterion("ui_desc in", values, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotIn(List<String> values) {
            addCriterion("ui_desc not in", values, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescBetween(String value1, String value2) {
            addCriterion("ui_desc between", value1, value2, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotBetween(String value1, String value2) {
            addCriterion("ui_desc not between", value1, value2, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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