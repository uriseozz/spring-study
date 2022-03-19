package com.rippleai.study.controller;

import com.rippleai.study.dto.BoardDto;
import com.rippleai.study.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/article")
    public String createArticle(@RequestPart(value = "data") BoardDto.RequestDto requestDto,
                                @RequestPart(value = "image",required = false) MultipartFile multipartFile
    ) throws IOException {
        boardService.saveBoard(requestDto, multipartFile);
        return "기사 작성 완료!";
    }

    @GetMapping("/article")
    public List<BoardDto.ResponseDto> getArticle(){
        return boardService.articleList();
    }
}
