package com.ranzan.unit31sprint_1;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("coming_soon")
	private List<ComingSoonItem> comingSoon;

	@SerializedName("now_showing")
	private List<NowShowingItem> nowShowing;

	public List<ComingSoonItem> getComingSoon(){
		return comingSoon;
	}

	public List<NowShowingItem> getNowShowing(){
		return nowShowing;
	}
}