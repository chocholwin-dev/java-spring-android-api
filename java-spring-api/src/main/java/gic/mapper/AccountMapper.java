package gic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gic.dto.AccountDto;

@Mapper
public interface AccountMapper {
	List<AccountDto> getAccList();
}
