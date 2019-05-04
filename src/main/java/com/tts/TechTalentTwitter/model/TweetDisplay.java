package com.tts.TechTalentTwitter.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
   
	@Getter
	@Setter
	private User user;	
	@Getter
	@Setter
    private String message;
	@Getter
	@Setter
    private String date;
	@Getter
	@Setter
    private List<Tag> tags;
}
