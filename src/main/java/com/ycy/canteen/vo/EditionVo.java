package com.ycy.canteen.vo;

import com.ycy.canteen.entities.PostEntity;
import lombok.Data;

@Data
public class EditionVo implements PostEntity {

    private String id;

    private String code;

    private String name;


}
