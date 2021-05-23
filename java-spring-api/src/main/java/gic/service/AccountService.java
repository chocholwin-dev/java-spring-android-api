package gic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gic.dao.AccountDao;
import gic.dto.AccountDto;

@Service
public class AccountService {
	
	@Autowired	
	private AccountDao accountDao;	
		
	public List<AccountDto> getAccList() {	
		return accountDao.getAccList();
	}	

}
