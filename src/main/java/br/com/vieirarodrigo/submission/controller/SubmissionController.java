package br.com.vieirarodrigo.submission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.submission.DTO.SubmissionDTO;
import br.com.vieirarodrigo.submission.business.object.SubmissionBO;
import br.com.vieirarodrigo.submission.repository.vo.SubmissionVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class SubmissionController {
	@Autowired
	private SubmissionBO SubmissionBO;
	@ApiOperation(value="This service creates a new Submission in the database.")
	@PostMapping(path = "/v1/submissions")
	public @ResponseBody SubmissionVO save(@RequestBody SubmissionDTO Submission) {
		return SubmissionBO.save(Submission);
	}
	@ApiOperation(value="This Service fetches the Submission from the database by challengeId.")
	@GetMapping(path = "/v1/submissions/challenges/{challengeId}")
	public @ResponseBody SubmissionVO findHigherScoreByChallengeId(@PathVariable int challengeId) {
		return SubmissionBO.findHigherScoreByChallengeId(challengeId);
	}
	@ApiOperation(value="This Service fetches the Submission from the database by challengeId and accelerationId.")
	@GetMapping(path = "/v1/submissions/challenges/{challengeId}/accelerationId/{accelerationId}")
	public @ResponseBody SubmissionVO findByChallegeIdAndAccelerationId(
			@PathVariable int challengeId
			, @PathVariable int accelerationId) {
		return SubmissionBO.findByChallegeIdAndAccelerationId(challengeId, accelerationId);
	}
}
