package com.platform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoneUserDO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer teamId;
    private Integer counts;
}
