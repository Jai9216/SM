package com.sm.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
	
	private Integer id;
	private String username;
	private String name;
	private String email;
	private String userImage;

}
