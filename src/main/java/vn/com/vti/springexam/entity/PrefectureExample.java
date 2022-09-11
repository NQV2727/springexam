package vn.com.vti.springexam.entity;

import java.util.ArrayList;
import java.util.List;

public class PrefectureExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public PrefectureExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andSection3IdIsNull() {
            addCriterion("section3_id is null");
            return (Criteria) this;
        }

        public Criteria andSection3IdIsNotNull() {
            addCriterion("section3_id is not null");
            return (Criteria) this;
        }

        public Criteria andSection3IdEqualTo(Integer value) {
            addCriterion("section3_id =", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdNotEqualTo(Integer value) {
            addCriterion("section3_id <>", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdGreaterThan(Integer value) {
            addCriterion("section3_id >", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section3_id >=", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdLessThan(Integer value) {
            addCriterion("section3_id <", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdLessThanOrEqualTo(Integer value) {
            addCriterion("section3_id <=", value, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdIn(List<Integer> values) {
            addCriterion("section3_id in", values, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdNotIn(List<Integer> values) {
            addCriterion("section3_id not in", values, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdBetween(Integer value1, Integer value2) {
            addCriterion("section3_id between", value1, value2, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection3IdNotBetween(Integer value1, Integer value2) {
            addCriterion("section3_id not between", value1, value2, "section3Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdIsNull() {
            addCriterion("section8_id is null");
            return (Criteria) this;
        }

        public Criteria andSection8IdIsNotNull() {
            addCriterion("section8_id is not null");
            return (Criteria) this;
        }

        public Criteria andSection8IdEqualTo(Integer value) {
            addCriterion("section8_id =", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdNotEqualTo(Integer value) {
            addCriterion("section8_id <>", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdGreaterThan(Integer value) {
            addCriterion("section8_id >", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section8_id >=", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdLessThan(Integer value) {
            addCriterion("section8_id <", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdLessThanOrEqualTo(Integer value) {
            addCriterion("section8_id <=", value, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdIn(List<Integer> values) {
            addCriterion("section8_id in", values, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdNotIn(List<Integer> values) {
            addCriterion("section8_id not in", values, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdBetween(Integer value1, Integer value2) {
            addCriterion("section8_id between", value1, value2, "section8Id");
            return (Criteria) this;
        }

        public Criteria andSection8IdNotBetween(Integer value1, Integer value2) {
            addCriterion("section8_id not between", value1, value2, "section8Id");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityIsNull() {
            addCriterion("is_government_designed_city is null");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityIsNotNull() {
            addCriterion("is_government_designed_city is not null");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityEqualTo(Boolean value) {
            addCriterion("is_government_designed_city =", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityNotEqualTo(Boolean value) {
            addCriterion("is_government_designed_city <>", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityGreaterThan(Boolean value) {
            addCriterion("is_government_designed_city >", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_government_designed_city >=", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityLessThan(Boolean value) {
            addCriterion("is_government_designed_city <", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityLessThanOrEqualTo(Boolean value) {
            addCriterion("is_government_designed_city <=", value, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityIn(List<Boolean> values) {
            addCriterion("is_government_designed_city in", values, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityNotIn(List<Boolean> values) {
            addCriterion("is_government_designed_city not in", values, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityBetween(Boolean value1, Boolean value2) {
            addCriterion("is_government_designed_city between", value1, value2, "isGovernmentDesignedCity");
            return (Criteria) this;
        }

        public Criteria andIsGovernmentDesignedCityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_government_designed_city not between", value1, value2, "isGovernmentDesignedCity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prefecture
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 10 16:11:16 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 10 16:11:16 JST 2022
     */
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