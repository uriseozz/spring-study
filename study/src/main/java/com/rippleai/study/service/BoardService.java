package com.rippleai.study.service;

import com.rippleai.study.domain.Board;
import com.rippleai.study.dto.BoardDto;
import com.rippleai.study.repository.BoardRepository;
import com.rippleai.study.utils.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final S3Uploader s3Uploader;


    @Transactional
    public void saveBoard(
            BoardDto.RequestDto requestDto,
            MultipartFile multipartFile
    ) throws IOException {
        String imgUrl = s3Uploader.upload(multipartFile, "static");

        // 이미지 첨부 있으면 URL 에 S3에 업로드된 파일 url 저장
//        if (multipartFile.getSize() != 0) {
//            imgUrl = s3Uploader.upload(multipartFile, imageDirName);
//        }

        Board board = Board.builder()
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
                .image(imgUrl)
                .category(requestDto.getCategory())
                .build();

        boardRepository.save(board);
    }

    @Transactional
    public List<BoardDto.ResponseDto> articleList() {
        List<BoardDto.ResponseDto> boardResponseDtoList = new ArrayList<>();
        List<Board> boardList = boardRepository.findAllByOrderByModifiedAtDesc();
        for(Board board : boardList) {
            BoardDto.ResponseDto boardResponseDto = BoardDto.ResponseDto.builder()
                    .title(board.getTitle())
                    .content(board.getContent())
                    .image(board.getImage())
                    .category(board.getCategory())
                    .build();
            boardResponseDtoList.add(boardResponseDto);
        }
        return boardResponseDtoList;
    }
}
