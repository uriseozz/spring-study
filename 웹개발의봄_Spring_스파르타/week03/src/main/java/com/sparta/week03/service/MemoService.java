package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;
    //업데이트를 위한 필요한 정보 찾아야 하는 repository

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow (
                () ->new NullPointerException("아이디가 존재하지 않습니다")
        );
        memo.update(requestDto);
        return id;
    }
}
