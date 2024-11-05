package com.team4project.sample.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract public class BaseEntity {
    @CreationTimestamp
    @Column(name="regdate", updatable = false)
    private LocalDateTime regDate;

    @UpdateTimestamp
    @Column(name="moddate")
    private LocalDateTime modDate;

}
