package com.rippleai.study.dto;

import lombok.*;


@NoArgsConstructor
public class BoardDto {

    @Data
    public static class RequestDto{
        private String title;
        private String content;
        private String category;
    }

    public static class ResponseDto{
        private String title;
        private String content;
        private String image;
        private String category;

        @Builder
        public ResponseDto(String title, String content, String image, String category) {
            this.title = title;
            this.content = content;
            this.image = image;
            this.category = category;
        }
    }
}
