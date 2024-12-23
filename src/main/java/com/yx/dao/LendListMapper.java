package com.yx.dao;

import com.yx.po.LendList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LendListMapper {
    void deleteByPrimaryKey(Integer id);
    void insert(LendList record);
    void insertSelective(LendList record);
    LendList selectByPrimaryKey(Integer id);
    void updateByPrimaryKeySelective(LendList record);
    void updateByPrimaryKey(LendList record);
    List<LendList> queryLendListAll(LendList lendList);
    List<LendList> queryLookBookList(@Param("rid") Integer rid, @Param("bid") Integer bid);

    /**
     * 还书操作(正常还)
     */
    void updateLendListSubmit(LendList lendList);

}