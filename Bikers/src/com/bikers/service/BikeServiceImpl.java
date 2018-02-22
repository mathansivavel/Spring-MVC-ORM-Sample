package com.bikers.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bike.entity.BikeEntity;
import com.bikers.dao.BikeDao;
@Service("BikeService")
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeDao b;
	
	@Transactional
	public void saveBike(BikeEntity bike) {
		
		b.saveBike(bike);
	}

	public BikeEntity dispBike(String s) {
		
		return b.dispBike(s);
	}



	
	
}
