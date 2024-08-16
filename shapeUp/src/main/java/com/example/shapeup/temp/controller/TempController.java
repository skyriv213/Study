package com.example.shapeup.temp.controller;

import com.example.shapeup.temp.dto.TempResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

  @GetMapping("/")
  public ResponseEntity index(){
    return ResponseEntity.ok(TempResponseDto.builder().message("hi").build());
  }

}
