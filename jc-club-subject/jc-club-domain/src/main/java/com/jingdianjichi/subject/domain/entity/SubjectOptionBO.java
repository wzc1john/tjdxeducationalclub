package com.jingdianjichi.subject.domain.entity;

import com.jingdianjichi.subject.common.entity.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目dto
 *
 * @author: ChickenWing
 * @date: 2023/10/5
 */
@Data
public class SubjectOptionBO implements Serializable {

    /**
     * 题目答案
     */
    private String subjectAnswer;

    /**
     * 答案选项
     */
    private List<SubjectAnswerBO> optionList;

}

