package gic.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gic.dto.AccountDto;
import gic.mapper.AccountMapper;

@Repository
public class AccountDao {
	@Autowired	
	private AccountMapper accountMapper;	
		
	public List<AccountDto> getAccList() {
		return accountMapper.getAccList();
	}	

}
