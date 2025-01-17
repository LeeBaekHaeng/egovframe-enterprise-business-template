package egovframework.let.sym.ccm.cde.service.impl;

import java.util.List;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.let.sym.ccm.cde.service.CmmnDetailCodeVO;
import egovframework.let.sym.ccm.cde.service.EgovCcmCmmnDetailCodeManageService;
import lombok.RequiredArgsConstructor;

/**
 *
 * 공통상세코드에 대한 서비스 구현클래스를 정의한다
 * 
 * @author 공통서비스 개발팀 이중호
 * @since 2009.04.01
 * @version 1.0
 * @see
 *
 *      <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.04.01  이중호          최초 생성
 *   2011.08.31  JJY           경량환경 템플릿 커스터마이징버전 생성
 *   2024.09.29  이백행          컨트리뷰션 롬복 생성자 기반 종속성 주입
 *
 *      </pre>
 */
@Service
@RequiredArgsConstructor
public class EgovCcmCmmnDetailCodeManageServiceImpl extends EgovAbstractServiceImpl
		implements EgovCcmCmmnDetailCodeManageService {

	private final CmmnDetailCodeManageDAO cmmnDetailCodeManageDAO;

	/**
	 * 공통상세코드를 삭제한다.
	 */
	@Override
	public void deleteCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
		cmmnDetailCodeManageDAO.deleteCmmnDetailCode(cmmnDetailCode);
	}

	/**
	 * 공통상세코드를 등록한다.
	 */
	@Override
	public void insertCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
		cmmnDetailCodeManageDAO.insertCmmnDetailCode(cmmnDetailCode);
	}

	/**
	 * 공통상세코드 상세항목을 조회한다.
	 */
	@Override
	public CmmnDetailCode selectCmmnDetailCodeDetail(CmmnDetailCode cmmnDetailCode) throws Exception {
		CmmnDetailCode ret = cmmnDetailCodeManageDAO.selectCmmnDetailCodeDetail(cmmnDetailCode);
		return ret;
	}

	/**
	 * 공통상세코드 목록을 조회한다.
	 */
	@Override
	public List<?> selectCmmnDetailCodeList(CmmnDetailCodeVO searchVO) throws Exception {
		return cmmnDetailCodeManageDAO.selectCmmnDetailCodeList(searchVO);
	}

	/**
	 * 공통상세코드 총 갯수를 조회한다.
	 */
	@Override
	public int selectCmmnDetailCodeListTotCnt(CmmnDetailCodeVO searchVO) throws Exception {
		return cmmnDetailCodeManageDAO.selectCmmnDetailCodeListTotCnt(searchVO);
	}

	/**
	 * 공통상세코드를 수정한다.
	 */
	@Override
	public void updateCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
		cmmnDetailCodeManageDAO.updateCmmnDetailCode(cmmnDetailCode);
	}

}
