package com.gentech.post.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_videoposts")
public class VideoPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posted_id")
	private Long postedId;
	@Column(name = "video_title")
	private String title;
	@Column(name = "video_type")
	private String type;
	@Column(name = "video_desc")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_comment_id", referencedColumnName = "posted_id")
	List<Comment> comments=new ArrayList<>();
	
	public VideoPost() {
		
	}
	
	public VideoPost(String title, String type, String description) {
		super();
		this.title = title;
		this.type = type;
		this.description = description;
	}
	public Long getPostedId() {
		return postedId;
	}
	public void setPostedId(Long postedId) {
		this.postedId = postedId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
