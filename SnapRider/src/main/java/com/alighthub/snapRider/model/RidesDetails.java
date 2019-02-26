package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RidesDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ridesDetailsId;
	
	private String rediesDetailsVideo;
	
	private String ridesDetailsImages;

	public int getRidesDetailsId() {
		return ridesDetailsId;
	}

	public void setRidesDetailsId(int ridesDetailsId) {
		this.ridesDetailsId = ridesDetailsId;
	}

	public String getRediesDetailsVideo() {
		return rediesDetailsVideo;
	}

	public void setRediesDetailsVideo(String rediesDetailsVideo) {
		this.rediesDetailsVideo = rediesDetailsVideo;
	}

	public String getRidesDetailsImages() {
		return ridesDetailsImages;
	}

	public void setRidesDetailsImages(String ridesDetailsImages) {
		this.ridesDetailsImages = ridesDetailsImages;
	}
}
