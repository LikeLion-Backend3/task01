package org.example.hw01.service;

import org.example.hw01.data.dto.request.ChangeNameRequestDto;
import org.example.hw01.data.dto.request.RequestBabyLionDto;
import org.example.hw01.data.dto.response.ResponseBabyLionDto;

public interface BabyLionService {
    ResponseBabyLionDto getBabyLion(String email) throws Exception;

    ResponseBabyLionDto saveBabyLion(RequestBabyLionDto requestBabyLionDto);

    ResponseBabyLionDto changeBabyLionName(ChangeNameRequestDto changeNameRequestDto) throws Exception;

    void deleteBabyLion(String email) throws Exception;
}
