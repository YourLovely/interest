package com.interest.model.response;

import com.interest.model.entity.ArticleCommentEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ArticleReplyCommentResponse {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("文章id")
    private Integer articleid;

    @ApiModelProperty("用户id")
    private Integer userid;

    @ApiModelProperty("父级id")
    private Integer parentid;

    @ApiModelProperty("评论")
    private String comment;

    @ApiModelProperty("评论时间")
    private String createTime;

    @ApiModelProperty("回复评论人id")
    private Integer replierId;

    @ApiModelProperty("回复评论人的姓名")
    private String replierName;

    private String userName;

    private String userHeadImg;

}
