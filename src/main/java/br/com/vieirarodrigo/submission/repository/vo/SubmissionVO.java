package br.com.vieirarodrigo.submission.repository.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "SUBMISSION")
public class SubmissionVO implements Serializable {
	public static final long serialVersionUID = 1L;
	@Id
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "CHALLENGE_ID")
	private int challengeId;
	private double score;
	@Column(name = "CREATED_AT")
	private Date created;
}