//package com.stackroute.Muzix.seeddata;
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SeedDataCommandLineRunner implements CommandLineRunner {
//
//    private TrackRepository trackRepository;
//
//    @Autowired
//    public SeedDataCommandLineRunner(TrackRepository trackRepository)
//    {
//        this.trackRepository=trackRepository;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//
//        Track track1 = Track.builder().name("sahi").comment("apple").build();
//        trackRepository.save(track1);
//
//
//    }
//}