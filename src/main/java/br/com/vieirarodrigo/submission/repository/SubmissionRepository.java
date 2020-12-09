package br.com.vieirarodrigo.submission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.submission.repository.vo.SubmissionVO;

@Repository
public interface SubmissionRepository extends JpaRepository<SubmissionVO, Integer>{
	SubmissionVO findHigherScoreByChallengeId(int challengeId);
	SubmissionVO findByChallegeIdAndAccelerationId(int challengeId, int accelerationId);
}