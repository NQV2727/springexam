package vn.com.vti.springexam.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberCardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public MemberCardExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
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
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIsNull() {
            addCriterion("member_card_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIsNotNull() {
            addCriterion("member_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdEqualTo(Integer value) {
            addCriterion("member_card_id =", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotEqualTo(Integer value) {
            addCriterion("member_card_id <>", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdGreaterThan(Integer value) {
            addCriterion("member_card_id >", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_card_id >=", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdLessThan(Integer value) {
            addCriterion("member_card_id <", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_card_id <=", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIn(List<Integer> values) {
            addCriterion("member_card_id in", values, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotIn(List<Integer> values) {
            addCriterion("member_card_id not in", values, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdBetween(Integer value1, Integer value2) {
            addCriterion("member_card_id between", value1, value2, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_card_id not between", value1, value2, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdIsNull() {
            addCriterion("card_company_id is null");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdIsNotNull() {
            addCriterion("card_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdEqualTo(String value) {
            addCriterion("card_company_id =", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdNotEqualTo(String value) {
            addCriterion("card_company_id <>", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdGreaterThan(String value) {
            addCriterion("card_company_id >", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_company_id >=", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdLessThan(String value) {
            addCriterion("card_company_id <", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("card_company_id <=", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdLike(String value) {
            addCriterion("card_company_id like", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdNotLike(String value) {
            addCriterion("card_company_id not like", value, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdIn(List<String> values) {
            addCriterion("card_company_id in", values, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdNotIn(List<String> values) {
            addCriterion("card_company_id not in", values, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdBetween(String value1, String value2) {
            addCriterion("card_company_id between", value1, value2, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardCompanyIdNotBetween(String value1, String value2) {
            addCriterion("card_company_id not between", value1, value2, "cardCompanyId");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andExpireYearIsNull() {
            addCriterion("expire_year is null");
            return (Criteria) this;
        }

        public Criteria andExpireYearIsNotNull() {
            addCriterion("expire_year is not null");
            return (Criteria) this;
        }

        public Criteria andExpireYearEqualTo(String value) {
            addCriterion("expire_year =", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotEqualTo(String value) {
            addCriterion("expire_year <>", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearGreaterThan(String value) {
            addCriterion("expire_year >", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearGreaterThanOrEqualTo(String value) {
            addCriterion("expire_year >=", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearLessThan(String value) {
            addCriterion("expire_year <", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearLessThanOrEqualTo(String value) {
            addCriterion("expire_year <=", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearLike(String value) {
            addCriterion("expire_year like", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotLike(String value) {
            addCriterion("expire_year not like", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearIn(List<String> values) {
            addCriterion("expire_year in", values, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotIn(List<String> values) {
            addCriterion("expire_year not in", values, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearBetween(String value1, String value2) {
            addCriterion("expire_year between", value1, value2, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotBetween(String value1, String value2) {
            addCriterion("expire_year not between", value1, value2, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNull() {
            addCriterion("expire_month is null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNotNull() {
            addCriterion("expire_month is not null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthEqualTo(String value) {
            addCriterion("expire_month =", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotEqualTo(String value) {
            addCriterion("expire_month <>", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThan(String value) {
            addCriterion("expire_month >", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThanOrEqualTo(String value) {
            addCriterion("expire_month >=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThan(String value) {
            addCriterion("expire_month <", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThanOrEqualTo(String value) {
            addCriterion("expire_month <=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLike(String value) {
            addCriterion("expire_month like", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotLike(String value) {
            addCriterion("expire_month not like", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIn(List<String> values) {
            addCriterion("expire_month in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotIn(List<String> values) {
            addCriterion("expire_month not in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthBetween(String value1, String value2) {
            addCriterion("expire_month between", value1, value2, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotBetween(String value1, String value2) {
            addCriterion("expire_month not between", value1, value2, "expireMonth");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member_card
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 10 14:28:05 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member_card
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
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