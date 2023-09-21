package com.xworkz.instagram_influencers;

import com.xworkz.instagram_influencers.influencer.Influencer;
import com.xworkz.instagram_influencers.instagram.Instagram;

public class InstagramInfluencerTester {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Influencer influencer = new Influencer();
        instagram.influencer = influencer;
    }
}
