package com.ranzan.unit31sprint_1;

import com.google.gson.annotations.SerializedName;

public class ComingSoonItem{

	@SerializedName("duration")
	private String duration;

	@SerializedName("video_url")
	private String videoUrl;

	@SerializedName("posterurl")
	private String posterurl;

	@SerializedName("year")
	private String year;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("originalTitle")
	private String originalTitle;

	@SerializedName("averageRating")
	private Integer averageRating;

	@SerializedName("storyline")
	private String storyline;

	@SerializedName("contentRating")
	private String contentRating;

	@SerializedName("imdbRating")
	private String imdbRating;

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	public String getDuration(){
		return duration;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public String getPosterurl(){
		return posterurl;
	}

	public String getYear(){
		return year;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public Integer getAverageRating(){
		return averageRating;
	}

	public String getStoryline(){
		return storyline;
	}

	public String getContentRating(){
		return contentRating;
	}

	public String getImdbRating(){
		return imdbRating;
	}

	public String getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}