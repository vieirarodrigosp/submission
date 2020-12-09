package br.com.vieirarodrigo.submission.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SubmissionDTO {
	private int userId;
	private int challengeId;
	private double score;
	private Date created;
}