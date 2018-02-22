package com.bikers.dao;



import com.bike.entity.BikeEntity;

public interface BikeDao {
	
	void saveBike(BikeEntity bike);
	BikeEntity dispBike(String s);
	
}