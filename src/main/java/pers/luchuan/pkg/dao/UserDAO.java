package pers.luchuan.pkg.dao;

import pers.luchuan.pkg.domain.UserDO;

import java.util.List;

/**
 * Created By Lu Chuan On 2019/12/4
 */
public interface UserDAO {
	int insert(UserDO userDO);
	
	int insertBatch(List<UserDO> list);
	
	int delete(UserDO userDO);
	
	int deleteBatch(List<UserDO> list);
	
	long count();
	
	List<UserDO> list();
	
	UserDO get(String identityId);
}
