package com.jingdianjichi.practice.server.dao;

import com.jingdianjichi.practice.server.entity.po.SubjectJudgePO;

public interface SubjectJudgeDao {


    SubjectJudgePO selectBySubjectId(Long repeatSubjectId);


}