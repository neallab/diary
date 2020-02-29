package com.diary.neallab.memo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Memo {

    @Id
    @GeneratedValue
    private long ID;

    @Column(length = 500, nullable = false)
    private String SUBJECT;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String CONTENTS;


    @Builder
    public Memo(String title, String content) {
        this.SUBJECT = title;
        this.CONTENTS = content;
    }
}
