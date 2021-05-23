package gic.dto;

public class AccountDto {
	int id;	
	String name;	
	String role;	
	int update_flg;	
	int delete_flg;	
		
	public int getId() {	
		return id;
	}	
		
	public void setId(int id) {	
		this.id = id;
	}	
		
	public String getName() {	
		return name;
	}	
		
	public void setName(String name) {	
		this.name = name;
	}	
		
	public String getRole() {	
		return role;
	}	
		
	public void setRole(String role) {	
		this.role = role;
	}	
		
	public int getUpdate_flg() {	
		return update_flg;
	}	
		
	public void setUpdate_flg(int update_flg) {	
		this.update_flg = update_flg;
	}	
		
	public int getDelete_flg() {	
		return delete_flg;
	}	
		
	public void setDelete_flg(int delete_flg) {	
		this.delete_flg = delete_flg;
	}	

}
