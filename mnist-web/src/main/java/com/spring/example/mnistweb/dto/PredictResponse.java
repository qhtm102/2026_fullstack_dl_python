package com.spring.example.mnistweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

// record : 읽기 전용(변수가 final -> 수정 불가) 약식 DTO : 데이터 전달용 으로 최적
public record PredictResponse(

        // @JsonProperty : JSON 으로 변환할 때 사용할 이름
        @JsonProperty("class_name") String className,
        @JsonProperty("class_id")   int classId,
        @JsonProperty("confidence") double confidence,
        @JsonProperty("all_scores") Map<String, Double> allScores
) {}