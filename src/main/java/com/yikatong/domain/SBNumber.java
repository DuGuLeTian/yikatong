package com.yikatong.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A user.
 */
@Entity
@Table(name = "number")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SBNumber extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "SBNumber")
    private Long number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SBNumber{" +
            "id=" + id +
            ", SBNumber=" + number +
            '}';
    }

    public static SBNumber create(Long number) {
        SBNumber n = new SBNumber();
        n.setNumber(number);
        return n;
    }
}
