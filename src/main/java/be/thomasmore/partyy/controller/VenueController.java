package be.thomasmore.partyy.controller;

import be.thomasmore.partyy.model.Venue;
import org.springframework.web.bind.annotation.GetMapping;

public class VenueController {
    @GetMapping("/venuedetails")
    public String venue(Venue venue) {
        return null;
    }

}
