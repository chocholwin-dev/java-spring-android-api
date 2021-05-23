package gic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import gic.dto.AccountDto;
import gic.service.AccountService;

@RestController		
public class AccountListController {		
		
	@Autowired
	AccountService accService;

	@GetMapping("/getAccList")
	public List<AccountDto> init() {
		// データベースから全てのAccountを取得する。
		List<AccountDto> list = accService.getAccList();
		return list;
	}	
}		
