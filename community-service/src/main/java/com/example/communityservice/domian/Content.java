package com.example.communityservice.domian;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Embeddable
@Data
public class Content {

    private String content;

    public Content(String content){
        if(content == null || content.isEmpty()){
            throw new IllegalArgumentException("내용은 반드시 입력되어야 합니다.");
        }
        this.content = content;
    }

    public Content() {
    }

}
