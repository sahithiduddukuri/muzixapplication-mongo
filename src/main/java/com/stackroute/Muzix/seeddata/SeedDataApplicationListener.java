package com.stackroute.Muzix.seeddata;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
@Configuration
public class SeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private TrackRepository trackRepository;
    @Autowired
    public SeedDataApplicationListener(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Track track1=Track.builder().name("sahi").comment("apple").build();
        trackRepository.save(track1);
       // Track track2=Track.builder().name("ammu").comment("bab").build();
        //trackRepository.save(track2);
    }
}


