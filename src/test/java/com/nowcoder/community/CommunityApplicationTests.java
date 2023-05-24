package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	private DiscussPostMapper discussPostMapper;

	@Autowired
	private UserService userService;

	@Autowired UserMapper userMapper;

	@Test
	void selectDiscussPost(){
		List<DiscussPost>result=discussPostMapper.selectDiscussPost(149,0,10);
		for (DiscussPost discussPost : result) {
			System.out.println(discussPost);
		}
		int row =discussPostMapper.selectDiscussPostRow(149);
		System.out.println(row);
	}

	@Test
	void selectUser(){
		User user=userService.findUserById(149);
		System.out.println(user.toString());

//		User user =userMapper.selectUserById(149);
//		System.out.println(user.toString());
	}

}
