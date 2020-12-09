package br.com.vieirarodrigo.submission.business.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.submission.DTO.SubmissionDTO;
import br.com.vieirarodrigo.submission.repository.SubmissionRepository;
import br.com.vieirarodrigo.submission.repository.vo.SubmissionVO;

@Component
public class SubmissionBO {
	@Autowired
	private SubmissionRepository repository;
	public SubmissionVO save(SubmissionDTO submission) {
		return repository.save(SubmissionVO.builder()
				.userId(submission.getUserId())
				.challengeId(submission.getChallengeId())
				.score(submission.getScore())
				.created(submission.getCreated())
				.build());
	}
	public SubmissionVO findHigherScoreByChallengeId(int challengeId) {
		return repository.findHigherScoreByChallengeId(challengeId);
	}
	public SubmissionVO findByChallegeIdAndAccelerationId(int challengeId, int accelerationId) {
		return repository.findByChallegeIdAndAccelerationId(challengeId, accelerationId);
	}
}