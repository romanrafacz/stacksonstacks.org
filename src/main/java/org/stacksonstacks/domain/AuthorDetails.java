package org.stacksonstacks.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_details")
public class AuthorDetails {

	@Id
	@Column(name="author_details_id")
	private Integer authorId;
	
	@Column(name="author_details_email")
	private String email;
	
	@Column(name="author_bio")
	private String authorBio;
	
	public void AuthorDetails() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public String getAuthorBio() {
		return authorBio;
	}

	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}
	
}
