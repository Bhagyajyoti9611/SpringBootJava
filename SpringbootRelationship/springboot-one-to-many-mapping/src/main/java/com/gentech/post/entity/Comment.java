package com.gentech.post.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;

@Entity
@Table(name="tbl_vedio_comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_Id")
     private Long commentId;
	
	@Column(name="comment_type")
     private String commentType;
	
	@Column(name="comment_desc")
     private String description;
	
	
	public Comment(Long commentId, String commentType, String description) {
		super();
		this.commentId = commentId;
		this.commentType = commentType;
		this.description = description;
	}

	public Comment(String commentType, String description) {
		super();
		this.commentType = commentType;
		this.description = description;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Comment()
	{
		
	}
	
	
	
}
