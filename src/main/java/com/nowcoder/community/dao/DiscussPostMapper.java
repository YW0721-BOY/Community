package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    public List<DiscussPost> selectDiscussPost(int userId,int offset ,int limit);

    public int selectDiscussPostRow(int userId);
}
