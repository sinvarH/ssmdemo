package sinvar.demo.serviceimp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sinvar.demo.dao.UserMapper;
import sinvar.demo.pojo.User;
import sinvar.demo.service.UserService;

@Service("userService")  
public class UserServiceImp implements UserService{
	@Resource  
    private UserMapper userDao;

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	

   
}
