package uoslife.alumniserver.domain.user.domain.entity.enums

// security ROLE에 대한 임시 권한 설정
// TODO: Security config의 hasRole 설정 필요
// 참고 : https://velog.io/@goat_hoon/Spring-Security-%EC%9C%A0%EC%A0%80%EC%9D%98-ROLE%EB%B3%84%EB%A1%9C-Authority-%EA%B6%8C%ED%95%9C-%EB%B6%80%EC%97%AC%ED%95%98%EA%B8%B0
enum class RoleType {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER")
}