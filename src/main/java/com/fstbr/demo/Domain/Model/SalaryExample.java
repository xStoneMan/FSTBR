package com.fstbr.demo.Domain.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(Integer value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(Integer value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(Integer value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(Integer value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(Integer value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<Integer> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<Integer> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(Integer value1, Integer value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNull() {
            addCriterion("from_date is null");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNotNull() {
            addCriterion("from_date is not null");
            return (Criteria) this;
        }

        public Criteria andFromDateEqualTo(Date value) {
            addCriterionForJDBCDate("from_date =", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("from_date <>", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThan(Date value) {
            addCriterionForJDBCDate("from_date >", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("from_date >=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThan(Date value) {
            addCriterionForJDBCDate("from_date <", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("from_date <=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateIn(List<Date> values) {
            addCriterionForJDBCDate("from_date in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("from_date not in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("from_date between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("from_date not between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andToDateIsNull() {
            addCriterion("to_date is null");
            return (Criteria) this;
        }

        public Criteria andToDateIsNotNull() {
            addCriterion("to_date is not null");
            return (Criteria) this;
        }

        public Criteria andToDateEqualTo(Date value) {
            addCriterionForJDBCDate("to_date =", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("to_date <>", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateGreaterThan(Date value) {
            addCriterionForJDBCDate("to_date >", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("to_date >=", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateLessThan(Date value) {
            addCriterionForJDBCDate("to_date <", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("to_date <=", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateIn(List<Date> values) {
            addCriterionForJDBCDate("to_date in", values, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("to_date not in", values, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("to_date between", value1, value2, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("to_date not between", value1, value2, "toDate");
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