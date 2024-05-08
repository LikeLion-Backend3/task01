package org.example.hw01.controller;

import org.example.hw01.data.dto.request.ChangeNameRequestDto;
import org.example.hw01.data.dto.request.RequestBabyLionDto;
import org.example.hw01.data.dto.response.ResponseBabyLionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.hw01.service.BabyLionService;

@RestController
@RequestMapping("/api/v1/baby-lion")

public class BabyLionController {
    private final BabyLionService babyLionService;


    @Autowired
    public BabyLionController(BabyLionService babyLionService) {
        this.babyLionService = babyLionService;
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseBabyLionDto> getBabyLion(@RequestParam String email) throws Exception {
        ResponseBabyLionDto responseBabyLionDto = babyLionService.getBabyLion(email);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseBabyLionDto> createBabyLion(@RequestBody RequestBabyLionDto requestBabyLionDto){
        ResponseBabyLionDto responseBabyLionDto = babyLionService.saveBabyLion(requestBabyLionDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }
    @PutMapping("/put")
    public ResponseEntity<ResponseBabyLionDto> changeBabyLionName(@RequestBody ChangeNameRequestDto changeNameRequestDto) throws Exception {
        ResponseBabyLionDto responseBabyLionDto = babyLionService.changeBabyLionName(changeNameRequestDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBabyLion(String email) throws Exception {
        babyLionService.deleteBabyLion(email);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
