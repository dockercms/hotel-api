package com.platform.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LotteryConfigVO implements Serializable {
    private static final  long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String logo;
    private String url;
}
