package com.bikers.service;

import com.bike.entity.BikeEntity;

public interface BikeService {

	void saveBike(BikeEntity bike);
	BikeEntity dispBike(String s);
	
}