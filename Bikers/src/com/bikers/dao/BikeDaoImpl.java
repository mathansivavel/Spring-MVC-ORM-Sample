package com.bikers.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.entity.BikeEntity;


@Repository("Dao")
public class BikeDaoImpl implements BikeDao {

	@Autowired
	SessionFactory sf;
	
	
	public void saveBike(BikeEntity bike) {
		
		Session ses=sf.openSession();
		

		System.out.println("------Db Created");
	 ses.close();
	}


	public BikeEntity dispBike(String s) {
		
		Session ss=sf.openSession();
		BikeEntity bike=ss.get(BikeEntity.class, s);
		
		return bike;
	}

	

}
