package com.stackroute.Muzix.repository;


import com.stackroute.Muzix.domain.Track;
//import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

    @Repository

        public interface TrackRepository extends MongoRepository<Track,Integer>{


}