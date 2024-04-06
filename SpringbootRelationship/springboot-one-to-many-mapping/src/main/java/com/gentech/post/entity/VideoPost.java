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
@Table(name="tbl_video_posts")
public class VideoPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vedio_posted_Id")
  private Long postedId;
	
	@Column(name="vedio_title")
  private String title;
	
	@Column(name="vedio_type")
  private String type;
	
	@Column(name="vedio_description")
  private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
//	   vedio_posted_id reference name
	@JoinColumn(name="post_comment_id", referencedColumnName = "vedio_posted_Id")
	// comment class  name
	List<Comment> comments = new ArrayList<>();

	public VideoPost(Long postedId, String title, String type, String description) {
		super();
		this.postedId = postedId;
		this.title = title;
		this.type = type;
		this.description = description;
	}

	public VideoPost(String title, String type, String description) {
		super();
		this.title = title;
		this.type = type;
		this.description = description;
	}
	public VideoPost() {
		
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
