package com.example.communityservice.domian;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;


@Getter
@Embeddable
public class Title {

    private String title;


    public Title() {

    }

    public Title(String title) {

        if(title == null || title.isEmpty()) {
            throw new IllegalArgumentException("제목은 반드시 추가되어야 합니다.");
        }

        this.title = title;
    }

}

/**
 * 비즈니스 규칙 캡슐화
 * 제목은 반드시 존재해야하는 규칙을 로직으로 정해줌
 */