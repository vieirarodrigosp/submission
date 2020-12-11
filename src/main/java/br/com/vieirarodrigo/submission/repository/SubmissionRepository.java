package br.com.vieirarodrigo.submission.repository;

import org.bouncycastle.asn1.cmp.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.submission.repository.vo.SubmissionVO;

@Repository
public interface SubmissionRepository<accelerationId> extends JpaRepository<SubmissionVO, Challenge> {
	SubmissionVO findHigherScoreByChallengeId(int challengeId);
	SubmissionVO findByChallegeIdAndAccelerationId(int challengeId, int accelerationId);
}