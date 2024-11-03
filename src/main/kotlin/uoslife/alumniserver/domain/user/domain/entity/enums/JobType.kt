package uoslife.alumniserver.domain.user.domain.entity.enums

enum class JobType {
    // 금융&전문직
    FINANCIAL_SERVICE, // 금융 서비스
    LEGAL_OR_LABOR, // 법무 및 노무
    FINANCE_OR_ACCOUNT, // 재무 및 회계
    PROFESSIONAL, // 전문직
    OTHER_FINANCIAL, // 기타 금융 및 전문직

    // 경영&기획
    MANAGEMENT_OR_BUSINESS_OR_STRATEGY, // 경영, 사업 및 전략 기획
    SERVICE_PLANNING_OR_UXUI, // 서비스 기획 및 UX/UI
    MARKETING_OR_MD, // 마케팅 및 MD
    PROMOTION_OR_EXTERNAL_COOPERATION, // 홍보 및 대외 협력
    OTHER_MANAGEMENT, // 기타 경영 및 기획 관련 직군

    // 제조&생산
    QUALITY_CONTROL_OR_OAQC, // 품질 관리 및 OAQC
    PRODUCTION_OR_QUALITY_OR_PRODUCTION_MANAGEMENT, // 생산, 품질 및 제조 관리
    RESEARCH_OR_DESIGN, // 연구 및 설계
    OTHER_MANUFACTURING, // 기타 제조 및 생산 관련 직군

    // 영업&무역
    OVERSEAS_SALES_OR_TRADE, // 해외 영업 및 무역
    DISTRIBUTION, // 유통
    SALES_SALES_MANAGEMENT, // 영업 및 영업 관리
    OTHER_SALES, // 기타 영업 및 무역 관련 직군

    // 인사&컨설팅
    COUNSELING_CONSULTING, // 상담 및 컨설팅
    HR_GENERAL_AFFAIRS, // 인사 및 총무
    OTHER_HR, // 기타 인사 및 컨설팅 관련 직군

    // IT&인터넷
    WEB_APP_DEVELOPMENT, // 웹 및 앱 개발
    DATA_ANALYSIS, // 데이터 분석
    BIGDATA_AI_ALGORITHM, // 빅데이터, AI 및 알고리즘
    DB_MANAGEMENT_OPERATIONS, // DB 관리 및 운영
    SECURITY_TESTER_VERIFICATION, // 보안, 테스터 및 검증
    OTHER_IT, // 기타 IT 및 인터넷 관련 직군

    // 미디어
    MEDIA, // 언론
    BROADCAST_CONTENT, // 방송 및 콘텐츠
    OTHER_MEDIA, // 기타 미디어 관련 직군

    // 공공&정치
    PUBLIC_SERVANT_NONPROFIT, // 공무원 및 비영리 단체
    PUBLIC_CORPORATION, // 공사 및 공기업
    POLITICIAN, // 정치인
    OTHER_PUBLIC, // 기타 공공 및 정치 관련 직군

    // 예술&문화
    DESIGN_ART, // 디자인 및 예술
    WRITER_PUBLISHING, // 작가 및 출판업
    ART_PLANNING_CULTURE, // 예술 기획 및 문화 관련
    OTHER_ART_CULTURE, // 기타 예술 및 문화 관련 직군

    // 조사&분석
    RESEARCH, // 리서치
    RESEARCHER, // 연구원
    OTHER_RESEARCH, // 기타 조사 및 분석 관련 직군

    // 창업&기타
    STARTUP, // 창업
    OTHER_STARTUP, // 기타 창업 관련 직군
}