package com.team4project.sample.service;

import com.team4project.sample.dto.PageRequestDTO;
import com.team4project.sample.dto.PageResponseDTO;
import com.team4project.sample.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);

}
