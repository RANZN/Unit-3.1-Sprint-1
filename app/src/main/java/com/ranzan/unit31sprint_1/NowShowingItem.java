package com.ranzan.unit31sprint_1;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NowShowingItem{

	@SerializedName("year")
	private String year;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("imdbRating")
	private Double imdbRating;

	@SerializedName("title")
	private String title;

	@SerializedName("duration")
	private String duration;

	@SerializedName("actors")
	private List<String> actors;

	@SerializedName("video_url")
	private String videoUrl;

	@SerializedName("posterurl")
	private String posterurl;

	@SerializedName("originalTitle")
	private String originalTitle;

	@SerializedName("averageRating")
	private Integer averageRating;

	@SerializedName("storyline")
	private String storyline;

	@SerializedName("contentRating")
	private String contentRating;

	@SerializedName("id")
	private String id;

	public String getYear(){
		return year;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public Double getImdbRating(){
		return imdbRating;
	}

	public String getTitle(){
		return title;
	}

	public String getDuration(){
		return duration;
	}

	public List<String> getActors(){
		return actors;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public String getPosterurl(){
		return posterurl;
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

	public String getId(){
		return id;
	}
}