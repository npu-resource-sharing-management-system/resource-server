package edu.npu.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record AddCarpoolingDto(

    @NotNull
    String arrivePoint,
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date arriveTime,
    @NotNull
    Date departurePoint,
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date departureTime,
    @NotNull
    String description,
    @NotNull
    Integer leftPassengerNo,
    @NotNull
    String passingPoint,
    @NotNull
    Integer price,
    @NotNull
    Integer totalPassengerNo
) {
}
