package com.example.demo;

import com.example.demo.controller.dto.MobilePhoneDto;
import com.example.demo.entites.MobilePhone;
import com.example.demo.mapper.MobilePhoneMapper;

public class MobilePhoneMapperImpl implements MobilePhoneMapper {

	@Override
	public MobilePhoneDto convertToDto(MobilePhone mobilePhone) {
		// TODO Auto-generated method stub
		MobilePhoneDto mpd=new MobilePhoneDto();
		return mpd;
	}

	@Override
	public MobilePhone convertToEntity(MobilePhoneDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
