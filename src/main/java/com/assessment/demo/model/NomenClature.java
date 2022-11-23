package com.assessment.demo.model;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "nace")
public class NomenClature {

    @Id
    @Column(name="`Order`")
    private Long order;
    @Column(name="`Level`")
    private int level;
    @Column(name="`Code`")
    private String code;
    @Column(name="`Parent`")
    private String parent;
    @Column(name="`Description`")
    private String description;
    @Column(name="`LongDescription`")
    private String longDescription;

    @Column(name="`ExtraDescription`")
    private String extraDescription;

    @Column(name="`Rulings`")
    private String rulings;

    @Column(name="`Exclusions`")
    private String excludes;

    @Column(name="`Reference`")
    private String reference;

    public NomenClature() {
    }

    public NomenClature(Long order, int level, String code, String parent, String description, String longDescription, String extraDescription, String rulings, String excludes, String reference) {
        this.order = order;
        this.level = level;
        this.code = code;
        this.parent = parent;
        this.description = description;
        this.longDescription = longDescription;
        this.extraDescription = extraDescription;
        this.rulings = rulings;
        this.excludes = excludes;
        this.reference = reference;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getExtraDescription() {
        return extraDescription;
    }

    public void setExtraDescription(String extraDescription) {
        this.extraDescription = extraDescription;
    }

    public String getRulings() {
        return rulings;
    }

    public void setRulings(String rulings) {
        this.rulings = rulings;
    }

    public String getExcludes() {
        return excludes;
    }

    public void setExcludes(String excludes) {
        this.excludes = excludes;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NomenClature that = (NomenClature) o;
        return level == that.level && Objects.equals(order, that.order) && Objects.equals(code, that.code) && Objects.equals(parent, that.parent) && Objects.equals(description, that.description) && Objects.equals(longDescription, that.longDescription) && Objects.equals(extraDescription, that.extraDescription) && Objects.equals(rulings, that.rulings) && Objects.equals(excludes, that.excludes) && Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, level, code, parent, description, longDescription, extraDescription, rulings, excludes, reference);
    }
}